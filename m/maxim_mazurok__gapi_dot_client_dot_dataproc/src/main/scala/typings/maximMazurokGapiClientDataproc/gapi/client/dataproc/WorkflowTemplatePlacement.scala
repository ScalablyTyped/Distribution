package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplatePlacement extends StObject {
  
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
  implicit class WorkflowTemplatePlacementMutableBuilder[Self <: WorkflowTemplatePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSelector(value: ClusterSelector): Self = StObject.set(x, "clusterSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSelectorUndefined: Self = StObject.set(x, "clusterSelector", js.undefined)
    
    @scala.inline
    def setManagedCluster(value: ManagedCluster): Self = StObject.set(x, "managedCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedClusterUndefined: Self = StObject.set(x, "managedCluster", js.undefined)
  }
}
