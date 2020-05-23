package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var epsilon: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
  var parenthesis: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var randomSeed: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    epsilon: js.UndefOr[Double] = js.undefined,
    matrix: String = null,
    number: String = null,
    parenthesis: String = null,
    precision: js.UndefOr[Double] = js.undefined,
    randomSeed: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(epsilon)) __obj.updateDynamic("epsilon")(epsilon.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (parenthesis != null) __obj.updateDynamic("parenthesis")(parenthesis.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (randomSeed != null) __obj.updateDynamic("randomSeed")(randomSeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

