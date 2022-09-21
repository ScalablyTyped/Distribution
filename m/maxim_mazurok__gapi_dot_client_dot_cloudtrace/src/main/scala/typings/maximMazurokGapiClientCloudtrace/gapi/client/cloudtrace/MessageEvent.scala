package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  /** The number of compressed bytes sent or received. If missing, the compressed size is assumed to be the same size as the uncompressed size. */
  var compressedSizeBytes: js.UndefOr[String] = js.undefined
  
  /** An identifier for the MessageEvent's message that can be used to match `SENT` and `RECEIVED` MessageEvents. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Type of MessageEvent. Indicates whether the message was sent or received. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The number of uncompressed bytes sent or received. */
  var uncompressedSizeBytes: js.UndefOr[String] = js.undefined
}
object MessageEvent {
  
  inline def apply(): MessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEvent]
  }
  
  extension [Self <: MessageEvent](x: Self) {
    
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
