package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The stretched picture fill. The page or page element is filled entirely
  * with the specified picture. The picture is stretched to fit its container.
  */
@js.native
trait SchemaStretchedPictureFill extends js.Object {
  
  /**
    * Reading the content_url:  An URL to a picture with a default lifetime of
    * 30 minutes. This URL is tagged with the account of the requester. Anyone
    * with the URL effectively accesses the picture as the original requester.
    * Access to the picture may be lost if the presentation&#39;s sharing
    * settings change.  Writing the content_url:  The picture is fetched once
    * at insertion time and a copy is stored for display inside the
    * presentation. Pictures must be less than 50MB in size, cannot exceed 25
    * megapixels, and must be in one of PNG, JPEG, or GIF format.  The provided
    * URL can be at most 2 kB in length.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * The original size of the picture fill. This field is read-only.
    */
  var size: js.UndefOr[SchemaSize] = js.native
}
object SchemaStretchedPictureFill {
  
  @scala.inline
  def apply(): SchemaStretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStretchedPictureFill]
  }
  
  @scala.inline
  implicit class SchemaStretchedPictureFillOps[Self <: SchemaStretchedPictureFill] (val x: Self) extends AnyVal {
    
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
