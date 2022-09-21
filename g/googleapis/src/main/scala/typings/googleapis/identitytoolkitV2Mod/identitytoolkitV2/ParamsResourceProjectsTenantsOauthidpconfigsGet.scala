package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsOauthidpconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the config, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsOauthidpconfigsGet {
  
  inline def apply(): ParamsResourceProjectsTenantsOauthidpconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsOauthidpconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsOauthidpconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
