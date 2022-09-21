package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionsPublish
  extends StObject
     with StandardParameters {
  
  /**
    * When provided, this fingerprint must match the fingerprint of the container version in storage.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionsPublish {
  
  inline def apply(): ParamsResourceAccountsContainersVersionsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionsPublish]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionsPublish](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
