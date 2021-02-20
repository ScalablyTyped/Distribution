package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceGetMetadataResponse extends StObject {
  
  /** The computed metadata. */
  var metadata: js.UndefOr[SourceMetadata] = js.native
}
object SourceGetMetadataResponse {
  
  @scala.inline
  def apply(): SourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGetMetadataResponse]
  }
  
  @scala.inline
  implicit class SourceGetMetadataResponseMutableBuilder[Self <: SourceGetMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
