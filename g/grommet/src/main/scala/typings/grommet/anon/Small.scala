package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Small extends StObject {
  
  var large: js.UndefOr[Pad] = js.undefined
  
  var medium: js.UndefOr[Pad] = js.undefined
  
  var small: js.UndefOr[Pad] = js.undefined
}
object Small {
  
  inline def apply(): Small = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Small]
  }
  
  extension [Self <: Small](x: Self) {
    
    inline def setLarge(value: Pad): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: Pad): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: Pad): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
