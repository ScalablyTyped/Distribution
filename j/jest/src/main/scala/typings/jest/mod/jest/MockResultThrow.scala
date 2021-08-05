package typings.jest.mod.jest

import typings.jest.jestStrings.`throw`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single call to a mock function with a thrown error.
  */
trait MockResultThrow
  extends StObject
     with MockResult[js.Any] {
  
  var `type`: `throw`
  
  var value: js.Any
}
object MockResultThrow {
  
  inline def apply(value: js.Any): MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("throw")
    __obj.asInstanceOf[MockResultThrow]
  }
  
  extension [Self <: MockResultThrow](x: Self) {
    
    inline def setType(value: `throw`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
