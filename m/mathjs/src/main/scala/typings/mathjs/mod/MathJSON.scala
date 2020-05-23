package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathJSON extends js.Object {
  var fixPrefix: js.UndefOr[Boolean] = js.undefined
  var mathjs: js.UndefOr[String] = js.undefined
  var unit: String
  var value: Double
}

object MathJSON {
  @scala.inline
  def apply(unit: String, value: Double, fixPrefix: js.UndefOr[Boolean] = js.undefined, mathjs: String = null): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(fixPrefix)) __obj.updateDynamic("fixPrefix")(fixPrefix.get.asInstanceOf[js.Any])
    if (mathjs != null) __obj.updateDynamic("mathjs")(mathjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJSON]
  }
}

