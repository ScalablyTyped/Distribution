package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorted extends StObject {
  
  var sorted: Boolean
}
object Sorted {
  
  inline def apply(sorted: Boolean): Sorted = {
    val __obj = js.Dynamic.literal(sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorted] (val x: Self) extends AnyVal {
    
    inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
  }
}
