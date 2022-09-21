package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionsRestore
  extends StObject
     with StandardParameters {
  
  /**
    * The GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Container Version ID.
    */
  var containerVersionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionsRestore {
  
  inline def apply(): ParamsResourceAccountsContainersVersionsRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionsRestore]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionsRestore](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
  }
}
