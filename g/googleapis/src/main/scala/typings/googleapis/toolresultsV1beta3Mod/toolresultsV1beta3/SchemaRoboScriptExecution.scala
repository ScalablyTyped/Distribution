package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoboScriptExecution extends StObject {
  
  /**
    * The number of Robo script actions executed successfully.
    */
  var successfulActions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of actions in the Robo script.
    */
  var totalActions: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRoboScriptExecution {
  
  inline def apply(): SchemaRoboScriptExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboScriptExecution]
  }
  
  extension [Self <: SchemaRoboScriptExecution](x: Self) {
    
    inline def setSuccessfulActions(value: Double): Self = StObject.set(x, "successfulActions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulActionsNull: Self = StObject.set(x, "successfulActions", null)
    
    inline def setSuccessfulActionsUndefined: Self = StObject.set(x, "successfulActions", js.undefined)
    
    inline def setTotalActions(value: Double): Self = StObject.set(x, "totalActions", value.asInstanceOf[js.Any])
    
    inline def setTotalActionsNull: Self = StObject.set(x, "totalActions", null)
    
    inline def setTotalActionsUndefined: Self = StObject.set(x, "totalActions", js.undefined)
  }
}
