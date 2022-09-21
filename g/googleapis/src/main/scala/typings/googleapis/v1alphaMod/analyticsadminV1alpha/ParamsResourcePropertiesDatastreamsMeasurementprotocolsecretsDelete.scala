package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the MeasurementProtocolSecret to delete. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
