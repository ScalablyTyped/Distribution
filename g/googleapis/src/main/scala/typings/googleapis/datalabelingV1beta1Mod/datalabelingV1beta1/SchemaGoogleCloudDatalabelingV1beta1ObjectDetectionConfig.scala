package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig extends StObject {
  
  /**
    * Required. Annotation spec set resource name.
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Number of frames per second to be extracted from the video.
    */
  var extractionFrameRate: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setExtractionFrameRate(value: Double): Self = StObject.set(x, "extractionFrameRate", value.asInstanceOf[js.Any])
    
    inline def setExtractionFrameRateNull: Self = StObject.set(x, "extractionFrameRate", null)
    
    inline def setExtractionFrameRateUndefined: Self = StObject.set(x, "extractionFrameRate", js.undefined)
  }
}
