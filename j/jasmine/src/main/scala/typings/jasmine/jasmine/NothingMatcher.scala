package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NothingMatcher extends StObject {
  
  def nothing(): Unit
}
object NothingMatcher {
  
  inline def apply(nothing: () => Unit): NothingMatcher = {
    val __obj = js.Dynamic.literal(nothing = js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[NothingMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NothingMatcher] (val x: Self) extends AnyVal {
    
    inline def setNothing(value: () => Unit): Self = StObject.set(x, "nothing", js.Any.fromFunction0(value))
  }
}
