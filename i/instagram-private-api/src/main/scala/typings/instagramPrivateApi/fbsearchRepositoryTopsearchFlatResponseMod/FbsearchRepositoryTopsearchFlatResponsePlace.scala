package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FbsearchRepositoryTopsearchFlatResponsePlace extends js.Object {
  
  var header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia = js.native
  
  var location: FbsearchRepositoryTopsearchFlatResponseLocation = js.native
  
  var media_bundles: js.Array[_] = js.native
  
  var subtitle: String = js.native
  
  var title: String = js.native
}
object FbsearchRepositoryTopsearchFlatResponsePlace {
  
  @scala.inline
  def apply(
    header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia,
    location: FbsearchRepositoryTopsearchFlatResponseLocation,
    media_bundles: js.Array[_],
    subtitle: String,
    title: String
  ): FbsearchRepositoryTopsearchFlatResponsePlace = {
    val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponsePlace]
  }
  
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponsePlaceOps[Self <: FbsearchRepositoryTopsearchFlatResponsePlace] (val x: Self) extends AnyVal {
    
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
    def setHeader_media(value: FbsearchRepositoryTopsearchFlatResponseHeaderMedia): Self = this.set("header_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: FbsearchRepositoryTopsearchFlatResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_bundlesVarargs(value: js.Any*): Self = this.set("media_bundles", js.Array(value :_*))
    
    @scala.inline
    def setMedia_bundles(value: js.Array[_]): Self = this.set("media_bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
