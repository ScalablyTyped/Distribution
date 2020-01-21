package typings.jest.mod.jest

import typings.jest.jestStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a single call to a mock function with a thrown error.
  */
trait MockResultThrow
  extends MockResult[js.Any] {
  var `type`: `throw`
  var value: js.Any
}

object MockResultThrow {
  @scala.inline
  def apply(`type`: `throw`, value: js.Any): MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultThrow]
  }
}

