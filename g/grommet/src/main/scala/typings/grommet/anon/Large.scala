package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Large extends StObject {
  
  var large: js.UndefOr[HeightSize] = js.undefined
  
  var medium: js.UndefOr[HeightSize] = js.undefined
  
  var small: js.UndefOr[HeightSize] = js.undefined
  
  var xlarge: js.UndefOr[HeightSize] = js.undefined
  
  var xsmall: js.UndefOr[HeightSize] = js.undefined
  
  var xxlarge: js.UndefOr[HeightSize] = js.undefined
}
object Large {
  
  inline def apply(): Large = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Large]
  }
  
  extension [Self <: Large](x: Self) {
    
    inline def setLarge(value: HeightSize): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: HeightSize): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: HeightSize): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: HeightSize): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    inline def setXsmall(value: HeightSize): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    
    inline def setXxlarge(value: HeightSize): Self = StObject.set(x, "xxlarge", value.asInstanceOf[js.Any])
    
    inline def setXxlargeUndefined: Self = StObject.set(x, "xxlarge", js.undefined)
  }
}
