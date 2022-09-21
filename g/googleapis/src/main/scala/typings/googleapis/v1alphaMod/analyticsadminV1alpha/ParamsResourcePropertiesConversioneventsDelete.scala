package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesConversioneventsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the conversion event to delete. Format: properties/{property\}/conversionEvents/{conversion_event\} Example: "properties/123/conversionEvents/456"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesConversioneventsDelete {
  
  inline def apply(): ParamsResourcePropertiesConversioneventsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesConversioneventsDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesConversioneventsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
