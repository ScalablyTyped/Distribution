package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  @JSName(",")
  var Comma: String
  @JSName(".")
  var Dot: String
  var currency: Anon_Decimals
  var decimals: Double
  var groupSize: js.Array[Double]
  var pattern: js.Array[String]
  var percent: Anon_Decimals
}

object Anon_Currency {
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    currency: Anon_Decimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: Anon_Decimals
  ): Anon_Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Currency]
  }
}

