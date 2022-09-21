package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions extends StObject {
  
  /**
    * Optional. The delimiter being used to separate values. This defaults to ','.
    */
  var delimiter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether to disable the inference of data type for CSV data. If true, all columns will be registered as strings.
    */
  var disableTypeInference: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The character encoding of the data. The default is UTF-8.
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
    */
  var headerRows: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDisableTypeInference(value: Boolean): Self = StObject.set(x, "disableTypeInference", value.asInstanceOf[js.Any])
    
    inline def setDisableTypeInferenceNull: Self = StObject.set(x, "disableTypeInference", null)
    
    inline def setDisableTypeInferenceUndefined: Self = StObject.set(x, "disableTypeInference", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowsNull: Self = StObject.set(x, "headerRows", null)
    
    inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
  }
}
