package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.materialUiCoreStrings.auto
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object growGrowMod extends Shortcut {
  
  @JSImport("@material-ui/core/Grow/Grow", JSImport.Default)
  @js.native
  val default: ComponentType[GrowProps] = js.native
  
  /* Inlined parent @material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, 'timeout'> */
  trait GrowProps extends StObject {
    
    var addEndListener: js.UndefOr[js.Any] = js.undefined
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    var in: js.UndefOr[js.Any] = js.undefined
    
    var mountOnEnter: js.UndefOr[js.Any] = js.undefined
    
    var onEnter: js.UndefOr[js.Any] = js.undefined
    
    var onEntered: js.UndefOr[js.Any] = js.undefined
    
    var onEntering: js.UndefOr[js.Any] = js.undefined
    
    var onExit: js.UndefOr[js.Any] = js.undefined
    
    var onExited: js.UndefOr[js.Any] = js.undefined
    
    var onExiting: js.UndefOr[js.Any] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var timeout: js.UndefOr[js.Any | auto] = js.undefined
    
    var unmountOnExit: js.UndefOr[js.Any] = js.undefined
  }
  object GrowProps {
    
    @scala.inline
    def apply(): GrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrowProps]
    }
    
    @scala.inline
    implicit class GrowPropsMutableBuilder[Self <: GrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEndListener(value: js.Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setIn(value: js.Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTimeout(value: js.Any | auto): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
  
  type _To = ComponentType[GrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `growGrowMod.foo` */
  override def _to: ComponentType[GrowProps] = default
}
