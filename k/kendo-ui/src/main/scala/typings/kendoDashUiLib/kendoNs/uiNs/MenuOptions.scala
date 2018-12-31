package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | MenuAnimation] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, scala.Unit]] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, scala.Unit]] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, scala.Unit]] = js.undefined
  var openOnClick: js.UndefOr[scala.Boolean | MenuOpenOnClick] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var popupCollision: js.UndefOr[java.lang.String] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean | MenuScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, scala.Unit]] = js.undefined
}

