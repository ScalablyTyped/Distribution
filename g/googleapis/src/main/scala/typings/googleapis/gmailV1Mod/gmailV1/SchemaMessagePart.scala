package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single MIME message part.
  */
trait SchemaMessagePart extends StObject {
  
  /**
    * The message part body for this part, which may be empty for container
    * MIME message parts.
    */
  var body: js.UndefOr[SchemaMessagePartBody] = js.undefined
  
  /**
    * The filename of the attachment. Only present if this message part
    * represents an attachment.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * List of headers on this message part. For the top-level message part,
    * representing the entire message payload, it will contain the standard RFC
    * 2822 email headers such as To, From, and Subject.
    */
  var headers: js.UndefOr[js.Array[SchemaMessagePartHeader]] = js.undefined
  
  /**
    * The MIME type of the message part.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The immutable ID of the message part.
    */
  var partId: js.UndefOr[String] = js.undefined
  
  /**
    * The child MIME message parts of this part. This only applies to container
    * MIME message parts, for example multipart/ *. For non- container MIME
    * message part types, such as text/plain, this field is empty. For more
    * information, see RFC 1521.
    */
  var parts: js.UndefOr[js.Array[SchemaMessagePart]] = js.undefined
}
object SchemaMessagePart {
  
  inline def apply(): SchemaMessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePart]
  }
  
  extension [Self <: SchemaMessagePart](x: Self) {
    
    inline def setBody(value: SchemaMessagePartBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaMessagePartHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaMessagePartHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPartId(value: String): Self = StObject.set(x, "partId", value.asInstanceOf[js.Any])
    
    inline def setPartIdUndefined: Self = StObject.set(x, "partId", js.undefined)
    
    inline def setParts(value: js.Array[SchemaMessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: SchemaMessagePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
  }
}
