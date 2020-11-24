package typings.jestMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single call to a mock function.
  */
@js.native
trait MockFunctionResult extends js.Object {
  
  /**
    * Indicates how the call completed.
    */
  var `type`: MockFunctionResultType = js.native
  
  /**
    * The value that was either thrown or returned by the function.
    * Undefined when type === 'incomplete'.
    */
  var value: js.Any = js.native
}
object MockFunctionResult {
  
  @scala.inline
  def apply(`type`: MockFunctionResultType, value: js.Any): MockFunctionResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockFunctionResult]
  }
  
  @scala.inline
  implicit class MockFunctionResultOps[Self <: MockFunctionResult] (val x: Self) extends AnyVal {
    
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
    def setType(value: MockFunctionResultType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
