package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account id
    */
  var id: js.UndefOr[Double] = js.undefined
}
object ParamsResourceAccountsGet {
  
  inline def apply(): ParamsResourceAccountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsGet]
  }
  
  extension [Self <: ParamsResourceAccountsGet](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
