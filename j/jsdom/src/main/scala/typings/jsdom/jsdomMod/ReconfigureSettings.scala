package typings.jsdom.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconfigureSettings extends js.Object {
  var url: js.UndefOr[String] = js.undefined
  var windowTop: js.UndefOr[DOMWindow] = js.undefined
}

object ReconfigureSettings {
  @scala.inline
  def apply(url: String = null, windowTop: DOMWindow = null): ReconfigureSettings = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowTop != null) __obj.updateDynamic("windowTop")(windowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconfigureSettings]
  }
}

