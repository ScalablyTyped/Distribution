package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconfigureSettings extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
  var windowTop: js.UndefOr[DOMWindow] = js.undefined
}

object ReconfigureSettings {
  @scala.inline
  def apply(url: java.lang.String = null, windowTop: DOMWindow = null): ReconfigureSettings = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    if (windowTop != null) __obj.updateDynamic("windowTop")(windowTop)
    __obj.asInstanceOf[ReconfigureSettings]
  }
}

