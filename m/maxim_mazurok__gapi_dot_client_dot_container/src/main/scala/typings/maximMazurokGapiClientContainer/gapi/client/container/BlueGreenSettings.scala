package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenSettings extends StObject {
  
  /** Time needed after draining entire blue pool. After this period, blue pool will be cleaned up. */
  var nodePoolSoakDuration: js.UndefOr[String] = js.undefined
  
  /** Standard policy for the blue-green upgrade. */
  var standardRolloutPolicy: js.UndefOr[StandardRolloutPolicy] = js.undefined
}
object BlueGreenSettings {
  
  inline def apply(): BlueGreenSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlueGreenSettings] (val x: Self) extends AnyVal {
    
    inline def setNodePoolSoakDuration(value: String): Self = StObject.set(x, "nodePoolSoakDuration", value.asInstanceOf[js.Any])
    
    inline def setNodePoolSoakDurationUndefined: Self = StObject.set(x, "nodePoolSoakDuration", js.undefined)
    
    inline def setStandardRolloutPolicy(value: StandardRolloutPolicy): Self = StObject.set(x, "standardRolloutPolicy", value.asInstanceOf[js.Any])
    
    inline def setStandardRolloutPolicyUndefined: Self = StObject.set(x, "standardRolloutPolicy", js.undefined)
  }
}
