package typings.materialBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var msMatchesSelector: js.UndefOr[js.Function1[/* selector */ String, Boolean]] = js.undefined
}
object Element {
  
  inline def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setMsMatchesSelector(value: /* selector */ String => Boolean): Self = StObject.set(x, "msMatchesSelector", js.Any.fromFunction1(value))
    
    inline def setMsMatchesSelectorUndefined: Self = StObject.set(x, "msMatchesSelector", js.undefined)
  }
}
