package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathJsJson extends StObject {
  
  /**
    * Returns reviver function that can be used as reviver in JSON.parse function.
    */
  def reviver(): js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]
}
object MathJsJson {
  
  inline def apply(reviver: () => js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]): MathJsJson = {
    val __obj = js.Dynamic.literal(reviver = js.Any.fromFunction0(reviver))
    __obj.asInstanceOf[MathJsJson]
  }
  
  extension [Self <: MathJsJson](x: Self) {
    
    inline def setReviver(value: () => js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]): Self = StObject.set(x, "reviver", js.Any.fromFunction0(value))
  }
}
