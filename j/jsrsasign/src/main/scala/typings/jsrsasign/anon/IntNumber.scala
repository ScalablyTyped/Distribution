package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntNumber extends StObject {
  
  var int: Double
}
object IntNumber {
  
  inline def apply(int: Double): IntNumber = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntNumber] (val x: Self) extends AnyVal {
    
    inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
  }
}
