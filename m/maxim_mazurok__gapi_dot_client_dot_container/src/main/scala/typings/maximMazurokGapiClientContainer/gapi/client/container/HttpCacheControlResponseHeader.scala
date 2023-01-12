package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpCacheControlResponseHeader extends StObject {
  
  /** 14.6 response cache age, in seconds since the response is generated */
  var age: js.UndefOr[String] = js.undefined
  
  /** 14.9 request and response directives */
  var directive: js.UndefOr[String] = js.undefined
  
  /** 14.21 response cache expires, in RFC 1123 date format */
  var expires: js.UndefOr[String] = js.undefined
}
object HttpCacheControlResponseHeader {
  
  inline def apply(): HttpCacheControlResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCacheControlResponseHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpCacheControlResponseHeader] (val x: Self) extends AnyVal {
    
    inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
