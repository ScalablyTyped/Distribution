package typings.grommet.anon

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: js.UndefOr[top | typings.grommet.grommetStrings.bottom] = js.undefined
  
  var left: js.UndefOr[typings.grommet.grommetStrings.left | right] = js.undefined
  
  var right: js.UndefOr[left | typings.grommet.grommetStrings.right] = js.undefined
  
  var top: js.UndefOr[typings.grommet.grommetStrings.top | bottom] = js.undefined
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: top | bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: left | right): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: left | right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: top | bottom): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
