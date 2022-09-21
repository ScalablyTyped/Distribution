package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest extends StObject {
  
  /**
    * Required. Annotation spec set to create. Annotation specs must be included. Only one annotation spec will be accepted for annotation specs with same display_name.
    */
  var annotationSpecSet: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest](x: Self) {
    
    inline def setAnnotationSpecSet(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
