package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utils definitions
trait Utils extends StObject {
  
  /**
    * Function that converts an object to a string in base64.
    *
    * @param obj object to be converted.
    */
  def b64stringify(obj: js.Object): String
  
  /**
    * Function that converts a number to hexadecimal string.
    *
    * @param number number to be converted.
    */
  def toHex(number: Double): String
}
object Utils {
  
  inline def apply(b64stringify: js.Object => String, toHex: Double => String): Utils = {
    val __obj = js.Dynamic.literal(b64stringify = js.Any.fromFunction1(b64stringify), toHex = js.Any.fromFunction1(toHex))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    inline def setB64stringify(value: js.Object => String): Self = StObject.set(x, "b64stringify", js.Any.fromFunction1(value))
    
    inline def setToHex(value: Double => String): Self = StObject.set(x, "toHex", js.Any.fromFunction1(value))
  }
}
