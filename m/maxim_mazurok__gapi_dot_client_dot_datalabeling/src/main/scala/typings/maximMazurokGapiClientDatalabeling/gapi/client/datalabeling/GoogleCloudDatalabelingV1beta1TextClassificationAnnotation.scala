package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TextClassificationAnnotation extends StObject {
  
  /** Label of the text. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TextClassificationAnnotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1TextClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextClassificationAnnotation]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1TextClassificationAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
  }
}
