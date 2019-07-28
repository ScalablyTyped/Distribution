package typings.kendoDashUi.kendoNs.mobileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends js.Object {
  var browserHistory: js.UndefOr[Boolean] = js.undefined
  var hideAddressBar: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, Unit]] = js.undefined
  var initial: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var modelScope: js.UndefOr[js.Object] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var retina: js.UndefOr[Boolean] = js.undefined
  var serverNavigation: js.UndefOr[Boolean] = js.undefined
  var skin: js.UndefOr[String] = js.undefined
  var statusBarStyle: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var updateDocumentTitle: js.UndefOr[Boolean] = js.undefined
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
}

object ApplicationOptions {
  @scala.inline
  def apply(
    browserHistory: js.UndefOr[Boolean] = js.undefined,
    hideAddressBar: js.UndefOr[Boolean] = js.undefined,
    init: /* e */ ApplicationEvent => Unit = null,
    initial: String = null,
    layout: String = null,
    loading: String = null,
    modelScope: js.Object = null,
    platform: String = null,
    retina: js.UndefOr[Boolean] = js.undefined,
    serverNavigation: js.UndefOr[Boolean] = js.undefined,
    skin: String = null,
    statusBarStyle: String = null,
    transition: String = null,
    updateDocumentTitle: js.UndefOr[Boolean] = js.undefined,
    useNativeScrolling: js.UndefOr[Boolean] = js.undefined
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

