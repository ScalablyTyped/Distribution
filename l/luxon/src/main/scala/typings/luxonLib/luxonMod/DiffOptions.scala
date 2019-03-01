package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions extends js.Object {
  var conversionAccuracy: js.UndefOr[java.lang.String] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(conversionAccuracy: java.lang.String = null): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy)
    __obj.asInstanceOf[DiffOptions]
  }
}

