package typings.jest.jestMod.jest

import typings.jest.jestStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a single incomplete call to a mock function.
  */
trait MockResultIncomplete
  extends MockResult[js.Any] {
  var `type`: incomplete
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object MockResultIncomplete {
  @scala.inline
  def apply(`type`: incomplete, value: js.UndefOr[scala.Nothing] = js.undefined): MockResultIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultIncomplete]
  }
}

