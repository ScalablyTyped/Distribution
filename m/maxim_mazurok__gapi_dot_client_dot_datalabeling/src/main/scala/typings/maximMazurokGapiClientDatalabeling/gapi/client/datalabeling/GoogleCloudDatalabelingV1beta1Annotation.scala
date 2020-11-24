package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Annotation extends js.Object {
  
  /** Output only. Annotation metadata, including information like votes for labels. */
  var annotationMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationMetadata] = js.native
  
  /** Output only. Sentiment for this annotation. */
  var annotationSentiment: js.UndefOr[String] = js.native
  
  /** Output only. The source of the annotation. */
  var annotationSource: js.UndefOr[String] = js.native
  
  /** Output only. This is the actual annotation value, e.g classification, bounding box values are stored here. */
  var annotationValue: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationValue] = js.native
  
  /**
    * Output only. Unique name of this annotation, format is:
    * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset}/examples/{example_id}/annotations/{annotation_id}
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1Annotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Annotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationOps[Self <: GoogleCloudDatalabelingV1beta1Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationMetadata(value: GoogleCloudDatalabelingV1beta1AnnotationMetadata): Self = this.set("annotationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationMetadata: Self = this.set("annotationMetadata", js.undefined)
    
    @scala.inline
    def setAnnotationSentiment(value: String): Self = this.set("annotationSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSentiment: Self = this.set("annotationSentiment", js.undefined)
    
    @scala.inline
    def setAnnotationSource(value: String): Self = this.set("annotationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSource: Self = this.set("annotationSource", js.undefined)
    
    @scala.inline
    def setAnnotationValue(value: GoogleCloudDatalabelingV1beta1AnnotationValue): Self = this.set("annotationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationValue: Self = this.set("annotationValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
