package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesVariablesRevert
  extends StObject
     with StandardParameters {
  
  /**
    * When provided, this fingerprint must match the fingerprint of the variable in storage.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Variable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/variables/{variable_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesVariablesRevert {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesVariablesRevert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesVariablesRevert]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesVariablesRevert](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
