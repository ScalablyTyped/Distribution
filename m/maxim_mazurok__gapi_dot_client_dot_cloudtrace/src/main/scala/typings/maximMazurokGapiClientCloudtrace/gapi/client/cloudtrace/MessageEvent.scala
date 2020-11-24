package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEvent extends js.Object {
  
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
  implicit class MessageEventOps[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompressedSizeBytes(value: String): Self = this.set("compressedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressedSizeBytes: Self = this.set("compressedSizeBytes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUncompressedSizeBytes(value: String): Self = this.set("uncompressedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncompressedSizeBytes: Self = this.set("uncompressedSizeBytes", js.undefined)
  }
}
