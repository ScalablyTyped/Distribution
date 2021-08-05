package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ObjectDetectionConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Required. Number of frames per second to be extracted from the video. */
  var extractionFrameRate: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ObjectDetectionConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ObjectDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectDetectionConfig]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setExtractionFrameRate(value: Double): Self = StObject.set(x, "extractionFrameRate", value.asInstanceOf[js.Any])
    
    inline def setExtractionFrameRateUndefined: Self = StObject.set(x, "extractionFrameRate", js.undefined)
  }
}
