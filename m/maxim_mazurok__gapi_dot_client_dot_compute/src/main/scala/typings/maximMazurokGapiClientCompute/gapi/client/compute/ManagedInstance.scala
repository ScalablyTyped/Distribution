package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedInstance extends StObject {
  
  /**
    * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values: - NONE The instance is running, and the managed instance group does
    * not have any scheduled actions for this instance. - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again
    * until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does
    * not try again and the group's targetSize value is decreased instead. - RECREATING The managed instance group is recreating this instance. - DELETING The managed instance group is
    * permanently deleting this instance. - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target
    * pools that are associated with this group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The managed instance group is applying configuration
    * changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance. - VERIFYING The managed instance
    * group has created the instance and it is in the process of being verified.
    */
  var currentAction: js.UndefOr[String] = js.undefined
  
  /** [Output only] The unique identifier for this resource. This field is empty when instance does not exist. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Health state of the instance per health-check. */
  var instanceHealth: js.UndefOr[js.Array[ManagedInstanceInstanceHealth]] = js.undefined
  
  /** [Output Only] The status of the instance. This field is empty when the instance does not exist. */
  var instanceStatus: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Information about the last attempt to create or delete the instance. */
  var lastAttempt: js.UndefOr[ManagedInstanceLastAttempt] = js.undefined
  
  /** [Output Only] Preserved state applied from per-instance config for this instance. */
  var preservedStateFromConfig: js.UndefOr[PreservedState] = js.undefined
  
  /** [Output Only] Preserved state generated based on stateful policy for this instance. */
  var preservedStateFromPolicy: js.UndefOr[PreservedState] = js.undefined
  
  /** [Output Only] Intended version of this instance. */
  var version: js.UndefOr[ManagedInstanceVersion] = js.undefined
}
object ManagedInstance {
  
  inline def apply(): ManagedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedInstance] (val x: Self) extends AnyVal {
    
    inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
    
    inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceHealth(value: js.Array[ManagedInstanceInstanceHealth]): Self = StObject.set(x, "instanceHealth", value.asInstanceOf[js.Any])
    
    inline def setInstanceHealthUndefined: Self = StObject.set(x, "instanceHealth", js.undefined)
    
    inline def setInstanceHealthVarargs(value: ManagedInstanceInstanceHealth*): Self = StObject.set(x, "instanceHealth", js.Array(value*))
    
    inline def setInstanceStatus(value: String): Self = StObject.set(x, "instanceStatus", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatusUndefined: Self = StObject.set(x, "instanceStatus", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLastAttempt(value: ManagedInstanceLastAttempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptUndefined: Self = StObject.set(x, "lastAttempt", js.undefined)
    
    inline def setPreservedStateFromConfig(value: PreservedState): Self = StObject.set(x, "preservedStateFromConfig", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateFromConfigUndefined: Self = StObject.set(x, "preservedStateFromConfig", js.undefined)
    
    inline def setPreservedStateFromPolicy(value: PreservedState): Self = StObject.set(x, "preservedStateFromPolicy", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateFromPolicyUndefined: Self = StObject.set(x, "preservedStateFromPolicy", js.undefined)
    
    inline def setVersion(value: ManagedInstanceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
