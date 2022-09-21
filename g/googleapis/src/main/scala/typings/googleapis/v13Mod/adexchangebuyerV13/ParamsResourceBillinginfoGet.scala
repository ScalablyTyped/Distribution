package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillinginfoGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account id.
    */
  var accountId: js.UndefOr[Double] = js.undefined
}
object ParamsResourceBillinginfoGet {
  
  inline def apply(): ParamsResourceBillinginfoGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillinginfoGet]
  }
  
  extension [Self <: ParamsResourceBillinginfoGet](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
