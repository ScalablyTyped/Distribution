package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Photo object in Directory API.
  */
@js.native
trait SchemaUserPhoto extends js.Object {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Height in pixels of the photo
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Mime Type of the photo
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Base64 encoded photo data
    */
  var photoData: js.UndefOr[String] = js.native
  
  /**
    * Primary email of User (Read-only)
    */
  var primaryEmail: js.UndefOr[String] = js.native
  
  /**
    * Width in pixels of the photo
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaUserPhoto {
  
  @scala.inline
  def apply(): SchemaUserPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPhoto]
  }
  
  @scala.inline
  implicit class SchemaUserPhotoOps[Self <: SchemaUserPhoto] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setPhotoData(value: String): Self = this.set("photoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoData: Self = this.set("photoData", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = this.set("primaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryEmail: Self = this.set("primaryEmail", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
