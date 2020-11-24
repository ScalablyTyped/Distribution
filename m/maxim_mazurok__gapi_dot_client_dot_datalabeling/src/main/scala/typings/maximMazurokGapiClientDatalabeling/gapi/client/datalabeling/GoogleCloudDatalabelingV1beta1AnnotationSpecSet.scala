package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotationSpecSet extends js.Object {
  
  /** Required. The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task. */
  var annotationSpecs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpec]] = js.native
  
  /** Output only. The names of any related resources that are blocking changes to the annotation spec set. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The AnnotationSpecSet resource name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}" */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotationSpecSet {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotationSpecSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationSpecSetOps[Self <: GoogleCloudDatalabelingV1beta1AnnotationSpecSet] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotationSpec*): Self = this.set("annotationSpecs", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationSpecs(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpec]): Self = this.set("annotationSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecs: Self = this.set("annotationSpecs", js.undefined)
    
    @scala.inline
    def setBlockingResourcesVarargs(value: String*): Self = this.set("blockingResources", js.Array(value :_*))
    
    @scala.inline
    def setBlockingResources(value: js.Array[String]): Self = this.set("blockingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingResources: Self = this.set("blockingResources", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
