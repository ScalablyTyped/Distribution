package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerActionsSummary extends StObject {
  
  /**
    * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
    */
  var creating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
    */
  var deleting: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions.
    */
  var none: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
    */
  var recreating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
    */
  var refreshing: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
    */
  var restarting: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
    */
  var resuming: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be started or are currently being started.
    */
  var starting: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
    */
  var stopping: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
    */
  var suspending: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
    */
  var verifying: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstanceGroupManagerActionsSummary {
  
  inline def apply(): SchemaInstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerActionsSummary]
  }
  
  extension [Self <: SchemaInstanceGroupManagerActionsSummary](x: Self) {
    
    inline def setAbandoning(value: Double): Self = StObject.set(x, "abandoning", value.asInstanceOf[js.Any])
    
    inline def setAbandoningNull: Self = StObject.set(x, "abandoning", null)
    
    inline def setAbandoningUndefined: Self = StObject.set(x, "abandoning", js.undefined)
    
    inline def setCreating(value: Double): Self = StObject.set(x, "creating", value.asInstanceOf[js.Any])
    
    inline def setCreatingNull: Self = StObject.set(x, "creating", null)
    
    inline def setCreatingUndefined: Self = StObject.set(x, "creating", js.undefined)
    
    inline def setCreatingWithoutRetries(value: Double): Self = StObject.set(x, "creatingWithoutRetries", value.asInstanceOf[js.Any])
    
    inline def setCreatingWithoutRetriesNull: Self = StObject.set(x, "creatingWithoutRetries", null)
    
    inline def setCreatingWithoutRetriesUndefined: Self = StObject.set(x, "creatingWithoutRetries", js.undefined)
    
    inline def setDeleting(value: Double): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    inline def setDeletingNull: Self = StObject.set(x, "deleting", null)
    
    inline def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneNull: Self = StObject.set(x, "none", null)
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setRecreating(value: Double): Self = StObject.set(x, "recreating", value.asInstanceOf[js.Any])
    
    inline def setRecreatingNull: Self = StObject.set(x, "recreating", null)
    
    inline def setRecreatingUndefined: Self = StObject.set(x, "recreating", js.undefined)
    
    inline def setRefreshing(value: Double): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRestarting(value: Double): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
    
    inline def setRestartingNull: Self = StObject.set(x, "restarting", null)
    
    inline def setRestartingUndefined: Self = StObject.set(x, "restarting", js.undefined)
    
    inline def setResuming(value: Double): Self = StObject.set(x, "resuming", value.asInstanceOf[js.Any])
    
    inline def setResumingNull: Self = StObject.set(x, "resuming", null)
    
    inline def setResumingUndefined: Self = StObject.set(x, "resuming", js.undefined)
    
    inline def setStarting(value: Double): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
    
    inline def setStartingNull: Self = StObject.set(x, "starting", null)
    
    inline def setStartingUndefined: Self = StObject.set(x, "starting", js.undefined)
    
    inline def setStopping(value: Double): Self = StObject.set(x, "stopping", value.asInstanceOf[js.Any])
    
    inline def setStoppingNull: Self = StObject.set(x, "stopping", null)
    
    inline def setStoppingUndefined: Self = StObject.set(x, "stopping", js.undefined)
    
    inline def setSuspending(value: Double): Self = StObject.set(x, "suspending", value.asInstanceOf[js.Any])
    
    inline def setSuspendingNull: Self = StObject.set(x, "suspending", null)
    
    inline def setSuspendingUndefined: Self = StObject.set(x, "suspending", js.undefined)
    
    inline def setVerifying(value: Double): Self = StObject.set(x, "verifying", value.asInstanceOf[js.Any])
    
    inline def setVerifyingNull: Self = StObject.set(x, "verifying", null)
    
    inline def setVerifyingUndefined: Self = StObject.set(x, "verifying", js.undefined)
  }
}
