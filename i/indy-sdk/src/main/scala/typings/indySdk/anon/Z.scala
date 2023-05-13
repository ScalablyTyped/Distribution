package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Z extends StObject {
  
  var z: String
}
object Z {
  
  inline def apply(z: String): Z = {
    val __obj = js.Dynamic.literal(z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Z]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Z] (val x: Self) extends AnyVal {
    
    inline def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
