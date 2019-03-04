package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathJSON extends js.Object {
  var fixPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var mathjs: js.UndefOr[java.lang.String] = js.undefined
  var unit: java.lang.String
  var value: scala.Double
}

object MathJSON {
  @scala.inline
  def apply(
    unit: java.lang.String,
    value: scala.Double,
    fixPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    mathjs: java.lang.String = null
  ): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit, value = value)
    if (!js.isUndefined(fixPrefix)) __obj.updateDynamic("fixPrefix")(fixPrefix)
    if (mathjs != null) __obj.updateDynamic("mathjs")(mathjs)
    __obj.asInstanceOf[MathJSON]
  }
}

