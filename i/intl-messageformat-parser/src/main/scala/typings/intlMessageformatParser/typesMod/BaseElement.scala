package typings.intlMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElement[T /* <: TYPE */] extends StObject {
  
  var location: js.UndefOr[Location] = js.native
  
  var `type`: T = js.native
  
  var value: String = js.native
}
object BaseElement {
  
  @scala.inline
  def apply[T /* <: TYPE */](`type`: T, value: String): BaseElement[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement[T]]
  }
  
  @scala.inline
  implicit class BaseElementMutableBuilder[Self <: BaseElement[_], T /* <: TYPE */] (val x: Self with BaseElement[T]) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
