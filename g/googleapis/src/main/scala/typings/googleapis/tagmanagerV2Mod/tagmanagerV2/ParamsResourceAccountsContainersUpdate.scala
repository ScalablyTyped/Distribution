package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * When provided, this fingerprint must match the fingerprint of the container in storage.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaContainer] = js.undefined
}
object ParamsResourceAccountsContainersUpdate {
  
  inline def apply(): ParamsResourceAccountsContainersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersUpdate]
  }
  
  extension [Self <: ParamsResourceAccountsContainersUpdate](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestBody(value: SchemaContainer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
