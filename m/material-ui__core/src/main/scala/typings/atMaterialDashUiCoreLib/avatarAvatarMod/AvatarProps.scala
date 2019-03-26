package typings
package atMaterialDashUiCoreLib.avatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait AvatarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[AvatarClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var childrenClassName: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[AvatarProps]] = js.undefined
  var imgProps: js.UndefOr[reactLib.reactMod.ReactNs.HtmlHTMLAttributes[stdLib.HTMLImageElement]] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    childrenClassName: java.lang.String = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[AvatarClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[AvatarProps] = null,
    imgProps: reactLib.reactMod.ReactNs.HtmlHTMLAttributes[stdLib.HTMLImageElement] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    sizes: java.lang.String = null,
    src: java.lang.String = null,
    srcSet: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (childrenClassName != null) __obj.updateDynamic("childrenClassName")(childrenClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AvatarProps]
  }
}

