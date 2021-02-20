package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies workflow execution target.Either managed_cluster or
  * cluster_selector is required.
  */
@js.native
trait SchemaWorkflowTemplatePlacement extends StObject {
  
  /**
    * Optional. A selector that chooses target cluster for jobs based on
    * metadata.The selector is evaluated at the time each job is submitted.
    */
  var clusterSelector: js.UndefOr[SchemaClusterSelector] = js.native
  
  /**
    * Optional. A cluster that is managed by the workflow.
    */
  var managedCluster: js.UndefOr[SchemaManagedCluster] = js.native
}
object SchemaWorkflowTemplatePlacement {
  
  @scala.inline
  def apply(): SchemaWorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowTemplatePlacement]
  }
  
  @scala.inline
  implicit class SchemaWorkflowTemplatePlacementMutableBuilder[Self <: SchemaWorkflowTemplatePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSelector(value: SchemaClusterSelector): Self = StObject.set(x, "clusterSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSelectorUndefined: Self = StObject.set(x, "clusterSelector", js.undefined)
    
    @scala.inline
    def setManagedCluster(value: SchemaManagedCluster): Self = StObject.set(x, "managedCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedClusterUndefined: Self = StObject.set(x, "managedCluster", js.undefined)
  }
}
