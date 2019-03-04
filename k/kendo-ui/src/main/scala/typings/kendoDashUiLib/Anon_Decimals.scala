package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  var `,`: java.lang.String
  var `.`: java.lang.String
  var decimals: scala.Double
  var groupSize: js.Array[scala.Double]
  var pattern: js.Array[java.lang.String]
  var symbol: java.lang.String
}

object Anon_Decimals {
  @scala.inline
  def apply(
    `,`: java.lang.String,
    `.`: java.lang.String,
    decimals: scala.Double,
    groupSize: js.Array[scala.Double],
    pattern: js.Array[java.lang.String],
    symbol: java.lang.String
  ): Anon_Decimals = {
    val __obj = js.Dynamic.literal(decimals = decimals, groupSize = groupSize, pattern = pattern, symbol = symbol)
    __obj.updateDynamic(",")(`,`)
    __obj.updateDynamic(".")(`.`)
    __obj.asInstanceOf[Anon_Decimals]
  }
}

