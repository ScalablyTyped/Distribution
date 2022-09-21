package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceMessage extends StObject {
  
  /**
    * A code that correspond to one type of user-facing message.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message on memcached instance which will be exposed to users.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceMessage {
  
  inline def apply(): SchemaInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceMessage]
  }
  
  extension [Self <: SchemaInstanceMessage](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
