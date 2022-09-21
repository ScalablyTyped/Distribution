package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBusinessChainSearchTerms extends StObject {
  
  /**
    * The search query for the desired business chain. The query must be the full name of the business, e.g. "KFC", "mercedes-benz".
    */
  var businessChainQuery: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The search query for the desired geo region, e.g. "Seattle", "United State".
    */
  var regionQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaBusinessChainSearchTerms {
  
  inline def apply(): SchemaBusinessChainSearchTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBusinessChainSearchTerms]
  }
  
  extension [Self <: SchemaBusinessChainSearchTerms](x: Self) {
    
    inline def setBusinessChainQuery(value: String): Self = StObject.set(x, "businessChainQuery", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainQueryNull: Self = StObject.set(x, "businessChainQuery", null)
    
    inline def setBusinessChainQueryUndefined: Self = StObject.set(x, "businessChainQuery", js.undefined)
    
    inline def setRegionQuery(value: String): Self = StObject.set(x, "regionQuery", value.asInstanceOf[js.Any])
    
    inline def setRegionQueryNull: Self = StObject.set(x, "regionQuery", null)
    
    inline def setRegionQueryUndefined: Self = StObject.set(x, "regionQuery", js.undefined)
  }
}
