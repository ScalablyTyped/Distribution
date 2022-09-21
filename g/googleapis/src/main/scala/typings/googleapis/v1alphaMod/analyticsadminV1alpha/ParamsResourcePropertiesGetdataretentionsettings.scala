package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGetdataretentionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the settings to lookup. Format: properties/{property\}/dataRetentionSettings Example: "properties/1000/dataRetentionSettings"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGetdataretentionsettings {
  
  inline def apply(): ParamsResourcePropertiesGetdataretentionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGetdataretentionsettings]
  }
  
  extension [Self <: ParamsResourcePropertiesGetdataretentionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
