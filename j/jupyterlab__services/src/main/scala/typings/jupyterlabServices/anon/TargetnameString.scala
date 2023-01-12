package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetnameString extends StObject {
  
  var target_name: String
}
object TargetnameString {
  
  inline def apply(target_name: String): TargetnameString = {
    val __obj = js.Dynamic.literal(target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetnameString] (val x: Self) extends AnyVal {
    
    inline def setTarget_name(value: String): Self = StObject.set(x, "target_name", value.asInstanceOf[js.Any])
  }
}
