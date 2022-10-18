package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatted
  extends StObject
     with _Value {
  
  def isEmpty(): Boolean
  
  var sections: js.Array[FormattedSection]
}
object Formatted {
  
  inline def apply(isEmpty: () => Boolean, sections: js.Array[FormattedSection]): Formatted = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatted]
  }
  
  extension [Self <: Formatted](x: Self) {
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setSections(value: js.Array[FormattedSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: FormattedSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
