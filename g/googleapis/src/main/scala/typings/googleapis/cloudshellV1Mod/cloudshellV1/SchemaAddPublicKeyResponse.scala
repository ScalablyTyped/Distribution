package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddPublicKeyResponse extends StObject {
  
  /**
    * Key that was added to the environment.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddPublicKeyResponse {
  
  inline def apply(): SchemaAddPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddPublicKeyResponse]
  }
  
  extension [Self <: SchemaAddPublicKeyResponse](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
