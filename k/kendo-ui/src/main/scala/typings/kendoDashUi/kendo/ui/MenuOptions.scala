package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | MenuAnimation] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, Unit]] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var dataContentField: js.UndefOr[String] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, Unit]] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, Unit]] = js.undefined
  var openOnClick: js.UndefOr[Boolean | MenuOpenOnClick] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var popupCollision: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean | MenuScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, Unit]] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(
    activate: /* e */ MenuActivateEvent => Unit = null,
    animation: Boolean | MenuAnimation = null,
    close: /* e */ MenuCloseEvent => Unit = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dataContentField: String = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String = null,
    dataUrlField: String = null,
    deactivate: /* e */ MenuDeactivateEvent => Unit = null,
    direction: String = null,
    hoverDelay: Int | Double = null,
    name: String = null,
    open: /* e */ MenuOpenEvent => Unit = null,
    openOnClick: Boolean | MenuOpenOnClick = null,
    orientation: String = null,
    popupCollision: String = null,
    scrollable: Boolean | MenuScrollable = null,
    select: /* e */ MenuSelectEvent => Unit = null
  ): MenuOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (dataContentField != null) __obj.updateDynamic("dataContentField")(dataContentField)
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField)
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField)
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1(deactivate))
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (openOnClick != null) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (popupCollision != null) __obj.updateDynamic("popupCollision")(popupCollision)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    __obj.asInstanceOf[MenuOptions]
  }
}

