package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.ValidityState, 'badInput' | 'valid'> */
@js.native
trait PickValidityStatebadInput extends StObject {
  
  var badInput: Boolean = js.native
  
  var valid: Boolean = js.native
}
object PickValidityStatebadInput {
  
  @scala.inline
  def apply(badInput: Boolean, valid: Boolean): PickValidityStatebadInput = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickValidityStatebadInput]
  }
  
  @scala.inline
  implicit class PickValidityStatebadInputMutableBuilder[Self <: PickValidityStatebadInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadInput(value: Boolean): Self = StObject.set(x, "badInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
