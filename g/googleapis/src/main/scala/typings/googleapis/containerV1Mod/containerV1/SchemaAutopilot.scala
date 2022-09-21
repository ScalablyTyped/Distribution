package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutopilot extends StObject {
  
  /**
    * Enable Autopilot
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAutopilot {
  
  inline def apply(): SchemaAutopilot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutopilot]
  }
  
  extension [Self <: SchemaAutopilot](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
