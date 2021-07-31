package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.horizontal
import typings.materialUi.materialUiStrings.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  trait SnackbarProps
    extends StObject
       with Props[Snackbar] {
    
    var action: js.UndefOr[String] = js.undefined
    
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var message: String | Element
    
    var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    /** @deprecated Use the open property to control the component instead */
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // DEPRECATED
    def onRequestClose(reason: String): Unit
    
    /** @deprecated Use the open property to control the component instead */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // DEPRECATED
    var open: Boolean
    
    /** @deprecated Use the open property to control the component instead */
    var openOnMount: js.UndefOr[Boolean] = js.undefined
  }
  object SnackbarProps {
    
    @scala.inline
    def apply(message: String | Element, onRequestClose: String => Unit, open: Boolean): typings.materialUi.MaterialUI.Stepper.SnackbarProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.materialUi.MaterialUI.Stepper.SnackbarProps]
    }
    
    @scala.inline
    implicit class SnackbarPropsMutableBuilder[Self <: typings.materialUi.MaterialUI.Stepper.SnackbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMessage(value: String | Element): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActionClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: String => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnMount(value: Boolean): Self = StObject.set(x, "openOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnMountUndefined: Self = StObject.set(x, "openOnMount", js.undefined)
    }
  }
  
  type Step = Component[StepProps, js.Object, js.Any]
  
  @js.native
  trait StepButton
    extends Component[StepButtonProps, js.Object, js.Any]
  
  trait StepButtonProps
    extends StObject
       with SharedEnhancedButtonProps[StepButton] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode | String | Double] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  }
  object StepButtonProps {
    
    @scala.inline
    def apply(): StepButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepButtonProps]
    }
    
    @scala.inline
    implicit class StepButtonPropsMutableBuilder[Self <: StepButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode | String | Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  type StepContent = Component[StepContentProps, js.Object, js.Any]
  
  trait StepContentProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var last: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StepContentProps {
    
    @scala.inline
    def apply(): StepContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepContentProps]
    }
    
    @scala.inline
    implicit class StepContentPropsMutableBuilder[Self <: StepContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type StepLabel = Component[StepLabelProps, js.Object, js.Any]
  
  trait StepLabelProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode | String | Double] = js.undefined
    
    var iconContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StepLabelProps {
    
    @scala.inline
    def apply(): StepLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepLabelProps]
    }
    
    @scala.inline
    implicit class StepLabelPropsMutableBuilder[Self <: StepLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode | String | Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerStyle(value: CSSProperties): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait StepProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class StepPropsMutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Stepper = Component[StepperProps, js.Object, js.Any]
  
  trait StepperProps extends StObject {
    
    var activeStep: js.UndefOr[Double] = js.undefined
    
    var linear: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StepperProps {
    
    @scala.inline
    def apply(): StepperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepperProps]
    }
    
    @scala.inline
    implicit class StepperPropsMutableBuilder[Self <: StepperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStepUndefined: Self = StObject.set(x, "activeStep", js.undefined)
      
      @scala.inline
      def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
