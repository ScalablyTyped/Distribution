package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerActionsSummary extends StObject {
  
  /**
    * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group
    * without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these
    * instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries
    * field will be populated.
    */
  var creating: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any
    * of these instances, it decreases the group's targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted. */
  var deleting: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions. */
  var none: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the
    * existing root persistent disk and creates a new disk from the image that is defined in the instance template.
    */
  var recreating: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example,
    * setting or removing target pools for the instance.
    */
  var refreshing: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted. */
  var restarting: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method
    * documentation.
    */
  var verifying: js.UndefOr[Double] = js.undefined
}
object InstanceGroupManagerActionsSummary {
  
  inline def apply(): InstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerActionsSummary]
  }
  
  extension [Self <: InstanceGroupManagerActionsSummary](x: Self) {
    
    inline def setAbandoning(value: Double): Self = StObject.set(x, "abandoning", value.asInstanceOf[js.Any])
    
    inline def setAbandoningUndefined: Self = StObject.set(x, "abandoning", js.undefined)
    
    inline def setCreating(value: Double): Self = StObject.set(x, "creating", value.asInstanceOf[js.Any])
    
    inline def setCreatingUndefined: Self = StObject.set(x, "creating", js.undefined)
    
    inline def setCreatingWithoutRetries(value: Double): Self = StObject.set(x, "creatingWithoutRetries", value.asInstanceOf[js.Any])
    
    inline def setCreatingWithoutRetriesUndefined: Self = StObject.set(x, "creatingWithoutRetries", js.undefined)
    
    inline def setDeleting(value: Double): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    inline def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setRecreating(value: Double): Self = StObject.set(x, "recreating", value.asInstanceOf[js.Any])
    
    inline def setRecreatingUndefined: Self = StObject.set(x, "recreating", js.undefined)
    
    inline def setRefreshing(value: Double): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRestarting(value: Double): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
    
    inline def setRestartingUndefined: Self = StObject.set(x, "restarting", js.undefined)
    
    inline def setVerifying(value: Double): Self = StObject.set(x, "verifying", value.asInstanceOf[js.Any])
    
    inline def setVerifyingUndefined: Self = StObject.set(x, "verifying", js.undefined)
  }
}
