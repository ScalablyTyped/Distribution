package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstallerGeneratesecret
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalGenerateSecretRequest] = js.undefined
}
object ParamsResourceInstallerGeneratesecret {
  
  inline def apply(): ParamsResourceInstallerGeneratesecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstallerGeneratesecret]
  }
  
  extension [Self <: ParamsResourceInstallerGeneratesecret](x: Self) {
    
    inline def setRequestBody(value: SchemaSasPortalGenerateSecretRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
