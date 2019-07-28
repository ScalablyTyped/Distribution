package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoUnitOptions extends InfoOptions {
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
}

object InfoUnitOptions {
  @scala.inline
  def apply(locale: String = null, numberingSystem: NumberingSystem = null): InfoUnitOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    __obj.asInstanceOf[InfoUnitOptions]
  }
}

