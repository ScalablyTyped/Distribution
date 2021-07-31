package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation extends StObject {
  
  /** Label of image. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImageClassificationAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
  }
}
