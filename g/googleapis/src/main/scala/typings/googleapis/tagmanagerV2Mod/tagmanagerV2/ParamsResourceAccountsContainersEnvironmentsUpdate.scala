package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersEnvironmentsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * When provided, this fingerprint must match the fingerprint of the environment in storage.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Environment's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/environments/{environment_id\}
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnvironment] = js.undefined
}
object ParamsResourceAccountsContainersEnvironmentsUpdate {
  
  inline def apply(): ParamsResourceAccountsContainersEnvironmentsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersEnvironmentsUpdate]
  }
  
  extension [Self <: ParamsResourceAccountsContainersEnvironmentsUpdate](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestBody(value: SchemaEnvironment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
