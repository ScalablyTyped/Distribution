package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleInMod {
  
  @JSImport("material-ui/internal/ScaleIn", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScaleInProps, js.Object, js.Any]
  
  @js.native
  trait ScaleIn
    extends Component[ScaleInProps, js.Object, js.Any]
  
  @js.native
  trait ScaleInProps extends Props[ScaleIn] {
    
    var childStyle: js.UndefOr[CSSProperties] = js.native
    
    var enterDelay: js.UndefOr[Double] = js.native
    
    var maxScale: js.UndefOr[Double] = js.native
    
    var minScale: js.UndefOr[Double] = js.native
  }
  object ScaleInProps {
    
    @scala.inline
    def apply(): ScaleInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleInProps]
    }
    
    @scala.inline
    implicit class ScaleInPropsMutableBuilder[Self <: ScaleInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
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
    }
  }
}
