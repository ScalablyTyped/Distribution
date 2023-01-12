package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normal extends StObject {
  
  var normal: Map
}
object Normal {
  
  inline def apply(normal: Map): Normal = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Normal] (val x: Self) extends AnyVal {
    
    inline def setNormal(value: Map): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
  }
}
