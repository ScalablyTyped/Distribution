package typings
package kendoDashUiLib.kendoNs.mobileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends js.Object {
  var browserHistory: js.UndefOr[scala.Boolean] = js.undefined
  var hideAddressBar: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, scala.Unit]] = js.undefined
  var initial: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var modelScope: js.UndefOr[js.Object] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var retina: js.UndefOr[scala.Boolean] = js.undefined
  var serverNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var skin: js.UndefOr[java.lang.String] = js.undefined
  var statusBarStyle: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var updateDocumentTitle: js.UndefOr[scala.Boolean] = js.undefined
  var useNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined
}

object ApplicationOptions {
  @scala.inline
  def apply(
    browserHistory: js.UndefOr[scala.Boolean] = js.undefined,
    hideAddressBar: js.UndefOr[scala.Boolean] = js.undefined,
    init: /* e */ ApplicationEvent => scala.Unit = null,
    initial: java.lang.String = null,
    layout: java.lang.String = null,
    loading: java.lang.String = null,
    modelScope: js.Object = null,
    platform: java.lang.String = null,
    retina: js.UndefOr[scala.Boolean] = js.undefined,
    serverNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    skin: java.lang.String = null,
    statusBarStyle: java.lang.String = null,
    transition: java.lang.String = null,
    updateDocumentTitle: js.UndefOr[scala.Boolean] = js.undefined,
    useNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserHistory)) __obj.updateDynamic("browserHistory")(browserHistory)
    if (!js.isUndefined(hideAddressBar)) __obj.updateDynamic("hideAddressBar")(hideAddressBar)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (modelScope != null) __obj.updateDynamic("modelScope")(modelScope)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(retina)) __obj.updateDynamic("retina")(retina)
    if (!js.isUndefined(serverNavigation)) __obj.updateDynamic("serverNavigation")(serverNavigation)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (statusBarStyle != null) __obj.updateDynamic("statusBarStyle")(statusBarStyle)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (!js.isUndefined(updateDocumentTitle)) __obj.updateDynamic("updateDocumentTitle")(updateDocumentTitle)
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling)
    __obj.asInstanceOf[ApplicationOptions]
  }
}

