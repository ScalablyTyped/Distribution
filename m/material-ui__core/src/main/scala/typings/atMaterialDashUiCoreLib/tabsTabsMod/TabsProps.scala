package typings
package atMaterialDashUiCoreLib.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | 'onChange' | 'action' | 'component'> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]} */ trait TabsProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabsClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ScrollButtonComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var TabIndicatorProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.tabsTabIndicatorMod.TabIndicatorProps]] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ TabsActions, scala.Unit]] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TabsProps]] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorColor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var scrollButtons: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.on | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off
  ] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var textColor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | java.lang.String
  ] = js.undefined
  var value: js.Any
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.scrollable | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fullWidth
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    value: js.Any,
    ScrollButtonComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    TabIndicatorProps: stdLib.Partial[atMaterialDashUiCoreLib.tabsTabIndicatorMod.TabIndicatorProps] = null,
    action: /* actions */ TabsActions => scala.Unit = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TabsClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[TabsProps] = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    indicatorColor: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    onChange: (/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], /* value */ js.Any) => scala.Unit = null,
    scrollButtons: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.on | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    textColor: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | java.lang.String = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.scrollable | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fullWidth = null,
    width: java.lang.String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (ScrollButtonComponent != null) __obj.updateDynamic("ScrollButtonComponent")(ScrollButtonComponent.asInstanceOf[js.Any])
    if (TabIndicatorProps != null) __obj.updateDynamic("TabIndicatorProps")(TabIndicatorProps)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (indicatorColor != null) __obj.updateDynamic("indicatorColor")(indicatorColor.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (scrollButtons != null) __obj.updateDynamic("scrollButtons")(scrollButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TabsProps]
  }
}

