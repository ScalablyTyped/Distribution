package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DataStream to get. Example format: properties/1234/dataStreams/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDatastreamsGet {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsGet]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
