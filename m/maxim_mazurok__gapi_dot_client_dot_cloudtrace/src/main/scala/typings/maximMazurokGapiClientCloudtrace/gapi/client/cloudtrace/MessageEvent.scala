package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEvent extends StObject {
  
  /** The number of compressed bytes sent or received. If missing assumed to be the same size as uncompressed. */
  var compressedSizeBytes: js.UndefOr[String] = js.native
  
  /** An identifier for the MessageEvent's message that can be used to match SENT and RECEIVED MessageEvents. It is recommended to be unique within a Span. */
  var id: js.UndefOr[String] = js.native
  
  /** Type of MessageEvent. Indicates whether the message was sent or received. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The number of uncompressed bytes sent or received. */
  var uncompressedSizeBytes: js.UndefOr[String] = js.native
}
object MessageEvent {
  
  @scala.inline
  def apply(): MessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressedSizeBytes(value: String): Self = StObject.set(x, "compressedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedSizeBytesUndefined: Self = StObject.set(x, "compressedSizeBytes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUncompressedSizeBytes(value: String): Self = StObject.set(x, "uncompressedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncompressedSizeBytesUndefined: Self = StObject.set(x, "uncompressedSizeBytes", js.undefined)
  }
}
