package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to update the metadata of a Photo. Updating the pixels of a photo
  * is not supported.
  */
@js.native
trait SchemaUpdatePhotoRequest extends StObject {
  
  /**
    * Required. Photo object containing the new metadata.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
  
  /**
    * Mask that identifies fields on the photo metadata to update. If not
    * present, the old Photo metadata is entirely replaced with the new Photo
    * metadata in this request. The update fails if invalid fields are
    * specified. Multiple fields can be specified in a comma-delimited list.
    * The following fields are valid:  * `pose.heading` * `pose.latLngPair` *
    * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` *
    * `connections` * `places`   &lt;aside
    * class=&quot;note&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updateMask
    * contains repeated fields, the entire set of repeated values get replaced
    * with the new contents. For example, if updateMask contains `connections`
    * and `UpdatePhotoRequest.photo.connections` is empty, all connections are
    * removed.&lt;/aside&gt;
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdatePhotoRequest {
  
  @scala.inline
  def apply(): SchemaUpdatePhotoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePhotoRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdatePhotoRequestMutableBuilder[Self <: SchemaUpdatePhotoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoto(value: SchemaPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
