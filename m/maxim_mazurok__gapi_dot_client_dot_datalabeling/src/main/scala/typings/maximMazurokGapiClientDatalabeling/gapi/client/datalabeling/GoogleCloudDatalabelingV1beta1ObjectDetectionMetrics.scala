package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics extends js.Object {
  
  /** Precision-recall curve. */
  var prCurve: js.UndefOr[GoogleCloudDatalabelingV1beta1PrCurve] = js.native
}
object GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ObjectDetectionMetricsOps[Self <: GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] (val x: Self) extends AnyVal {
    
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
    def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = this.set("prCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrCurve: Self = this.set("prCurve", js.undefined)
  }
}
