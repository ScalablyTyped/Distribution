package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGetattributionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the attribution settings to retrieve. Format: properties/{property\}/attributionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGetattributionsettings {
  
  inline def apply(): ParamsResourcePropertiesGetattributionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGetattributionsettings]
  }
  
  extension [Self <: ParamsResourcePropertiesGetattributionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
