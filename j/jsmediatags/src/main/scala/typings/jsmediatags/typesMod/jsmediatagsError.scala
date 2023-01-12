package typings.jsmediatags.typesMod

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jsmediatagsError extends StObject {
  
  var info: String
  
  var `type`: String
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}
object jsmediatagsError {
  
  inline def apply(info: String, `type`: String): jsmediatagsError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsmediatagsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: jsmediatagsError] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
