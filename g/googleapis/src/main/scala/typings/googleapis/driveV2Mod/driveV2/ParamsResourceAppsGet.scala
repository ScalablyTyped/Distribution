package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the app.
    */
  var appId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsGet {
  
  inline def apply(): ParamsResourceAppsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsGet]
  }
  
  extension [Self <: ParamsResourceAppsGet](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
