package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParquetOptions extends StObject {
  
  /** [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type. */
  var enableListInference: js.UndefOr[Boolean] = js.undefined
  
  /** [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default. */
  var enumAsString: js.UndefOr[Boolean] = js.undefined
}
object ParquetOptions {
  
  inline def apply(): ParquetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParquetOptions]
  }
  
  extension [Self <: ParquetOptions](x: Self) {
    
    inline def setEnableListInference(value: Boolean): Self = StObject.set(x, "enableListInference", value.asInstanceOf[js.Any])
    
    inline def setEnableListInferenceUndefined: Self = StObject.set(x, "enableListInference", js.undefined)
    
    inline def setEnumAsString(value: Boolean): Self = StObject.set(x, "enumAsString", value.asInstanceOf[js.Any])
    
    inline def setEnumAsStringUndefined: Self = StObject.set(x, "enumAsString", js.undefined)
  }
}
