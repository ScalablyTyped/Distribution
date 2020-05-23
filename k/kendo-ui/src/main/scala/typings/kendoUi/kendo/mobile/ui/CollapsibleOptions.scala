package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleOptions extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.undefined
  var expandIcon: js.UndefOr[String] = js.undefined
  var iconPosition: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object CollapsibleOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    collapse: /* e */ CollapsibleEvent => Unit = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    expand: /* e */ CollapsibleEvent => Unit = null,
    expandIcon: String = null,
    iconPosition: String = null,
    inset: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

