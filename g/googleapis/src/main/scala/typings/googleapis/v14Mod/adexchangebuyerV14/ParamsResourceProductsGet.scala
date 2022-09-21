package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The id for the product to get the head revision for.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsGet {
  
  inline def apply(): ParamsResourceProductsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsGet]
  }
  
  extension [Self <: ParamsResourceProductsGet](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
