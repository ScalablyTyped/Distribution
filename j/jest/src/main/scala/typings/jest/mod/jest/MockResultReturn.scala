package typings.jest.mod.jest

import typings.jest.jestStrings.`return`
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
  implicit class MockResultReturnOps[Self <: MockResultReturn[_], T] (val x: Self with MockResultReturn[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: `return`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
