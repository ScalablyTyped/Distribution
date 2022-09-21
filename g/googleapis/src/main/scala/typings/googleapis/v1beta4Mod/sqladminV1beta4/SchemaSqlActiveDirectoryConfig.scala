package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlActiveDirectoryConfig extends StObject {
  
  /**
    * The name of the domain (e.g., mydomain.com).
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always sql#activeDirectoryConfig.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlActiveDirectoryConfig {
  
  inline def apply(): SchemaSqlActiveDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlActiveDirectoryConfig]
  }
  
  extension [Self <: SchemaSqlActiveDirectoryConfig](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
