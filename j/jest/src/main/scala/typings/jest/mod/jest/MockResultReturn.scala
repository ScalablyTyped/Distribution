package typings.jest.mod.jest

import typings.jest.jestStrings.`return`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single call to a mock function with a return value.
  */
@js.native
trait MockResultReturn[T] extends MockResult[T] {
  
  var `type`: `return` = js.native
  
  var value: T = js.native
}
object MockResultReturn {
  
  @scala.inline
  def apply[T](`type`: `return`, value: T): MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultReturn[T]]
  }
  
  @scala.inline
  implicit class MockResultReturnMutableBuilder[Self <: MockResultReturn[_], T] (val x: Self with MockResultReturn[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
