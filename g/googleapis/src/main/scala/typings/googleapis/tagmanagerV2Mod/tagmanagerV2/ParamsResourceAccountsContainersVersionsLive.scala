package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionsLive
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionsLive {
  
  inline def apply(): ParamsResourceAccountsContainersVersionsLive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionsLive]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionsLive](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
