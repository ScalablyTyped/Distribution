package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathJsJson extends StObject {
  
  /**
    * Returns reviver function that can be used as reviver in JSON.parse function.
    */
  def reviver(): js.Function2[/* key */ js.Any, /* value */ js.Any, _] = js.native
}
object MathJsJson {
  
  @scala.inline
  def apply(reviver: () => js.Function2[/* key */ js.Any, /* value */ js.Any, _]): MathJsJson = {
    val __obj = js.Dynamic.literal(reviver = js.Any.fromFunction0(reviver))
    __obj.asInstanceOf[MathJsJson]
  }
  
  @scala.inline
  implicit class MathJsJsonMutableBuilder[Self <: MathJsJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReviver(value: () => js.Function2[/* key */ js.Any, /* value */ js.Any, _]): Self = StObject.set(x, "reviver", js.Any.fromFunction0(value))
  }
}
