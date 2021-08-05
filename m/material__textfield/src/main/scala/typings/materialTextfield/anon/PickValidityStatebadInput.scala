package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.ValidityState, 'badInput' | 'valid'> */
trait PickValidityStatebadInput extends StObject {
  
  var badInput: Boolean
  
  var valid: Boolean
}
object PickValidityStatebadInput {
  
  inline def apply(badInput: Boolean, valid: Boolean): PickValidityStatebadInput = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickValidityStatebadInput]
  }
  
  extension [Self <: PickValidityStatebadInput](x: Self) {
    
    inline def setBadInput(value: Boolean): Self = StObject.set(x, "badInput", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
