package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var defaults: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(defaults: java.lang.String = null, formats: js.Object = null): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    __obj.asInstanceOf[MessageOptions]
  }
}

