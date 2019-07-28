package typings.materialDashUi.underscoreUnderscoreMaterialUINs.TabsNs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentContainerClassName: js.UndefOr[String] = js.undefined
  var contentContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var initialSelectedIndex: js.UndefOr[Double] = js.undefined
  var inkBarStyle: js.UndefOr[CSSProperties] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ Tab, Unit]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var tabTemplate: js.UndefOr[ComponentClass[_, ComponentState]] = js.undefined
  var tabTemplateStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    className: String = null,
    contentContainerClassName: String = null,
    contentContainerStyle: CSSProperties = null,
    initialSelectedIndex: Int | Double = null,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ Tab) => Unit = null,
    style: CSSProperties = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ComponentClass[_, ComponentState] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName)
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle)
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle)
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate)
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TabsProps]
  }
}

