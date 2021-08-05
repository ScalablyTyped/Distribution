package typings.inkBox

import org.scalablytyped.runtime.Shortcut
import typings.inkBox.anon.Bottom
import typings.inkBox.anon.BottomLeft
import typings.inkBox.inkBoxStrings.classic
import typings.inkBox.inkBoxStrings.double
import typings.inkBox.inkBoxStrings.doubleSingle
import typings.inkBox.inkBoxStrings.round
import typings.inkBox.inkBoxStrings.single
import typings.inkBox.inkBoxStrings.singleDouble
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-box", JSImport.Namespace)
  @js.native
  val ^ : FC[BoxProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.inkBox.inkBoxStrings.right
    - typings.inkBox.inkBoxStrings.center
    - typings.inkBox.inkBoxStrings.left
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typings.inkBox.inkBoxStrings.center = "center".asInstanceOf[typings.inkBox.inkBoxStrings.center]
    
    inline def left: typings.inkBox.inkBoxStrings.left = "left".asInstanceOf[typings.inkBox.inkBoxStrings.left]
    
    inline def right: typings.inkBox.inkBoxStrings.right = "right".asInstanceOf[typings.inkBox.inkBoxStrings.right]
  }
  
  trait BoxProps extends StObject {
    
    var align: js.UndefOr[Alignment] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderStyle: js.UndefOr[single | double | round | singleDouble | doubleSingle | classic | BottomLeft] = js.undefined
    
    var dimBorder: js.UndefOr[Boolean] = js.undefined
    
    var float: js.UndefOr[Alignment] = js.undefined
    
    var margin: js.UndefOr[Spacing] = js.undefined
    
    var padding: js.UndefOr[Spacing] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    extension [Self <: BoxProps](x: Self) {
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      inline def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      inline def setFloat(value: Alignment): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type Spacing = Double | Bottom
  
  type _To = FC[BoxProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[BoxProps] = ^
}
