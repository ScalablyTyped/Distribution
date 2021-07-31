package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleInChildMod {
  
  @JSImport("material-ui/internal/ScaleInChild", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScaleInChildProps, js.Object, js.Any]
  
  @js.native
  trait ScaleInChild
    extends Component[ScaleInChildProps, js.Object, js.Any]
  
  trait ScaleInChildProps
    extends StObject
       with Props[ScaleInChild] {
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ScaleInChildProps {
    
    @scala.inline
    def apply(): ScaleInChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleInChildProps]
    }
    
    @scala.inline
    implicit class ScaleInChildPropsMutableBuilder[Self <: ScaleInChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
