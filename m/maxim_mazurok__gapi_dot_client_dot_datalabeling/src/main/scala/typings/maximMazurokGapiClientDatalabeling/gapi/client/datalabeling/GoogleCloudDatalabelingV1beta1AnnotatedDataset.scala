package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotatedDataset extends js.Object {
  
  /** Output only. Source of the annotation. */
  var annotationSource: js.UndefOr[String] = js.native
  
  /** Output only. Type of the annotation. It is specified when starting labeling task. */
  var annotationType: js.UndefOr[String] = js.native
  
  /** Output only. The names of any related resources that are blocking changes to the annotated dataset. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Number of examples that have annotation in the annotated dataset. */
  var completedExampleCount: js.UndefOr[String] = js.native
  
  /** Output only. Time the AnnotatedDataset was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The description of the AnnotatedDataset. It is specified in HumanAnnotationConfig when user starts a labeling task. Maximum of 10000 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. The display name of the AnnotatedDataset. It is specified in HumanAnnotationConfig when user starts a labeling task. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Number of examples in the annotated dataset. */
  var exampleCount: js.UndefOr[String] = js.native
  
  /** Output only. Per label statistics. */
  var labelStats: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelStats] = js.native
  
  /** Output only. Additional information about AnnotatedDataset. */
  var metadata: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata] = js.native
  
  /** Output only. AnnotatedDataset resource name in format of: projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id} */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotatedDataset {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotatedDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotatedDataset]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotatedDatasetOps[Self <: GoogleCloudDatalabelingV1beta1AnnotatedDataset] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSource(value: String): Self = this.set("annotationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSource: Self = this.set("annotationSource", js.undefined)
    
    @scala.inline
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setBlockingResourcesVarargs(value: String*): Self = this.set("blockingResources", js.Array(value :_*))
    
    @scala.inline
    def setBlockingResources(value: js.Array[String]): Self = this.set("blockingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingResources: Self = this.set("blockingResources", js.undefined)
    
    @scala.inline
    def setCompletedExampleCount(value: String): Self = this.set("completedExampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedExampleCount: Self = this.set("completedExampleCount", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExampleCount(value: String): Self = this.set("exampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleCount: Self = this.set("exampleCount", js.undefined)
    
    @scala.inline
    def setLabelStats(value: GoogleCloudDatalabelingV1beta1LabelStats): Self = this.set("labelStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStats: Self = this.set("labelStats", js.undefined)
    
    @scala.inline
    def setMetadata(value: GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
