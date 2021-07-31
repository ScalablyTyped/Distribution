package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var inputs: js.Array[InputObject]
}
object Inputs {
  
  @scala.inline
  def apply(inputs: js.Array[InputObject]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit class InputsMutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[InputObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: InputObject*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
