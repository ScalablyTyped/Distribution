package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ObjectDetectionMetricsMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = StObject.set(x, "prCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrCurveUndefined: Self = StObject.set(x, "prCurve", js.undefined)
  }
}
