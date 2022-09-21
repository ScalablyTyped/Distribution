package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShareScope extends StObject {
  
  /**
    * If scope is DOMAIN, this field contains the dasher domain, for example "google.com".
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scope to which the content was shared.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaShareScope {
  
  inline def apply(): SchemaShareScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShareScope]
  }
  
  extension [Self <: SchemaShareScope](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
