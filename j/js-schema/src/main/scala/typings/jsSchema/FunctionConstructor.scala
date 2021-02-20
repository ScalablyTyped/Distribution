package typings.jsSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionConstructor extends StObject {
  
  def reference(func: js.Function): FunctionConstructor = js.native
}
object FunctionConstructor {
  
  @scala.inline
  def apply(reference: js.Function => FunctionConstructor): FunctionConstructor = {
    val __obj = js.Dynamic.literal(reference = js.Any.fromFunction1(reference))
    __obj.asInstanceOf[FunctionConstructor]
  }
  
  @scala.inline
  implicit class FunctionConstructorMutableBuilder[Self <: FunctionConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference(value: js.Function => FunctionConstructor): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
  }
}
