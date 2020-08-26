package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.jestTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorException extends Event {
  var error: Exception = js.native
  var name: error_ = js.native
}

object ErrorException {
  @scala.inline
  def apply(error: Exception, name: error_): ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorException]
  }
  @scala.inline
  implicit class ErrorExceptionOps[Self <: ErrorException] (val x: Self) extends AnyVal {
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
    def setError(value: Exception): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: error_): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

