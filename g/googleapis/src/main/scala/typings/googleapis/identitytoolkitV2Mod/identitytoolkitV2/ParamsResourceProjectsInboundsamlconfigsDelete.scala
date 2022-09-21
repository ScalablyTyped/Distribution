package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInboundsamlconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the config to be deleted, for example: 'projects/my-awesome-project/inboundSamlConfigs/my-config-id'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInboundsamlconfigsDelete {
  
  inline def apply(): ParamsResourceProjectsInboundsamlconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInboundsamlconfigsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInboundsamlconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
