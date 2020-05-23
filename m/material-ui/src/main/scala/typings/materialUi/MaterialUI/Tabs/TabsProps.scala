package typings.materialUi.MaterialUI.Tabs

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FormEvent
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
    initialSelectedIndex: js.UndefOr[Double] = js.undefined,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ Tab) => Unit = null,
    style: CSSProperties = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ComponentClass[_, ComponentState] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSelectedIndex)) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.get.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

