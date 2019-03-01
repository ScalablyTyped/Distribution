package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.Props because var conflicts: children. Inlined key, ref */ trait DialogProps
  extends reactLib.reactMod.ReactNs.DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[java.lang.String] = js.undefined
  var actions: js.UndefOr[js.Array[DialogAction | reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var actionsContainerClassName: js.UndefOr[java.lang.String] = js.undefined
  var actionsContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var autoDetectWindowHeight: js.UndefOr[scala.Boolean] = js.undefined
  var autoScrollBodyContent: js.UndefOr[scala.Boolean] = js.undefined
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ scala.Boolean, scala.Unit]] = js.undefined
  var open: scala.Boolean
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var paperClassName: js.UndefOr[java.lang.String] = js.undefined
  var paperProps: js.UndefOr[js.Any] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[Dialog]] = js.undefined
  var repositionOnUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleClassName: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[js.Object] = null,
    Props: reactLib.reactMod.ReactNs.Props[Dialog] = null,
    actionFocus: java.lang.String = null,
    actions: js.Array[DialogAction | reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    actionsContainerClassName: java.lang.String = null,
    actionsContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    autoDetectWindowHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoScrollBodyContent: js.UndefOr[scala.Boolean] = js.undefined,
    bodyClassName: java.lang.String = null,
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    className: java.lang.String = null,
    contentClassName: java.lang.String = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onRequestClose: js.Function1[/* buttonClicked */ scala.Boolean, scala.Unit] = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    paperClassName: java.lang.String = null,
    paperProps: js.Any = null,
    repositionOnUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleClassName: java.lang.String = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("open")(open)
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName)
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle)
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight)
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent)
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(onRequestClose)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName)
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps)
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[DialogProps]
  }
}

