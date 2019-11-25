package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions extends js.Object {
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(conversionAccuracy: ConversionAccuracy = null): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

