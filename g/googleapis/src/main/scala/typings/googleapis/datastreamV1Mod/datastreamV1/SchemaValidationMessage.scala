package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationMessage extends StObject {
  
  /**
    * A custom code identifying this specific message.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message severity level (warning or error).
    */
  var level: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of the validation.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional metadata related to the result.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaValidationMessage {
  
  inline def apply(): SchemaValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationMessage]
  }
  
  extension [Self <: SchemaValidationMessage](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
