package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, Unit]] = js.undefined
  var alignToAnchor: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[Boolean | ContextMenuAnimation] = js.undefined
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, Unit]] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var copyAnchorStyles: js.UndefOr[Boolean] = js.undefined
  var dataContentField: js.UndefOr[String] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, Unit]] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var popupCollision: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean | ContextMenuScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, Unit]] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String | JQuery] = js.undefined
}

object ContextMenuOptions {
  @scala.inline
  def apply(
    activate: /* e */ ContextMenuActivateEvent => Unit = null,
    alignToAnchor: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | ContextMenuAnimation = null,
    appendTo: String | JQuery = null,
    close: /* e */ ContextMenuCloseEvent => Unit = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    copyAnchorStyles: js.UndefOr[Boolean] = js.undefined,
    dataContentField: String = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String = null,
    dataUrlField: String = null,
    deactivate: /* e */ ContextMenuDeactivateEvent => Unit = null,
    direction: String = null,
    filter: String = null,
    hoverDelay: Int | Double = null,
    name: String = null,
    open: /* e */ ContextMenuOpenEvent => Unit = null,
    orientation: String = null,
    popupCollision: String = null,
    scrollable: Boolean | ContextMenuScrollable = null,
    select: /* e */ ContextMenuSelectEvent => Unit = null,
    showOn: String = null,
    target: String | JQuery = null
  ): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (!js.isUndefined(alignToAnchor)) __obj.updateDynamic("alignToAnchor")(alignToAnchor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(copyAnchorStyles)) __obj.updateDynamic("copyAnchorStyles")(copyAnchorStyles.asInstanceOf[js.Any])
    if (dataContentField != null) __obj.updateDynamic("dataContentField")(dataContentField.asInstanceOf[js.Any])
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1(deactivate))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (popupCollision != null) __obj.updateDynamic("popupCollision")(popupCollision.asInstanceOf[js.Any])
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
}

