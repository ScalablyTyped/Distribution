package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Huge extends StObject {
  
  var huge: js.UndefOr[String] = js.undefined
  
  var large: js.UndefOr[String] = js.undefined
  
  var medium: js.UndefOr[String] = js.undefined
  
  var small: js.UndefOr[String] = js.undefined
  
  var xlarge: js.UndefOr[String] = js.undefined
}
object Huge {
  
  inline def apply(): Huge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Huge]
  }
  
  extension [Self <: Huge](x: Self) {
    
    inline def setHuge(value: String): Self = StObject.set(x, "huge", value.asInstanceOf[js.Any])
    
    inline def setHugeUndefined: Self = StObject.set(x, "huge", js.undefined)
    
    inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
  }
}
