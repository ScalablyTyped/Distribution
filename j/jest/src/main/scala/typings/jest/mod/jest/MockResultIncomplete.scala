package typings.jest.mod.jest

import typings.jest.jestStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single incomplete call to a mock function.
  */
trait MockResultIncomplete
  extends StObject
     with MockResult[js.Any] {
  
  var `type`: incomplete
  
  var value: Unit
}
object MockResultIncomplete {
  
  inline def apply(value: Unit): MockResultIncomplete = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("incomplete")
    __obj.asInstanceOf[MockResultIncomplete]
  }
  
  extension [Self <: MockResultIncomplete](x: Self) {
    
    inline def setType(value: incomplete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
