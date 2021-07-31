package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerStatusStateful extends StObject {
  
  /**
    * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance
    * configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not
    * yet applied those deletions.
    */
  var hasStatefulConfig: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Status of per-instance configs on the instance. */
  var perInstanceConfigs: js.UndefOr[InstanceGroupManagerStatusStatefulPerInstanceConfigs] = js.undefined
}
object InstanceGroupManagerStatusStateful {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatusStateful = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusStateful]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusStatefulMutableBuilder[Self <: InstanceGroupManagerStatusStateful] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasStatefulConfig(value: Boolean): Self = StObject.set(x, "hasStatefulConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasStatefulConfigUndefined: Self = StObject.set(x, "hasStatefulConfig", js.undefined)
    
    @scala.inline
    def setPerInstanceConfigs(value: InstanceGroupManagerStatusStatefulPerInstanceConfigs): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
  }
}
