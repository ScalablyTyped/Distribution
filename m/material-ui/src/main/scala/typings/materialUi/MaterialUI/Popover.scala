package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  type Popover = Component[PopoverProps, js.Object, js.Any]
  
  type PopoverAnimationDefault = Component[PopoverAnimationDefaultProps, js.Object, js.Any]
  
  @js.native
  trait PopoverAnimationDefaultProps extends PopoverAnimationProps {
    
    var className: js.UndefOr[String] = js.native
    
    var targetOrigin: js.UndefOr[origin] = js.native
    
    var zDepth: js.UndefOr[Double] = js.native
  }
  object PopoverAnimationDefaultProps {
    
    @scala.inline
    def apply(open: Boolean): PopoverAnimationDefaultProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationDefaultProps]
    }
    
    @scala.inline
    implicit class PopoverAnimationDefaultPropsMutableBuilder[Self <: PopoverAnimationDefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      @scala.inline
      def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
  
  @js.native
  trait PopoverAnimationProps extends StObject {
    
    var open: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PopoverAnimationProps {
    
    @scala.inline
    def apply(open: Boolean): PopoverAnimationProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationProps]
    }
    
    @scala.inline
    implicit class PopoverAnimationPropsMutableBuilder[Self <: PopoverAnimationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type PopoverAnimationVertical = Component[PopoverAnimationVerticalProps, js.Object, js.Any]
  
  @js.native
  trait PopoverAnimationVerticalProps extends PopoverAnimationProps {
    
    var className: js.UndefOr[String] = js.native
    
    var targetOrigin: js.UndefOr[origin] = js.native
    
    var zDepth: js.UndefOr[Double] = js.native
  }
  object PopoverAnimationVerticalProps {
    
    @scala.inline
    def apply(open: Boolean): PopoverAnimationVerticalProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationVerticalProps]
    }
    
    @scala.inline
    implicit class PopoverAnimationVerticalPropsMutableBuilder[Self <: PopoverAnimationVerticalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      @scala.inline
      def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
  
  @js.native
  trait PopoverProps extends StObject {
    
    var anchorEl: js.UndefOr[ReactInstance] = js.native
    
    var anchorOrigin: js.UndefOr[origin] = js.native
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
    
    var autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.native
    
    var canAutoPosition: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var targetOrigin: js.UndefOr[origin] = js.native
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.native
    
    var zDepth: js.UndefOr[Double] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorEl(value: ReactInstance): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      @scala.inline
      def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoCloseWhenOffScreen(value: Boolean): Self = StObject.set(x, "autoCloseWhenOffScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseWhenOffScreenUndefined: Self = StObject.set(x, "autoCloseWhenOffScreen", js.undefined)
      
      @scala.inline
      def setCanAutoPosition(value: Boolean): Self = StObject.set(x, "canAutoPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanAutoPositionUndefined: Self = StObject.set(x, "canAutoPosition", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: /* reason */ String => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      @scala.inline
      def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
      
      @scala.inline
      def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
}
