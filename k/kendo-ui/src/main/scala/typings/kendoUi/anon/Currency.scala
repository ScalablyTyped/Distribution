package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  @JSName(",")
  var Comma: String
  @JSName(".")
  var Dot: String
  var currency: Decimals
  var decimals: Double
  var groupSize: js.Array[Double]
  var pattern: js.Array[String]
  var percent: Decimals
}

object Currency {
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    currency: Decimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: Decimals
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
}

