package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareScope extends StObject {
  
  /** If scope is DOMAIN, this field contains the dasher domain, for example "google.com". */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The scope to which the content was shared. */
  var scope: js.UndefOr[String] = js.undefined
}
object ShareScope {
  
  inline def apply(): ShareScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareScope]
  }
  
  extension [Self <: ShareScope](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
