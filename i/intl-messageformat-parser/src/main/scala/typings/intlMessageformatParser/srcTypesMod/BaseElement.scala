package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElement[T /* <: TYPE */] extends StObject {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var `type`: T
  
  var value: String
}
object BaseElement {
  
  @scala.inline
  def apply[T /* <: TYPE */](`type`: T, value: String): BaseElement[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement[T]]
  }
  
  @scala.inline
  implicit class BaseElementMutableBuilder[Self <: BaseElement[?], T /* <: TYPE */] (val x: Self & BaseElement[T]) extends AnyVal {
    
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
