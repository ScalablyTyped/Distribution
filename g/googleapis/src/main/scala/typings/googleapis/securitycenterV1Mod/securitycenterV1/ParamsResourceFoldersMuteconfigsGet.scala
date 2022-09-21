package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersMuteconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the mute config to retrieve. Its format is organizations/{organization\}/muteConfigs/{config_id\}, folders/{folder\}/muteConfigs/{config_id\}, or projects/{project\}/muteConfigs/{config_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersMuteconfigsGet {
  
  inline def apply(): ParamsResourceFoldersMuteconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersMuteconfigsGet]
  }
  
  extension [Self <: ParamsResourceFoldersMuteconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
