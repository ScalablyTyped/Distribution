package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServicePerimetersResponse extends StObject {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of the Service Perimeter instances. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.native
}
object ListServicePerimetersResponse {
  
  @scala.inline
  def apply(): ListServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicePerimetersResponse]
  }
  
  @scala.inline
  implicit class ListServicePerimetersResponseMutableBuilder[Self <: ListServicePerimetersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    @scala.inline
    def setServicePerimetersVarargs(value: ServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value :_*))
  }
}
