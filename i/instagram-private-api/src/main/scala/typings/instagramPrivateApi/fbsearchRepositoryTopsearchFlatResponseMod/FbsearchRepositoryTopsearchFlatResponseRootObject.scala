package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FbsearchRepositoryTopsearchFlatResponseRootObject extends js.Object {
  
  var clear_client_cache: Boolean = js.native
  
  var has_more: Boolean = js.native
  
  var list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem] = js.native
  
  var rank_token: String = js.native
  
  var status: String = js.native
}
object FbsearchRepositoryTopsearchFlatResponseRootObject {
  
  @scala.inline
  def apply(
    clear_client_cache: Boolean,
    has_more: Boolean,
    list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem],
    rank_token: String,
    status: String
  ): FbsearchRepositoryTopsearchFlatResponseRootObject = {
    val __obj = js.Dynamic.literal(clear_client_cache = clear_client_cache.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseRootObject]
  }
  
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponseRootObjectOps[Self <: FbsearchRepositoryTopsearchFlatResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear_client_cache(value: Boolean): Self = this.set("clear_client_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more(value: Boolean): Self = this.set("has_more", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: FbsearchRepositoryTopsearchFlatResponseListItem*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank_token(value: String): Self = this.set("rank_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
