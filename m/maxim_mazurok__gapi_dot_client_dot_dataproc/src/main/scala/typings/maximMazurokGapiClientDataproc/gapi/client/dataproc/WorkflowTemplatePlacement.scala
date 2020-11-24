package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplatePlacement extends js.Object {
  
  /** Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted. */
  var clusterSelector: js.UndefOr[ClusterSelector] = js.native
  
  /** A cluster that is managed by the workflow. */
  var managedCluster: js.UndefOr[ManagedCluster] = js.native
}
object WorkflowTemplatePlacement {
  
  @scala.inline
  def apply(): WorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowTemplatePlacement]
  }
  
  @scala.inline
  implicit class WorkflowTemplatePlacementOps[Self <: WorkflowTemplatePlacement] (val x: Self) extends AnyVal {
    
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
    def setClusterSelector(value: ClusterSelector): Self = this.set("clusterSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSelector: Self = this.set("clusterSelector", js.undefined)
    
    @scala.inline
    def setManagedCluster(value: ManagedCluster): Self = this.set("managedCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedCluster: Self = this.set("managedCluster", js.undefined)
  }
}
