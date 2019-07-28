package typings.mathjs.mathjsMod

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
    epsilon: Int | Double = null,
    matrix: String = null,
    number: String = null,
    parenthesis: String = null,
    precision: Int | Double = null,
    randomSeed: String = null
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

