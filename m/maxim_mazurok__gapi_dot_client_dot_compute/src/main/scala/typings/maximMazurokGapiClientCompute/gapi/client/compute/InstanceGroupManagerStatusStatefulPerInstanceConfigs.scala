package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerStatusStatefulPerInstanceConfigs extends StObject {
  
  /** A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs. */
  var allEffective: js.UndefOr[Boolean] = js.undefined
}
object InstanceGroupManagerStatusStatefulPerInstanceConfigs {
  
  inline def apply(): InstanceGroupManagerStatusStatefulPerInstanceConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusStatefulPerInstanceConfigs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupManagerStatusStatefulPerInstanceConfigs] (val x: Self) extends AnyVal {
    
    inline def setAllEffective(value: Boolean): Self = StObject.set(x, "allEffective", value.asInstanceOf[js.Any])
    
    inline def setAllEffectiveUndefined: Self = StObject.set(x, "allEffective", js.undefined)
  }
}
