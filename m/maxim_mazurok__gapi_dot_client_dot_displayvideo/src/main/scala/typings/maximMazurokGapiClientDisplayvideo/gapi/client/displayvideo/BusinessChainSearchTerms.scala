package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessChainSearchTerms extends StObject {
  
  /** The search query for the desired business chain. The query must be the full name of the business, e.g. "KFC", "mercedes-benz". */
  var businessChainQuery: js.UndefOr[String] = js.undefined
  
  /** The search query for the desired geo region, e.g. "Seattle", "United State". */
  var regionQuery: js.UndefOr[String] = js.undefined
}
object BusinessChainSearchTerms {
  
  inline def apply(): BusinessChainSearchTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessChainSearchTerms]
  }
  
  extension [Self <: BusinessChainSearchTerms](x: Self) {
    
    inline def setBusinessChainQuery(value: String): Self = StObject.set(x, "businessChainQuery", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainQueryUndefined: Self = StObject.set(x, "businessChainQuery", js.undefined)
    
    inline def setRegionQuery(value: String): Self = StObject.set(x, "regionQuery", value.asInstanceOf[js.Any])
    
    inline def setRegionQueryUndefined: Self = StObject.set(x, "regionQuery", js.undefined)
  }
}
