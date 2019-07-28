package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  var `,`: String
  var `.`: String
  var currency: Anon_Decimals
  var decimals: Double
  var groupSize: js.Array[Double]
  var pattern: js.Array[String]
  var percent: Anon_Decimals
}

object Anon_Currency {
  @scala.inline
  def apply(
    `,`: String,
    `.`: String,
    currency: Anon_Decimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: Anon_Decimals
  ): Anon_Currency = {
    val __obj = js.Dynamic.literal(currency = currency, decimals = decimals, groupSize = groupSize, pattern = pattern, percent = percent)
    __obj.updateDynamic(",")(`,`)
    __obj.updateDynamic(".")(`.`)
    __obj.asInstanceOf[Anon_Currency]
  }
}

