package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateMessageRequest extends StObject {
  
  /**
    * The encoding expected for messages
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message to validate against the provided `schema_spec`.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the schema against which to validate. Format is `projects/{project\}/schemas/{schema\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad-hoc schema against which to validate
    */
  var schema: js.UndefOr[SchemaSchema] = js.undefined
}
object SchemaValidateMessageRequest {
  
  inline def apply(): SchemaValidateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateMessageRequest]
  }
  
  extension [Self <: SchemaValidateMessageRequest](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(value: SchemaSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
