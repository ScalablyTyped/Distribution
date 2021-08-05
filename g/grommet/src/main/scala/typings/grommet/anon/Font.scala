package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var font: js.UndefOr[js.Object] = js.undefined
  
  var large: js.UndefOr[MaxWidth] = js.undefined
  
  var medium: js.UndefOr[MaxWidth] = js.undefined
  
  var small: js.UndefOr[MaxWidth] = js.undefined
  
  var xlarge: js.UndefOr[MaxWidth] = js.undefined
}
object Font {
  
  inline def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setFont(value: js.Object): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLarge(value: MaxWidth): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: MaxWidth): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: MaxWidth): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: MaxWidth): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
  }
}
