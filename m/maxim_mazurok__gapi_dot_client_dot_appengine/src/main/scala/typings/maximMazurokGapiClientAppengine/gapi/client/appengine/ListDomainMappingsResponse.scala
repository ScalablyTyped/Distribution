package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainMappingsResponse extends StObject {
  
  /** The domain mappings for the application. */
  var domainMappings: js.UndefOr[js.Array[DomainMapping]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDomainMappingsResponse {
  
  @scala.inline
  def apply(): ListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainMappingsResponse]
  }
  
  @scala.inline
  implicit class ListDomainMappingsResponseMutableBuilder[Self <: ListDomainMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainMappings(value: js.Array[DomainMapping]): Self = StObject.set(x, "domainMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMappingsUndefined: Self = StObject.set(x, "domainMappings", js.undefined)
    
    @scala.inline
    def setDomainMappingsVarargs(value: DomainMapping*): Self = StObject.set(x, "domainMappings", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
