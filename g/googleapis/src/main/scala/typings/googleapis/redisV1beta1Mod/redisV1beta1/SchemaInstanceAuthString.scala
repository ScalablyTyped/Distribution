package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceAuthString extends StObject {
  
  /**
    * AUTH string set on the instance.
    */
  var authString: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceAuthString {
  
  inline def apply(): SchemaInstanceAuthString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceAuthString]
  }
  
  extension [Self <: SchemaInstanceAuthString](x: Self) {
    
    inline def setAuthString(value: String): Self = StObject.set(x, "authString", value.asInstanceOf[js.Any])
    
    inline def setAuthStringNull: Self = StObject.set(x, "authString", null)
    
    inline def setAuthStringUndefined: Self = StObject.set(x, "authString", js.undefined)
  }
}
