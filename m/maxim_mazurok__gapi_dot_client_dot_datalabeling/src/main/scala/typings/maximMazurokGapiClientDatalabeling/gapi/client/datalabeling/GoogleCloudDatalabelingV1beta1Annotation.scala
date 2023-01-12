package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Annotation extends StObject {
  
  /** Output only. Annotation metadata, including information like votes for labels. */
  var annotationMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationMetadata] = js.undefined
  
  /** Output only. Sentiment for this annotation. */
  var annotationSentiment: js.UndefOr[String] = js.undefined
  
  /** Output only. The source of the annotation. */
  var annotationSource: js.UndefOr[String] = js.undefined
  
  /** Output only. This is the actual annotation value, e.g classification, bounding box values are stored here. */
  var annotationValue: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationValue] = js.undefined
  
  /**
    * Output only. Unique name of this annotation, format is:
    * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset}/examples/{example_id}/annotations/{annotation_id}
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Annotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Annotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Annotation] (val x: Self) extends AnyVal {
    
    inline def setAnnotationMetadata(value: GoogleCloudDatalabelingV1beta1AnnotationMetadata): Self = StObject.set(x, "annotationMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnnotationMetadataUndefined: Self = StObject.set(x, "annotationMetadata", js.undefined)
    
    inline def setAnnotationSentiment(value: String): Self = StObject.set(x, "annotationSentiment", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSentimentUndefined: Self = StObject.set(x, "annotationSentiment", js.undefined)
    
    inline def setAnnotationSource(value: String): Self = StObject.set(x, "annotationSource", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSourceUndefined: Self = StObject.set(x, "annotationSource", js.undefined)
    
    inline def setAnnotationValue(value: GoogleCloudDatalabelingV1beta1AnnotationValue): Self = StObject.set(x, "annotationValue", value.asInstanceOf[js.Any])
    
    inline def setAnnotationValueUndefined: Self = StObject.set(x, "annotationValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
