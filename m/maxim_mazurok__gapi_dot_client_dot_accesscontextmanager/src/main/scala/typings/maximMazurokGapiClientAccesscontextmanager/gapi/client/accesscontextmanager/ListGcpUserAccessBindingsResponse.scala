package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGcpUserAccessBindingsResponse extends StObject {
  
  /** GcpUserAccessBinding */
  var gcpUserAccessBindings: js.UndefOr[js.Array[GcpUserAccessBinding]] = js.native
  
  /** Token to get the next page of items. If blank, there are no more items. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGcpUserAccessBindingsResponse {
  
  @scala.inline
  def apply(): ListGcpUserAccessBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGcpUserAccessBindingsResponse]
  }
  
  @scala.inline
  implicit class ListGcpUserAccessBindingsResponseMutableBuilder[Self <: ListGcpUserAccessBindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcpUserAccessBindings(value: js.Array[GcpUserAccessBinding]): Self = StObject.set(x, "gcpUserAccessBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcpUserAccessBindingsUndefined: Self = StObject.set(x, "gcpUserAccessBindings", js.undefined)
    
    @scala.inline
    def setGcpUserAccessBindingsVarargs(value: GcpUserAccessBinding*): Self = StObject.set(x, "gcpUserAccessBindings", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
