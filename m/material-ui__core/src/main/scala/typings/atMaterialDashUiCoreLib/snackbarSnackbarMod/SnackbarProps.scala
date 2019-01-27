package typings
package atMaterialDashUiCoreLib.snackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Snackbar/Snackbar.SnackbarClassKey, never>) */ trait SnackbarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SnackbarClassKey] {
  var ClickAwayListenerProps: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.clickawaylistenerClickAwayListenerMod.ClickAwayListenerProps
    ]
  ] = js.undefined
  var ContentProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.snackbarcontentSnackbarContentMod.SnackbarContentProps]
  ] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var action: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var anchorOrigin: js.UndefOr[SnackbarOrigin] = js.undefined
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableWindowBlurListener: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onClose: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var open: scala.Boolean
  var resumeHideDuration: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

