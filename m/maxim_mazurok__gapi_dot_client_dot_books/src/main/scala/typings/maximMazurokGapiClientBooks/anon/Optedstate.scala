package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optedstate extends StObject {
  
  var opted_state: js.UndefOr[String] = js.undefined
}
object Optedstate {
  
  inline def apply(): Optedstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optedstate]
  }
  
  extension [Self <: Optedstate](x: Self) {
    
    inline def setOpted_state(value: String): Self = StObject.set(x, "opted_state", value.asInstanceOf[js.Any])
    
    inline def setOpted_stateUndefined: Self = StObject.set(x, "opted_state", js.undefined)
  }
}
