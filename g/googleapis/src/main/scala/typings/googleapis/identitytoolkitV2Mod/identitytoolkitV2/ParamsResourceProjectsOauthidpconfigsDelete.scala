package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOauthidpconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the config to be deleted, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOauthidpconfigsDelete {
  
  inline def apply(): ParamsResourceProjectsOauthidpconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOauthidpconfigsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsOauthidpconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
