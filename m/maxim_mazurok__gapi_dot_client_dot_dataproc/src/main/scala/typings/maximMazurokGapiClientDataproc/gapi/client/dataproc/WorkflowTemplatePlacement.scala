package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowTemplatePlacement extends StObject {
  
  /** Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted. */
  var clusterSelector: js.UndefOr[ClusterSelector] = js.undefined
  
  /** A cluster that is managed by the workflow. */
  var managedCluster: js.UndefOr[ManagedCluster] = js.undefined
}
object WorkflowTemplatePlacement {
  
  inline def apply(): WorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowTemplatePlacement]
  }
  
  extension [Self <: WorkflowTemplatePlacement](x: Self) {
    
    inline def setClusterSelector(value: ClusterSelector): Self = StObject.set(x, "clusterSelector", value.asInstanceOf[js.Any])
    
    inline def setClusterSelectorUndefined: Self = StObject.set(x, "clusterSelector", js.undefined)
    
    inline def setManagedCluster(value: ManagedCluster): Self = StObject.set(x, "managedCluster", value.asInstanceOf[js.Any])
    
    inline def setManagedClusterUndefined: Self = StObject.set(x, "managedCluster", js.undefined)
  }
}
