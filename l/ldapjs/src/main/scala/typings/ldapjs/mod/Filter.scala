package typings.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  def matches(obj: js.Any): Boolean = js.native
  
  var `type`: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(matches: js.Any => Boolean, `type`: String): Filter = {
    val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
