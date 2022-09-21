package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions extends StObject {
  
  /**
    * Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
    */
  var disableTypeInference: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The character encoding of the data. The default is UTF-8.
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions](x: Self) {
    
    inline def setDisableTypeInference(value: Boolean): Self = StObject.set(x, "disableTypeInference", value.asInstanceOf[js.Any])
    
    inline def setDisableTypeInferenceNull: Self = StObject.set(x, "disableTypeInference", null)
    
    inline def setDisableTypeInferenceUndefined: Self = StObject.set(x, "disableTypeInference", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
