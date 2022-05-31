package typings.jupyterlabServices.anon

import typings.jupyterlabServices.messagesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executionstate extends StObject {
  
  var execution_state: Status
}
object Executionstate {
  
  inline def apply(execution_state: Status): Executionstate = {
    val __obj = js.Dynamic.literal(execution_state = execution_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executionstate]
  }
  
  extension [Self <: Executionstate](x: Self) {
    
    inline def setExecution_state(value: Status): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
  }
}
