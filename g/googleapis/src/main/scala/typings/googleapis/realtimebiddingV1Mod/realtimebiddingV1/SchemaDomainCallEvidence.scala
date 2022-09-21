package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainCallEvidence extends StObject {
  
  /**
    * Breakdown of the most frequent domains called via HTTP by the creative.
    */
  var topHttpCallDomains: js.UndefOr[js.Array[SchemaDomainCalls]] = js.undefined
  
  /**
    * The total number of HTTP calls made by the creative, including but not limited to the number of calls in the top_http_call_domains.
    */
  var totalHttpCallCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDomainCallEvidence {
  
  inline def apply(): SchemaDomainCallEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainCallEvidence]
  }
  
  extension [Self <: SchemaDomainCallEvidence](x: Self) {
    
    inline def setTopHttpCallDomains(value: js.Array[SchemaDomainCalls]): Self = StObject.set(x, "topHttpCallDomains", value.asInstanceOf[js.Any])
    
    inline def setTopHttpCallDomainsUndefined: Self = StObject.set(x, "topHttpCallDomains", js.undefined)
    
    inline def setTopHttpCallDomainsVarargs(value: SchemaDomainCalls*): Self = StObject.set(x, "topHttpCallDomains", js.Array(value*))
    
    inline def setTotalHttpCallCount(value: Double): Self = StObject.set(x, "totalHttpCallCount", value.asInstanceOf[js.Any])
    
    inline def setTotalHttpCallCountNull: Self = StObject.set(x, "totalHttpCallCount", null)
    
    inline def setTotalHttpCallCountUndefined: Self = StObject.set(x, "totalHttpCallCount", js.undefined)
  }
}
