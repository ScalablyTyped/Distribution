package typings.grommet.anon

import typings.grommet.listMod.PadSizeType
import typings.grommet.listMod._PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left
  extends StObject
     with _PadType {
  
  var bottom: js.UndefOr[PadSizeType] = js.undefined
  
  var horizontal: js.UndefOr[PadSizeType] = js.undefined
  
  var left: js.UndefOr[PadSizeType] = js.undefined
  
  var right: js.UndefOr[PadSizeType] = js.undefined
  
  var top: js.UndefOr[PadSizeType] = js.undefined
  
  var vertical: js.UndefOr[PadSizeType] = js.undefined
}
object Left {
  
  inline def apply(): Left = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setBottom(value: PadSizeType): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setHorizontal(value: PadSizeType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setLeft(value: PadSizeType): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: PadSizeType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: PadSizeType): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVertical(value: PadSizeType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
