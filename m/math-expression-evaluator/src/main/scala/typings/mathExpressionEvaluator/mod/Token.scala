package typings.mathExpressionEvaluator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var preced: js.UndefOr[Double] = js.undefined
  var show: String
  var token: String
  var `type`: Double
  var value: js.UndefOr[String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    show: String,
    token: String,
    `type`: Double,
    preced: Int | Double = null,
    value: String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double]) = null
  ): Token = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (preced != null) __obj.updateDynamic("preced")(preced.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

