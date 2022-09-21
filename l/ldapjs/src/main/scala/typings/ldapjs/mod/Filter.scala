package typings.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  def matches(obj: Any): Boolean
  
  var `type`: String
}
object Filter {
  
  inline def apply(matches: Any => Boolean, `type`: String): Filter = {
    val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setMatches(value: Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
