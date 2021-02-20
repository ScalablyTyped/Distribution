package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceGetMetadataRequest extends StObject {
  
  /** Specification of the source whose metadata should be computed. */
  var source: js.UndefOr[Source] = js.native
}
object SourceGetMetadataRequest {
  
  @scala.inline
  def apply(): SourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGetMetadataRequest]
  }
  
  @scala.inline
  implicit class SourceGetMetadataRequestMutableBuilder[Self <: SourceGetMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
