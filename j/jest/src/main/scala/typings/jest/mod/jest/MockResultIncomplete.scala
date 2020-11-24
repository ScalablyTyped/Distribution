package typings.jest.mod.jest

import typings.jest.jestStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single incomplete call to a mock function.
  */
@js.native
trait MockResultIncomplete
  extends MockResult[js.Any] {
  
  var `type`: incomplete = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
}
object MockResultIncomplete {
  
  @scala.inline
  def apply(`type`: incomplete): MockResultIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultIncomplete]
  }
  
  @scala.inline
  implicit class MockResultIncompleteOps[Self <: MockResultIncomplete] (val x: Self) extends AnyVal {
    
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
    def setType(value: incomplete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
