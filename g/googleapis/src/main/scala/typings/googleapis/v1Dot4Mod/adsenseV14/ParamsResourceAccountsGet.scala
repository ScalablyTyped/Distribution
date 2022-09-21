package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account to get information about.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the tree of sub accounts should be returned.
    */
  var tree: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceAccountsGet {
  
  inline def apply(): ParamsResourceAccountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsGet]
  }
  
  extension [Self <: ParamsResourceAccountsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
  }
}
