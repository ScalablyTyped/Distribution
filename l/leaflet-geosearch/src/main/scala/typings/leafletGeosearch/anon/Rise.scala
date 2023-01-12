package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rise extends StObject {
  
  var rise: Apparent
  
  var set: Apparent
}
object Rise {
  
  inline def apply(rise: Apparent, set: Apparent): Rise = {
    val __obj = js.Dynamic.literal(rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rise] (val x: Self) extends AnyVal {
    
    inline def setRise(value: Apparent): Self = StObject.set(x, "rise", value.asInstanceOf[js.Any])
    
    inline def setSet(value: Apparent): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
