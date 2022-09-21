package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOAuthConsumerProto extends StObject {
  
  var domain: js.UndefOr[String | Null] = js.undefined
}
object SchemaOAuthConsumerProto {
  
  inline def apply(): SchemaOAuthConsumerProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOAuthConsumerProto]
  }
  
  extension [Self <: SchemaOAuthConsumerProto](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
