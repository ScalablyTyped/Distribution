package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * The pql query used to query for products.
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsSearch {
  
  inline def apply(): ParamsResourceProductsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsSearch]
  }
  
  extension [Self <: ParamsResourceProductsSearch](x: Self) {
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
  }
}
