package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesTemplatesRevert
  extends StObject
     with StandardParameters {
  
  /**
    * When provided, this fingerprint must match the fingerprint of the template in storage.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Custom Template's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/templates/{template_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesTemplatesRevert {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesTemplatesRevert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesTemplatesRevert]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesTemplatesRevert](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
