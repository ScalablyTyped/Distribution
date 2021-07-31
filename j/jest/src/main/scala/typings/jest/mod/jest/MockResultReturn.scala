package typings.jest.mod.jest

import typings.jest.jestStrings.`return`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single call to a mock function with a return value.
  */
trait MockResultReturn[T]
  extends StObject
     with MockResult[T] {
  
  var `type`: `return`
  
  var value: T
}
object MockResultReturn {
  
  @scala.inline
  def apply[T](value: T): MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("return")
    __obj.asInstanceOf[MockResultReturn[T]]
  }
  
  @scala.inline
  implicit class MockResultReturnMutableBuilder[Self <: MockResultReturn[?], T] (val x: Self & MockResultReturn[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
