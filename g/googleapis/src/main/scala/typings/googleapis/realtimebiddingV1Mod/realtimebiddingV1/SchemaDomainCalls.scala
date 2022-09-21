package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainCalls extends StObject {
  
  /**
    * The domain name.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of HTTP calls made to the domain.
    */
  var httpCallCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDomainCalls {
  
  inline def apply(): SchemaDomainCalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainCalls]
  }
  
  extension [Self <: SchemaDomainCalls](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHttpCallCount(value: Double): Self = StObject.set(x, "httpCallCount", value.asInstanceOf[js.Any])
    
    inline def setHttpCallCountNull: Self = StObject.set(x, "httpCallCount", null)
    
    inline def setHttpCallCountUndefined: Self = StObject.set(x, "httpCallCount", js.undefined)
  }
}
