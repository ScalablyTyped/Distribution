package typings.handsontable.anon

import typings.handsontable.handsontableStrings.custom
import typings.handsontable.mod.Handsontable.plugins.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFunction extends js.Object {
  var `type`: custom
  def customFunction(endpoint: Endpoint): Double
}

object CustomFunction {
  @scala.inline
  def apply(customFunction: Endpoint => Double, `type`: custom): CustomFunction = {
    val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction1(customFunction))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFunction]
  }
}

