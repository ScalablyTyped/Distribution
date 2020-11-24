package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FbsearchRepositoryTopsearchFlatResponseHashtag extends js.Object {
  
  var id: String = js.native
  
  var media_count: Double = js.native
  
  var name: String = js.native
  
  var profile_pic_url: String = js.native
  
  var search_result_subtitle: String = js.native
}
object FbsearchRepositoryTopsearchFlatResponseHashtag {
  
  @scala.inline
  def apply(
    id: String,
    media_count: Double,
    name: String,
    profile_pic_url: String,
    search_result_subtitle: String
  ): FbsearchRepositoryTopsearchFlatResponseHashtag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseHashtag]
  }
  
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponseHashtagOps[Self <: FbsearchRepositoryTopsearchFlatResponseHashtag] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_result_subtitle(value: String): Self = this.set("search_result_subtitle", value.asInstanceOf[js.Any])
  }
}
