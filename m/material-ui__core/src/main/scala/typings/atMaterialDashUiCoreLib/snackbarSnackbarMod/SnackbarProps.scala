package typings
package atMaterialDashUiCoreLib.snackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never>> : never */ trait SnackbarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SnackbarClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ClickAwayListenerProps: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
    ]
  ] = js.undefined
  var ContentProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.snackbarContentSnackbarContentMod.SnackbarContentProps]
  ] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var action: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var anchorOrigin: js.UndefOr[SnackbarOrigin] = js.undefined
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var disableWindowBlurListener: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClose: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.SyntheticEvent[_, reactLib.Event], 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
  var open: scala.Boolean
  var resumeHideDuration: js.UndefOr[scala.Double] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    ClickAwayListenerProps: stdLib.Partial[
      atMaterialDashUiCoreLib.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
    ] = null,
    ContentProps: stdLib.Partial[atMaterialDashUiCoreLib.snackbarContentSnackbarContentMod.SnackbarContentProps] = null,
    TransitionComponent: reactLib.reactMod.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = null,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null,
    action: reactLib.reactMod.ReactNode = null,
    anchorOrigin: SnackbarOrigin = null,
    autoHideDuration: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SnackbarClassKey]] = null,
    disableWindowBlurListener: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    message: reactLib.reactMod.ReactNode = null,
    onClose: (/* event */ reactLib.reactMod.SyntheticEvent[_, reactLib.Event], /* reason */ java.lang.String) => scala.Unit = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[_] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[_] = null,
    resumeHideDuration: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionDuration: scala.Double | reactDashTransitionDashGroupLib.Anon_Enter = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (ClickAwayListenerProps != null) __obj.updateDynamic("ClickAwayListenerProps")(ClickAwayListenerProps)
    if (ContentProps != null) __obj.updateDynamic("ContentProps")(ContentProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableWindowBlurListener)) __obj.updateDynamic("disableWindowBlurListener")(disableWindowBlurListener)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (resumeHideDuration != null) __obj.updateDynamic("resumeHideDuration")(resumeHideDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

