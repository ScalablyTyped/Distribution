package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCookie extends StObject {
  
  /** Name. */
  var name: String
  
  /** Whether configured to override VU cookie jar. */
  var replace: Boolean
  
  /** Value. */
  var value: String
}
object RequestCookie {
  
  inline def apply(name: String, replace: Boolean, value: String): RequestCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCookie]
  }
  
  extension [Self <: RequestCookie](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
