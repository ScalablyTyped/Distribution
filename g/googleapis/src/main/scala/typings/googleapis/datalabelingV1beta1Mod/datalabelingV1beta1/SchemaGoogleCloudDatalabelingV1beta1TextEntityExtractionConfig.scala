package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig extends StObject {
  
  /**
    * Required. Annotation spec set resource name.
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
