package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageEvent extends StObject {
  
  /**
    * The number of compressed bytes sent or received. If missing, the compressed size is assumed to be the same size as the uncompressed size.
    */
  var compressedSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier for the MessageEvent's message that can be used to match `SENT` and `RECEIVED` MessageEvents.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of MessageEvent. Indicates whether the message was sent or received.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of uncompressed bytes sent or received.
    */
  var uncompressedSizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaMessageEvent {
  
  inline def apply(): SchemaMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageEvent]
  }
  
  extension [Self <: SchemaMessageEvent](x: Self) {
    
    inline def setCompressedSizeBytes(value: String): Self = StObject.set(x, "compressedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCompressedSizeBytesNull: Self = StObject.set(x, "compressedSizeBytes", null)
    
    inline def setCompressedSizeBytesUndefined: Self = StObject.set(x, "compressedSizeBytes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUncompressedSizeBytes(value: String): Self = StObject.set(x, "uncompressedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setUncompressedSizeBytesNull: Self = StObject.set(x, "uncompressedSizeBytes", null)
    
    inline def setUncompressedSizeBytesUndefined: Self = StObject.set(x, "uncompressedSizeBytes", js.undefined)
  }
}
