package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var allowHideAfter: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[js.Any | Boolean] = js.undefined
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  var autoHideAfter: js.UndefOr[Double] = js.undefined
  var button: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ NotificationHideEvent, Unit]] = js.undefined
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[NotificationPosition] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ NotificationShowEvent, Unit]] = js.undefined
  var stacking: js.UndefOr[String] = js.undefined
  var templates: js.UndefOr[js.Array[NotificationTemplate]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    allowHideAfter: Int | Double = null,
    animation: js.Any | Boolean = null,
    appendTo: String | JQuery = null,
    autoHideAfter: Int | Double = null,
    button: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    hide: /* e */ NotificationHideEvent => Unit = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    position: NotificationPosition = null,
    show: /* e */ NotificationShowEvent => Unit = null,
    stacking: String = null,
    templates: js.Array[NotificationTemplate] = null,
    width: Double | String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (allowHideAfter != null) __obj.updateDynamic("allowHideAfter")(allowHideAfter.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (autoHideAfter != null) __obj.updateDynamic("autoHideAfter")(autoHideAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

