package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentContainerClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var initialSelectedIndex: js.UndefOr[scala.Double] = js.undefined
  var inkBarStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* e */ reactLib.reactMod.FormEvent[js.Object], 
      /* tab */ Tab, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabItemContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabTemplate: js.UndefOr[reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]] = js.undefined
  var tabTemplateStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contentContainerClassName: java.lang.String = null,
    contentContainerStyle: reactLib.reactMod.CSSProperties = null,
    initialSelectedIndex: scala.Int | scala.Double = null,
    inkBarStyle: reactLib.reactMod.CSSProperties = null,
    onChange: (/* value */ js.Any, /* e */ reactLib.reactMod.FormEvent[js.Object], /* tab */ Tab) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabItemContainerStyle: reactLib.reactMod.CSSProperties = null,
    tabTemplate: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = null,
    tabTemplateStyle: reactLib.reactMod.CSSProperties = null,
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

