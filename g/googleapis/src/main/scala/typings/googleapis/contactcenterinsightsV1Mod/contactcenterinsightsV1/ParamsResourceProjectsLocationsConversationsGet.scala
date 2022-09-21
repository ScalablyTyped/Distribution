package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the conversation to get.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The level of details of the conversation. Default is `FULL`.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
