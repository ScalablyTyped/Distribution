package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event describing a message sent/received between Spans.
  */
trait SchemaMessageEvent extends StObject {
  
  /**
    * The number of compressed bytes sent or received. If missing assumed to be
    * the same size as uncompressed.
    */
  var compressedSizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier for the MessageEvent&#39;s message that can be used to
    * match SENT and RECEIVED MessageEvents. It is recommended to be unique
    * within a Span.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of MessageEvent. Indicates whether the message was sent or received.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The number of uncompressed bytes sent or received.
    */
  var uncompressedSizeBytes: js.UndefOr[String] = js.undefined
}
object SchemaMessageEvent {
  
  inline def apply(): SchemaMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageEvent]
  }
  
  extension [Self <: SchemaMessageEvent](x: Self) {
    
    inline def setCompressedSizeBytes(value: String): Self = StObject.set(x, "compressedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCompressedSizeBytesUndefined: Self = StObject.set(x, "compressedSizeBytes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUncompressedSizeBytes(value: String): Self = StObject.set(x, "uncompressedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setUncompressedSizeBytesUndefined: Self = StObject.set(x, "uncompressedSizeBytes", js.undefined)
  }
}
