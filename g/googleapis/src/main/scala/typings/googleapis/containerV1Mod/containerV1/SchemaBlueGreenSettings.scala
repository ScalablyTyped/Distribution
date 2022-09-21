package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlueGreenSettings extends StObject {
  
  /**
    * Time needed after draining entire blue pool. After this period, blue pool will be cleaned up.
    */
  var nodePoolSoakDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Standard policy for the blue-green upgrade.
    */
  var standardRolloutPolicy: js.UndefOr[SchemaStandardRolloutPolicy] = js.undefined
}
object SchemaBlueGreenSettings {
  
  inline def apply(): SchemaBlueGreenSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlueGreenSettings]
  }
  
  extension [Self <: SchemaBlueGreenSettings](x: Self) {
    
    inline def setNodePoolSoakDuration(value: String): Self = StObject.set(x, "nodePoolSoakDuration", value.asInstanceOf[js.Any])
    
    inline def setNodePoolSoakDurationNull: Self = StObject.set(x, "nodePoolSoakDuration", null)
    
    inline def setNodePoolSoakDurationUndefined: Self = StObject.set(x, "nodePoolSoakDuration", js.undefined)
    
    inline def setStandardRolloutPolicy(value: SchemaStandardRolloutPolicy): Self = StObject.set(x, "standardRolloutPolicy", value.asInstanceOf[js.Any])
    
    inline def setStandardRolloutPolicyUndefined: Self = StObject.set(x, "standardRolloutPolicy", js.undefined)
  }
}
