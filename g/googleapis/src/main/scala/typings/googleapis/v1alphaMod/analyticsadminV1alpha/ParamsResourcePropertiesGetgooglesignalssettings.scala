package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGetgooglesignalssettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the google signals settings to retrieve. Format: properties/{property\}/googleSignalsSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGetgooglesignalssettings {
  
  inline def apply(): ParamsResourcePropertiesGetgooglesignalssettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGetgooglesignalssettings]
  }
  
  extension [Self <: ParamsResourcePropertiesGetgooglesignalssettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
