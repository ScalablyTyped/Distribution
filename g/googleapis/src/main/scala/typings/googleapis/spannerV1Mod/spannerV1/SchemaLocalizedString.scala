package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalizedString extends StObject {
  
  /**
    * A map of arguments used when creating the localized message. Keys represent parameter names which may be used by the localized version when substituting dynamic values.
    */
  var args: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The canonical English version of this message. If no token is provided or the front-end has no message associated with the token, this text will be displayed as-is.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token identifying the message, e.g. 'METRIC_READ_CPU'. This should be unique within the service.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalizedString {
  
  inline def apply(): SchemaLocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedString]
  }
  
  extension [Self <: SchemaLocalizedString](x: Self) {
    
    inline def setArgs(value: StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
