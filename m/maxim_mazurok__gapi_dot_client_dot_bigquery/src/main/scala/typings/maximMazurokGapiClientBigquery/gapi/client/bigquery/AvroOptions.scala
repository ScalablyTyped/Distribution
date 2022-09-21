package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvroOptions extends StObject {
  
  /**
    * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw
    * type (for example, INTEGER).
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
}
object AvroOptions {
  
  inline def apply(): AvroOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvroOptions]
  }
  
  extension [Self <: AvroOptions](x: Self) {
    
    inline def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    inline def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
  }
}
