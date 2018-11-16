package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TooltipOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | TooltipAnimation] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var callout: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | js.Function | TooltipContent] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ TooltipErrorEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var requestStart: js.UndefOr[js.Function1[/* e */ TooltipRequestStartEvent, scala.Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var showAfter: js.UndefOr[scala.Double] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

