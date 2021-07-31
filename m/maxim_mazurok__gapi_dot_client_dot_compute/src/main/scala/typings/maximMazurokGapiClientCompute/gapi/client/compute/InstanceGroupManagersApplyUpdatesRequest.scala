package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagersApplyUpdatesRequest extends StObject {
  
  /** Flag to update all instances instead of specified list of ?instances?. If the flag is set to true then the instances may not be specified in the request. */
  var allInstances: js.UndefOr[Boolean] = js.undefined
  
  /** The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The minimal action that you want to perform on each instance during the update:
    * - REPLACE: At minimum, delete the instance and create it again.
    * - RESTART: Stop the instance and start it again.
    * - REFRESH: Do not stop the instance.
    * - NONE: Do not disrupt the instance at all.  By default, the minimum action is NONE. If your update requires a more disruptive action than you set with this flag, the necessary
    * action is performed to execute the update.
    */
  var minimalAction: js.UndefOr[String] = js.undefined
  
  /**
    * The most disruptive action that you want to perform on each instance during the update:
    * - REPLACE: Delete the instance and create it again.
    * - RESTART: Stop the instance and start it again.
    * - REFRESH: Do not stop the instance.
    * - NONE: Do not disrupt the instance at all.  By default, the most disruptive allowed action is REPLACE. If your update requires a more disruptive action than you set with this flag,
    * the update request will fail.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.undefined
}
object InstanceGroupManagersApplyUpdatesRequest {
  
  @scala.inline
  def apply(): InstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersApplyUpdatesRequest]
  }
  
  @scala.inline
  implicit class InstanceGroupManagersApplyUpdatesRequestMutableBuilder[Self <: InstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllInstances(value: Boolean): Self = StObject.set(x, "allInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllInstancesUndefined: Self = StObject.set(x, "allInstances", js.undefined)
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setMinimalAction(value: String): Self = StObject.set(x, "minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimalActionUndefined: Self = StObject.set(x, "minimalAction", js.undefined)
    
    @scala.inline
    def setMostDisruptiveAllowedAction(value: String): Self = StObject.set(x, "mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostDisruptiveAllowedActionUndefined: Self = StObject.set(x, "mostDisruptiveAllowedAction", js.undefined)
  }
}
