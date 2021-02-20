package typings.jest.mod.jest

import typings.jest.jestStrings.`throw`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single call to a mock function with a thrown error.
  */
@js.native
trait MockResultThrow
  extends MockResult[js.Any] {
  
  var `type`: `throw` = js.native
  
  var value: js.Any = js.native
}
object MockResultThrow {
  
  @scala.inline
  def apply(`type`: `throw`, value: js.Any): MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultThrow]
  }
  
  @scala.inline
  implicit class MockResultThrowMutableBuilder[Self <: MockResultThrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `throw`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
