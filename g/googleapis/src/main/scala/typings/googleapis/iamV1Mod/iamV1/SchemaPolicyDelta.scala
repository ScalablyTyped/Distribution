package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The difference delta between two policies.
  */
trait SchemaPolicyDelta extends StObject {
  
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[SchemaBindingDelta]] = js.undefined
}
object SchemaPolicyDelta {
  
  inline def apply(): SchemaPolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyDelta]
  }
  
  extension [Self <: SchemaPolicyDelta](x: Self) {
    
    inline def setBindingDeltas(value: js.Array[SchemaBindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    inline def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    inline def setBindingDeltasVarargs(value: SchemaBindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value :_*))
  }
}
