package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceOperationResponse extends StObject {
  
  /** A response to a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataResponse] = js.native
  
  /** A response to a request to split a source. */
  var split: js.UndefOr[SourceSplitResponse] = js.native
}
object SourceOperationResponse {
  
  @scala.inline
  def apply(): SourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOperationResponse]
  }
  
  @scala.inline
  implicit class SourceOperationResponseMutableBuilder[Self <: SourceOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMetadata(value: SourceGetMetadataResponse): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    @scala.inline
    def setSplit(value: SourceSplitResponse): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
