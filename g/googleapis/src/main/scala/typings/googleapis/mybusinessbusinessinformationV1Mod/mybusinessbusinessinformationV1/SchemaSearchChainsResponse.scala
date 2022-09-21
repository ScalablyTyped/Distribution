package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchChainsResponse extends StObject {
  
  /**
    * Chains that match the queried chain_display_name in SearchChainsRequest. If there are no matches, this field will be empty. Results are listed in order of relevance.
    */
  var chains: js.UndefOr[js.Array[SchemaChain]] = js.undefined
}
object SchemaSearchChainsResponse {
  
  inline def apply(): SchemaSearchChainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchChainsResponse]
  }
  
  extension [Self <: SchemaSearchChainsResponse](x: Self) {
    
    inline def setChains(value: js.Array[SchemaChain]): Self = StObject.set(x, "chains", value.asInstanceOf[js.Any])
    
    inline def setChainsUndefined: Self = StObject.set(x, "chains", js.undefined)
    
    inline def setChainsVarargs(value: SchemaChain*): Self = StObject.set(x, "chains", js.Array(value*))
  }
}
