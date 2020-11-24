package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FbsearchRepositoryTopsearchFlatResponseListItem extends js.Object {
  
  var hashtag: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseHashtag] = js.native
  
  var place: js.UndefOr[FbsearchRepositoryTopsearchFlatResponsePlace] = js.native
  
  var position: Double = js.native
  
  var user: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseUser] = js.native
}
object FbsearchRepositoryTopsearchFlatResponseListItem {
  
  @scala.inline
  def apply(position: Double): FbsearchRepositoryTopsearchFlatResponseListItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseListItem]
  }
  
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponseListItemOps[Self <: FbsearchRepositoryTopsearchFlatResponseListItem] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtag(value: FbsearchRepositoryTopsearchFlatResponseHashtag): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setPlace(value: FbsearchRepositoryTopsearchFlatResponsePlace): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
    
    @scala.inline
    def setUser(value: FbsearchRepositoryTopsearchFlatResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
