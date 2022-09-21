package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainRedirect extends StObject {
  
  /**
    * Required. The domain name to redirect to.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The redirect status code.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomainRedirect {
  
  inline def apply(): SchemaDomainRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainRedirect]
  }
  
  extension [Self <: SchemaDomainRedirect](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
