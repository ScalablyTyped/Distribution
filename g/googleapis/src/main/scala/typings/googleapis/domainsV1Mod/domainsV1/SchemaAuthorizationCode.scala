package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationCode extends StObject {
  
  /**
    * The Authorization Code in ASCII. It can be used to transfer the domain to or from another registrar.
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizationCode {
  
  inline def apply(): SchemaAuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationCode]
  }
  
  extension [Self <: SchemaAuthorizationCode](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
