package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var allowHideAfter: js.UndefOr[scala.Double] = js.undefined
  var animation: js.UndefOr[js.Any | scala.Boolean] = js.undefined
  var appendTo: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var autoHideAfter: js.UndefOr[scala.Double] = js.undefined
  var button: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ NotificationHideEvent, scala.Unit]] = js.undefined
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[NotificationPosition] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ NotificationShowEvent, scala.Unit]] = js.undefined
  var stacking: js.UndefOr[java.lang.String] = js.undefined
  var templates: js.UndefOr[js.Array[NotificationTemplate]] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    allowHideAfter: scala.Int | scala.Double = null,
    animation: js.Any | scala.Boolean = null,
    appendTo: java.lang.String | kendoDashUiLib.JQuery = null,
    autoHideAfter: scala.Int | scala.Double = null,
    button: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    hide: /* e */ NotificationHideEvent => scala.Unit = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    position: NotificationPosition = null,
    show: /* e */ NotificationShowEvent => scala.Unit = null,
    stacking: java.lang.String = null,
    templates: js.Array[NotificationTemplate] = null,
    width: scala.Double | java.lang.String = null
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

