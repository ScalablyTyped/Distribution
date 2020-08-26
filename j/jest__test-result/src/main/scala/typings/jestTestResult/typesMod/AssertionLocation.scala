package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionLocation extends js.Object {
  var fullName: String = js.native
  var path: String = js.native
}

object AssertionLocation {
  @scala.inline
  def apply(fullName: String, path: String): AssertionLocation = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionLocation]
  }
  @scala.inline
  implicit class AssertionLocationOps[Self <: AssertionLocation] (val x: Self) extends AnyVal {
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
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

