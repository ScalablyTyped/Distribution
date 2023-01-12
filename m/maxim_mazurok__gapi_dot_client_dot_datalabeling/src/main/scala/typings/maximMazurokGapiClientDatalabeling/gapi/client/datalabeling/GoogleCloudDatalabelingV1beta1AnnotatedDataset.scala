package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1AnnotatedDataset extends StObject {
  
  /** Output only. Source of the annotation. */
  var annotationSource: js.UndefOr[String] = js.undefined
  
  /** Output only. Type of the annotation. It is specified when starting labeling task. */
  var annotationType: js.UndefOr[String] = js.undefined
  
  /** Output only. The names of any related resources that are blocking changes to the annotated dataset. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Number of examples that have annotation in the annotated dataset. */
  var completedExampleCount: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the AnnotatedDataset was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The description of the AnnotatedDataset. It is specified in HumanAnnotationConfig when user starts a labeling task. Maximum of 10000 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. The display name of the AnnotatedDataset. It is specified in HumanAnnotationConfig when user starts a labeling task. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Number of examples in the annotated dataset. */
  var exampleCount: js.UndefOr[String] = js.undefined
  
  /** Output only. Per label statistics. */
  var labelStats: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelStats] = js.undefined
  
  /** Output only. Additional information about AnnotatedDataset. */
  var metadata: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata] = js.undefined
  
  /** Output only. AnnotatedDataset resource name in format of: projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id} */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1AnnotatedDataset {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1AnnotatedDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotatedDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotatedDataset] (val x: Self) extends AnyVal {
    
    inline def setAnnotationSource(value: String): Self = StObject.set(x, "annotationSource", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSourceUndefined: Self = StObject.set(x, "annotationSource", js.undefined)
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setBlockingResources(value: js.Array[String]): Self = StObject.set(x, "blockingResources", value.asInstanceOf[js.Any])
    
    inline def setBlockingResourcesUndefined: Self = StObject.set(x, "blockingResources", js.undefined)
    
    inline def setBlockingResourcesVarargs(value: String*): Self = StObject.set(x, "blockingResources", js.Array(value*))
    
    inline def setCompletedExampleCount(value: String): Self = StObject.set(x, "completedExampleCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedExampleCountUndefined: Self = StObject.set(x, "completedExampleCount", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExampleCount(value: String): Self = StObject.set(x, "exampleCount", value.asInstanceOf[js.Any])
    
    inline def setExampleCountUndefined: Self = StObject.set(x, "exampleCount", js.undefined)
    
    inline def setLabelStats(value: GoogleCloudDatalabelingV1beta1LabelStats): Self = StObject.set(x, "labelStats", value.asInstanceOf[js.Any])
    
    inline def setLabelStatsUndefined: Self = StObject.set(x, "labelStats", js.undefined)
    
    inline def setMetadata(value: GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
