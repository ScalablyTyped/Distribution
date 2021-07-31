package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeAfterWrapperMod {
  
  @JSImport("material-ui/internal/BeforeAfterWrapper", JSImport.Default)
  @js.native
  class default ()
    extends Component[BeforeAfterWrapperProps, js.Object, js.Any]
  
  @js.native
  trait BeforeAfterWrapper
    extends Component[BeforeAfterWrapperProps, js.Object, js.Any]
  
  trait BeforeAfterWrapperProps
    extends StObject
       with Props[BeforeAfterWrapper] {
    
    var afterElementType: js.UndefOr[String] = js.undefined
    
    var afterStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var beforeElementType: js.UndefOr[String] = js.undefined
    
    var beforeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var elementType: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BeforeAfterWrapperProps {
    
    @scala.inline
    def apply(): BeforeAfterWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAfterWrapperProps]
    }
    
    @scala.inline
    implicit class BeforeAfterWrapperPropsMutableBuilder[Self <: BeforeAfterWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterElementType(value: String): Self = StObject.set(x, "afterElementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterElementTypeUndefined: Self = StObject.set(x, "afterElementType", js.undefined)
      
      @scala.inline
      def setAfterStyle(value: CSSProperties): Self = StObject.set(x, "afterStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterStyleUndefined: Self = StObject.set(x, "afterStyle", js.undefined)
      
      @scala.inline
      def setBeforeElementType(value: String): Self = StObject.set(x, "beforeElementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeElementTypeUndefined: Self = StObject.set(x, "beforeElementType", js.undefined)
      
      @scala.inline
      def setBeforeStyle(value: CSSProperties): Self = StObject.set(x, "beforeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeStyleUndefined: Self = StObject.set(x, "beforeStyle", js.undefined)
      
      @scala.inline
      def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
