package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsGetadblockingrecoverytag
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the account to get the tag for. Format: accounts/{account\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsGetadblockingrecoverytag {
  
  inline def apply(): ParamsResourceAccountsGetadblockingrecoverytag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsGetadblockingrecoverytag]
  }
  
  extension [Self <: ParamsResourceAccountsGetadblockingrecoverytag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
