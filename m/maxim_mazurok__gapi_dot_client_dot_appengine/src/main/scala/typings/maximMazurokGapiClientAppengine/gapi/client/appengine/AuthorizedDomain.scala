package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedDomain extends StObject {
  
  /** Fully qualified domain name of the domain authorized for use. Example: example.com. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Full path to the AuthorizedDomain resource in the API. Example: apps/myapp/authorizedDomains/example.com.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
}
object AuthorizedDomain {
  
  @scala.inline
  def apply(): AuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedDomain]
  }
  
  @scala.inline
  implicit class AuthorizedDomainMutableBuilder[Self <: AuthorizedDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
