package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var epsilon: js.UndefOr[scala.Double] = js.undefined
  var matrix: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
  var parenthesis: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var randomSeed: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    epsilon: scala.Int | scala.Double = null,
    matrix: java.lang.String = null,
    number: java.lang.String = null,
    parenthesis: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    randomSeed: java.lang.String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (number != null) __obj.updateDynamic("number")(number)
    if (parenthesis != null) __obj.updateDynamic("parenthesis")(parenthesis)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (randomSeed != null) __obj.updateDynamic("randomSeed")(randomSeed)
    __obj.asInstanceOf[ConfigOptions]
  }
}

