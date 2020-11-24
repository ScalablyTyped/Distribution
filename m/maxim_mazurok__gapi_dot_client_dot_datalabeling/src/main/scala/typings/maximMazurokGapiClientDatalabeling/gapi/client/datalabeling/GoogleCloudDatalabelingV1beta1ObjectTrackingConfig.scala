package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectTrackingConfig extends js.Object {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 20s. */
  var clipLength: js.UndefOr[Double] = js.native
  
  /** The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 0.3s. */
  var overlapLength: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ObjectTrackingConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ObjectTrackingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectTrackingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ObjectTrackingConfigOps[Self <: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSet(value: String): Self = this.set("annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSet: Self = this.set("annotationSpecSet", js.undefined)
    
    @scala.inline
    def setClipLength(value: Double): Self = this.set("clipLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipLength: Self = this.set("clipLength", js.undefined)
    
    @scala.inline
    def setOverlapLength(value: Double): Self = this.set("overlapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapLength: Self = this.set("overlapLength", js.undefined)
  }
}
