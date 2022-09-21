package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeMedium extends StObject {
  
  var large: js.UndefOr[Double] = js.undefined
  
  var medium: js.UndefOr[Double] = js.undefined
  
  var small: js.UndefOr[Double] = js.undefined
}
object LargeMedium {
  
  inline def apply(): LargeMedium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LargeMedium]
  }
  
  extension [Self <: LargeMedium](x: Self) {
    
    inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
