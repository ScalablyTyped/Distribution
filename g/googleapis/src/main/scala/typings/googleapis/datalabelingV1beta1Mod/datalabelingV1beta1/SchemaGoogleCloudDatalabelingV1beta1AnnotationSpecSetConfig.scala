package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig extends StObject {
  
  /**
    * Optional. If allow_multi_label is true, contributors are able to choose multiple labels from one annotation spec set.
    */
  var allowMultiLabel: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Annotation spec set resource name.
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig](x: Self) {
    
    inline def setAllowMultiLabel(value: Boolean): Self = StObject.set(x, "allowMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiLabelNull: Self = StObject.set(x, "allowMultiLabel", null)
    
    inline def setAllowMultiLabelUndefined: Self = StObject.set(x, "allowMultiLabel", js.undefined)
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
