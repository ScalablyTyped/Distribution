package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DataStream to delete. Example format: properties/1234/dataStreams/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDatastreamsDelete {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
