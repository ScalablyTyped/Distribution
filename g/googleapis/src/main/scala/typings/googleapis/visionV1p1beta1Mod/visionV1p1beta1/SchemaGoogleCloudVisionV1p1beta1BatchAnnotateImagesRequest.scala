package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest extends js.Object {
  
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequestOps[Self <: SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
