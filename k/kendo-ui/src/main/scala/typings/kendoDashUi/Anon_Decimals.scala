package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  @JSName(",")
  var Comma: String
  @JSName(".")
  var Dot: String
  var decimals: Double
  var groupSize: js.Array[Double]
  var pattern: js.Array[String]
  var symbol: String
}

object Anon_Decimals {
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    symbol: String
  ): Anon_Decimals = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Decimals]
  }
}

