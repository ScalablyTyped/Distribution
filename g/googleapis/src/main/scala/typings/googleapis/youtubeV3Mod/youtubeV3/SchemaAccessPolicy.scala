package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessPolicy extends StObject {
  
  /**
    * The value of allowed indicates whether the access to the policy is allowed or denied by default.
    */
  var allowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of region codes that identify countries where the default policy do not apply.
    */
  var exception: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAccessPolicy {
  
  inline def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  
  extension [Self <: SchemaAccessPolicy](x: Self) {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedNull: Self = StObject.set(x, "allowed", null)
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setException(value: js.Array[String]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionNull: Self = StObject.set(x, "exception", null)
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setExceptionVarargs(value: String*): Self = StObject.set(x, "exception", js.Array(value*))
  }
}
