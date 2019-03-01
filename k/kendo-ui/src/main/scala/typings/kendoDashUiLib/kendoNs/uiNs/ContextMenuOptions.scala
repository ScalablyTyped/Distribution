package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, scala.Unit]] = js.undefined
  var alignToAnchor: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[scala.Boolean | ContextMenuAnimation] = js.undefined
  var appendTo: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, scala.Unit]] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var copyAnchorStyles: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, scala.Unit]] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var popupCollision: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, scala.Unit]] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
}

object ContextMenuOptions {
  @scala.inline
  def apply(
    activate: js.Function1[/* e */ ContextMenuActivateEvent, scala.Unit] = null,
    alignToAnchor: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | ContextMenuAnimation = null,
    appendTo: java.lang.String | kendoDashUiLib.JQuery = null,
    close: js.Function1[/* e */ ContextMenuCloseEvent, scala.Unit] = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    copyAnchorStyles: js.UndefOr[scala.Boolean] = js.undefined,
    dataSource: js.Any = null,
    deactivate: js.Function1[/* e */ ContextMenuDeactivateEvent, scala.Unit] = null,
    direction: java.lang.String = null,
    filter: java.lang.String = null,
    hoverDelay: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ ContextMenuOpenEvent, scala.Unit] = null,
    orientation: java.lang.String = null,
    popupCollision: java.lang.String = null,
    select: js.Function1[/* e */ ContextMenuSelectEvent, scala.Unit] = null,
    showOn: java.lang.String = null,
    target: java.lang.String | kendoDashUiLib.JQuery = null
  ): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (!js.isUndefined(alignToAnchor)) __obj.updateDynamic("alignToAnchor")(alignToAnchor)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(copyAnchorStyles)) __obj.updateDynamic("copyAnchorStyles")(copyAnchorStyles)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (popupCollision != null) __obj.updateDynamic("popupCollision")(popupCollision)
    if (select != null) __obj.updateDynamic("select")(select)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
}

