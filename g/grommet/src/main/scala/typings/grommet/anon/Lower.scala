package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lower extends StObject {
  
  var lower: js.UndefOr[String] = js.undefined
  
  var upper: js.UndefOr[String] = js.undefined
}
object Lower {
  
  inline def apply(): Lower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lower]
  }
  
  extension [Self <: Lower](x: Self) {
    
    inline def setLower(value: String): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    inline def setUpper(value: String): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}
