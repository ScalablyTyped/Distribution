package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation extends StObject {
  
  /**
    * Label of the text.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
  }
}
