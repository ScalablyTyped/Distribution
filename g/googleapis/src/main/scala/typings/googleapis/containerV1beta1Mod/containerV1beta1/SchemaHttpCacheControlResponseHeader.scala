package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpCacheControlResponseHeader extends StObject {
  
  /**
    * 14.6 response cache age, in seconds since the response is generated
    */
  var age: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 14.9 request and response directives
    */
  var directive: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 14.21 response cache expires, in RFC 1123 date format
    */
  var expires: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpCacheControlResponseHeader {
  
  inline def apply(): SchemaHttpCacheControlResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpCacheControlResponseHeader]
  }
  
  extension [Self <: SchemaHttpCacheControlResponseHeader](x: Self) {
    
    inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeNull: Self = StObject.set(x, "age", null)
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveNull: Self = StObject.set(x, "directive", null)
    
    inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresNull: Self = StObject.set(x, "expires", null)
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
