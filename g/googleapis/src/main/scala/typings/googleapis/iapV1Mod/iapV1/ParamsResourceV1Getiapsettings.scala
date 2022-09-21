package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Getiapsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name for which to retrieve the settings. Authorization: Requires the `getSettings` permission for the associated resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1Getiapsettings {
  
  inline def apply(): ParamsResourceV1Getiapsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Getiapsettings]
  }
  
  extension [Self <: ParamsResourceV1Getiapsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
