package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotificationchanneldescriptorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The channel type for which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[CHANNEL_TYPE]
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsNotificationchanneldescriptorsGet {
  
  inline def apply(): ParamsResourceProjectsNotificationchanneldescriptorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchanneldescriptorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsNotificationchanneldescriptorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
