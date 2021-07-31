package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceServicePerimetersRequest extends StObject {
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in
    * Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not
    * provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Required. The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.undefined
}
object ReplaceServicePerimetersRequest {
  
  @scala.inline
  def apply(): ReplaceServicePerimetersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceServicePerimetersRequest]
  }
  
  @scala.inline
  implicit class ReplaceServicePerimetersRequestMutableBuilder[Self <: ReplaceServicePerimetersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    @scala.inline
    def setServicePerimetersVarargs(value: ServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value :_*))
  }
}
