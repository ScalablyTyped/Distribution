package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChainsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Search for a chain by its name. Exact/partial/fuzzy/related queries are supported. Examples: "walmart", "wal-mart", "walmmmart", "沃尔玛"
    */
  var chainName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of matched chains to return from this query. The default is 10. The maximum possible value is 500.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object ParamsResourceChainsSearch {
  
  inline def apply(): ParamsResourceChainsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChainsSearch]
  }
  
  extension [Self <: ParamsResourceChainsSearch](x: Self) {
    
    inline def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    inline def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
