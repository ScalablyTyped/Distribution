package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation extends StObject {
  
  /**
    * Label of image.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
  }
}
