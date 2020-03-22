package typings.handsontable

import typings.handsontable.handsontableStrings.custom
import typings.handsontable.mod.Handsontable.plugins.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomFunction extends js.Object {
  var `type`: custom
  def customFunction(endpoint: Endpoint): Double
}

object AnonCustomFunction {
  @scala.inline
  def apply(customFunction: Endpoint => Double, `type`: custom): AnonCustomFunction = {
    val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction1(customFunction))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomFunction]
  }
}

