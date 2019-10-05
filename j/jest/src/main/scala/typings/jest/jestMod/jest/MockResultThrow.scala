package typings.jest.jestMod.jest

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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MockResultThrow]
  }
}

