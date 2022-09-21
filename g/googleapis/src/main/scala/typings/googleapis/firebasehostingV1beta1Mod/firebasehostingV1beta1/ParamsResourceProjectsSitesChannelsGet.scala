package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSitesChannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The fully-qualified resource name for the channel, in the format: sites/SITE_ID/channels/CHANNEL_ID
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSitesChannelsGet {
  
  inline def apply(): ParamsResourceProjectsSitesChannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSitesChannelsGet]
  }
  
  extension [Self <: ParamsResourceProjectsSitesChannelsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
