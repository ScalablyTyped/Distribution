package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics extends StObject {
  
  /** Precision-recall curve. */
  var prCurve: js.UndefOr[GoogleCloudDatalabelingV1beta1PrCurve] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] (val x: Self) extends AnyVal {
    
    inline def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = StObject.set(x, "prCurve", value.asInstanceOf[js.Any])
    
    inline def setPrCurveUndefined: Self = StObject.set(x, "prCurve", js.undefined)
  }
}
