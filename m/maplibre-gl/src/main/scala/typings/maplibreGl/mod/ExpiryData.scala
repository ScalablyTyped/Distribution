package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiryData extends StObject {
  
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  
  var expires: js.UndefOr[js.Date | String | Null] = js.undefined
}
object ExpiryData {
  
  inline def apply(): ExpiryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiryData]
  }
  
  extension [Self <: ExpiryData](x: Self) {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setExpires(value: js.Date | String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresNull: Self = StObject.set(x, "expires", null)
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
