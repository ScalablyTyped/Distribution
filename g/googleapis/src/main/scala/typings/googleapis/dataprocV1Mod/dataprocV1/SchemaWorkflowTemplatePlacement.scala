package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies workflow execution target.Either managed_cluster or
  * cluster_selector is required.
  */
trait SchemaWorkflowTemplatePlacement extends StObject {
  
  /**
    * Optional. A selector that chooses target cluster for jobs based on
    * metadata.The selector is evaluated at the time each job is submitted.
    */
  var clusterSelector: js.UndefOr[SchemaClusterSelector] = js.undefined
  
  /**
    * Optional. A cluster that is managed by the workflow.
    */
  var managedCluster: js.UndefOr[SchemaManagedCluster] = js.undefined
}
object SchemaWorkflowTemplatePlacement {
  
  inline def apply(): SchemaWorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowTemplatePlacement]
  }
  
  extension [Self <: SchemaWorkflowTemplatePlacement](x: Self) {
    
    inline def setClusterSelector(value: SchemaClusterSelector): Self = StObject.set(x, "clusterSelector", value.asInstanceOf[js.Any])
    
    inline def setClusterSelectorUndefined: Self = StObject.set(x, "clusterSelector", js.undefined)
    
    inline def setManagedCluster(value: SchemaManagedCluster): Self = StObject.set(x, "managedCluster", value.asInstanceOf[js.Any])
    
    inline def setManagedClusterUndefined: Self = StObject.set(x, "managedCluster", js.undefined)
  }
}
