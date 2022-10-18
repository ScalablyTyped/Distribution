package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Large extends StObject {
  
  var large: js.UndefOr[BorderPad] = js.undefined
  
  var medium: js.UndefOr[BorderPad] = js.undefined
  
  var small: js.UndefOr[BorderPad] = js.undefined
}
object Large {
  
  inline def apply(): Large = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Large]
  }
  
  extension [Self <: Large](x: Self) {
    
    inline def setLarge(value: BorderPad): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: BorderPad): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: BorderPad): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
