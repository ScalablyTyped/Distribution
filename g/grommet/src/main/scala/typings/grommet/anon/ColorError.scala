package typings.grommet.anon

import typings.grommet.utilsMod.BoxSideType
import typings.grommet.utilsMod.BoxSizeType
import typings.grommet.utilsMod.BoxStyleType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod._BorderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorError
  extends StObject
     with _BorderType {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var error: js.UndefOr[`5`] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var side: js.UndefOr[BoxSideType] = js.undefined
  
  var size: js.UndefOr[BoxSizeType] = js.undefined
  
  var style: js.UndefOr[BoxStyleType] = js.undefined
}
object ColorError {
  
  inline def apply(): ColorError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorError]
  }
  
  extension [Self <: ColorError](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setError(value: `5`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSide(value: BoxSideType): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: BoxSizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: BoxStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
