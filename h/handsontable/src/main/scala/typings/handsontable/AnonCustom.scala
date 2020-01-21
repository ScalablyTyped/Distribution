package typings.handsontable

import typings.handsontable.handsontableStrings.custom
import typings.handsontable.mod.Handsontable.plugins.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustom extends js.Object {
  var `type`: custom
  def customFunction(endpoint: Endpoint): Double
}

object AnonCustom {
  @scala.inline
  def apply(customFunction: Endpoint => Double, `type`: custom): AnonCustom = {
    val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction1(customFunction))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
}

