package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1AnnotationSpecSet extends StObject {
  
  /** Required. The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task. */
  var annotationSpecs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpec]] = js.undefined
  
  /** Output only. The names of any related resources that are blocking changes to the annotation spec set. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The AnnotationSpecSet resource name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}" */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1AnnotationSpecSet {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1AnnotationSpecSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1AnnotationSpecSet](x: Self) {
    
    inline def setAnnotationSpecs(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpec]): Self = StObject.set(x, "annotationSpecs", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecsUndefined: Self = StObject.set(x, "annotationSpecs", js.undefined)
    
    inline def setAnnotationSpecsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotationSpec*): Self = StObject.set(x, "annotationSpecs", js.Array(value*))
    
    inline def setBlockingResources(value: js.Array[String]): Self = StObject.set(x, "blockingResources", value.asInstanceOf[js.Any])
    
    inline def setBlockingResourcesUndefined: Self = StObject.set(x, "blockingResources", js.undefined)
    
    inline def setBlockingResourcesVarargs(value: String*): Self = StObject.set(x, "blockingResources", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
