package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPolicy extends StObject {
  
  var preservedState: js.UndefOr[StatefulPolicyPreservedState] = js.undefined
}
object StatefulPolicy {
  
  inline def apply(): StatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicy]
  }
  
  extension [Self <: StatefulPolicy](x: Self) {
    
    inline def setPreservedState(value: StatefulPolicyPreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
  }
}
