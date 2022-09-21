package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReportsGetsaved
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the saved report to retrieve. Format: accounts/{account\}/reports/{report\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsReportsGetsaved {
  
  inline def apply(): ParamsResourceAccountsReportsGetsaved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReportsGetsaved]
  }
  
  extension [Self <: ParamsResourceAccountsReportsGetsaved](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
