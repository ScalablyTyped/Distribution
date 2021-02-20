package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Streamingbuffer extends StObject {
  
  /** [Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer. */
  var estimatedBytes: js.UndefOr[String] = js.native
  
  /** [Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer. */
  var estimatedRows: js.UndefOr[String] = js.native
  
  /** [Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is available. */
  var oldestEntryTime: js.UndefOr[String] = js.native
}
object Streamingbuffer {
  
  @scala.inline
  def apply(): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Streamingbuffer]
  }
  
  @scala.inline
  implicit class StreamingbufferMutableBuilder[Self <: Streamingbuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedBytes(value: String): Self = StObject.set(x, "estimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBytesUndefined: Self = StObject.set(x, "estimatedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedRows(value: String): Self = StObject.set(x, "estimatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowsUndefined: Self = StObject.set(x, "estimatedRows", js.undefined)
    
    @scala.inline
    def setOldestEntryTime(value: String): Self = StObject.set(x, "oldestEntryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldestEntryTimeUndefined: Self = StObject.set(x, "oldestEntryTime", js.undefined)
  }
}
