package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeOptions extends StObject {
  
  /**
    * Boolean if set to true will decode a valid headless token. Default is false.
    */
  var headless: Boolean
}
object DecodeOptions {
  
  inline def apply(headless: Boolean): DecodeOptions = {
    val __obj = js.Dynamic.literal(headless = headless.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
  }
}
