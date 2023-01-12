package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vary extends StObject {
  
  var vary: Boolean
  
  var weak: Boolean
}
object Vary {
  
  inline def apply(vary: Boolean, weak: Boolean): Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vary] (val x: Self) extends AnyVal {
    
    inline def setVary(value: Boolean): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
  }
}
