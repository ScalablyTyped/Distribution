package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends js.Object {
  
  /** Container image path set for flex Template. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.native
  
  /** job_graph_gcs_path set for legacy Template. */
  var jobGraphGcsPath: js.UndefOr[String] = js.native
  
  /** Metadata set for legacy Template. */
  var metadata: js.UndefOr[TemplateMetadata] = js.native
}
object Artifact {
  
  @scala.inline
  def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
    
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
    def setContainerSpec(value: ContainerSpec): Self = this.set("containerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSpec: Self = this.set("containerSpec", js.undefined)
    
    @scala.inline
    def setJobGraphGcsPath(value: String): Self = this.set("jobGraphGcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobGraphGcsPath: Self = this.set("jobGraphGcsPath", js.undefined)
    
    @scala.inline
    def setMetadata(value: TemplateMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
