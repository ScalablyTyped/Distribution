package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandTransitionMod {
  
  @JSImport("material-ui/internal/ExpandTransition", JSImport.Default)
  @js.native
  class default ()
    extends Component[ExpandTransitionProps, js.Object, js.Any]
  
  @js.native
  trait ExpandTransition
    extends Component[ExpandTransitionProps, js.Object, js.Any]
  
  @js.native
  trait ExpandTransitionProps extends Props[ExpandTransition] {
    
    var enterDelay: js.UndefOr[Double] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionDelay: js.UndefOr[Double] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object ExpandTransitionProps {
    
    @scala.inline
    def apply(): ExpandTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandTransitionProps]
    }
    
    @scala.inline
    implicit class ExpandTransitionPropsMutableBuilder[Self <: ExpandTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionDelay(value: Double): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
