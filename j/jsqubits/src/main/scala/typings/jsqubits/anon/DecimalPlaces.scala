package typings.jsqubits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecimalPlaces extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.undefined
}

object DecimalPlaces {
  @scala.inline
  def apply(decimalPlaces: js.UndefOr[Double] = js.undefined): DecimalPlaces = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimalPlaces)) __obj.updateDynamic("decimalPlaces")(decimalPlaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalPlaces]
  }
}

