package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions extends js.Object {
  var hide: js.UndefOr[js.Function1[/* e */ LayoutHideEvent, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ LayoutInitEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ LayoutShowEvent, scala.Unit]] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply(
    hide: js.Function1[/* e */ LayoutHideEvent, scala.Unit] = null,
    id: java.lang.String = null,
    init: js.Function1[/* e */ LayoutInitEvent, scala.Unit] = null,
    name: java.lang.String = null,
    platform: java.lang.String = null,
    show: js.Function1[/* e */ LayoutShowEvent, scala.Unit] = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (id != null) __obj.updateDynamic("id")(id)
    if (init != null) __obj.updateDynamic("init")(init)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[LayoutOptions]
  }
}

