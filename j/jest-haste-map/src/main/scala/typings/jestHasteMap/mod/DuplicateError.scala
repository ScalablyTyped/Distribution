package typings.jestHasteMap.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateError extends Error {
  var mockPath1: String = js.native
  var mockPath2: String = js.native
}

object DuplicateError {
  @scala.inline
  def apply(message: String, mockPath1: String, mockPath2: String, name: String): DuplicateError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], mockPath1 = mockPath1.asInstanceOf[js.Any], mockPath2 = mockPath2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateError]
  }
  @scala.inline
  implicit class DuplicateErrorOps[Self <: DuplicateError] (val x: Self) extends AnyVal {
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
    def setMockPath1(value: String): Self = this.set("mockPath1", value.asInstanceOf[js.Any])
    @scala.inline
    def setMockPath2(value: String): Self = this.set("mockPath2", value.asInstanceOf[js.Any])
  }
  
}

