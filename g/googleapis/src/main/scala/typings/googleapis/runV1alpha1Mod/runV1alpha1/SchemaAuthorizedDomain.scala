package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A domain that a user has been authorized to administer. To authorize use of
  * a domain, verify ownership via [Webmaster
  * Central](https://www.google.com/webmasters/verification/home).
  */
trait SchemaAuthorizedDomain extends StObject {
  
  /**
    * Relative name of the domain authorized for use. Example: `example.com`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Read only. Full path to the `AuthorizedDomain` resource in the API.
    * Example: `apps/myapp/authorizedDomains/example.com`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaAuthorizedDomain {
  
  inline def apply(): SchemaAuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizedDomain]
  }
  
  extension [Self <: SchemaAuthorizedDomain](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
