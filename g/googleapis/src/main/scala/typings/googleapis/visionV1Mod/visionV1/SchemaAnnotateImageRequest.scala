package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaAnnotateImageRequest extends js.Object {
  
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
}
object SchemaAnnotateImageRequest {
  
  @scala.inline
  def apply(): SchemaAnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateImageRequest]
  }
  
  @scala.inline
  implicit class SchemaAnnotateImageRequestOps[Self <: SchemaAnnotateImageRequest] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: SchemaFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[SchemaFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageContext(value: SchemaImageContext): Self = this.set("imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContext: Self = this.set("imageContext", js.undefined)
  }
}
