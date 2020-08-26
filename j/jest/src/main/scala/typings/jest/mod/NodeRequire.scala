package typings.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRequire extends js.Object {
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    *
    * @deprecated Use `jest.requireActual` instead.
    */
  def requireActual(moduleName: String): js.Any = js.native
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    *
    * @deprecated Use `jest.requireMock`instead.
    */
  def requireMock(moduleName: String): js.Any = js.native
}

object NodeRequire {
  @scala.inline
  def apply(requireActual: String => js.Any, requireMock: String => js.Any): NodeRequire = {
    val __obj = js.Dynamic.literal(requireActual = js.Any.fromFunction1(requireActual), requireMock = js.Any.fromFunction1(requireMock))
    __obj.asInstanceOf[NodeRequire]
  }
  @scala.inline
  implicit class NodeRequireOps[Self <: NodeRequire] (val x: Self) extends AnyVal {
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
    def setRequireActual(value: String => js.Any): Self = this.set("requireActual", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireMock(value: String => js.Any): Self = this.set("requireMock", js.Any.fromFunction1(value))
  }
  
}

