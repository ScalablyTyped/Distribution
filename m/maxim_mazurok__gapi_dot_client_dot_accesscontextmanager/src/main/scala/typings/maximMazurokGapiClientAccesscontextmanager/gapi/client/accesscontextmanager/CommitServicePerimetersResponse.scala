package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitServicePerimetersResponse extends StObject {
  
  /** List of all the Service Perimeter instances in the Access Policy. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.undefined
}
object CommitServicePerimetersResponse {
  
  @scala.inline
  def apply(): CommitServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitServicePerimetersResponse]
  }
  
  @scala.inline
  implicit class CommitServicePerimetersResponseMutableBuilder[Self <: CommitServicePerimetersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    @scala.inline
    def setServicePerimetersVarargs(value: ServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value :_*))
  }
}
