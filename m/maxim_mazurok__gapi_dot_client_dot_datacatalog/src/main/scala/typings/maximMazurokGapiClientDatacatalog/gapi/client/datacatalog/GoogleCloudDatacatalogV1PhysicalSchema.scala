package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1PhysicalSchema extends StObject {
  
  /** Schema in Avro JSON format. */
  var avro: js.UndefOr[GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema] = js.undefined
  
  /** Marks a CSV-encoded data source. */
  var csv: js.UndefOr[Any] = js.undefined
  
  /** Marks an ORC-encoded data source. */
  var orc: js.UndefOr[Any] = js.undefined
  
  /** Marks a Parquet-encoded data source. */
  var parquet: js.UndefOr[Any] = js.undefined
  
  /** Schema in protocol buffer format. */
  var protobuf: js.UndefOr[GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema] = js.undefined
  
  /** Schema in Thrift format. */
  var thrift: js.UndefOr[GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema] = js.undefined
}
object GoogleCloudDatacatalogV1PhysicalSchema {
  
  inline def apply(): GoogleCloudDatacatalogV1PhysicalSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1PhysicalSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1PhysicalSchema] (val x: Self) extends AnyVal {
    
    inline def setAvro(value: GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema): Self = StObject.set(x, "avro", value.asInstanceOf[js.Any])
    
    inline def setAvroUndefined: Self = StObject.set(x, "avro", js.undefined)
    
    inline def setCsv(value: Any): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setOrc(value: Any): Self = StObject.set(x, "orc", value.asInstanceOf[js.Any])
    
    inline def setOrcUndefined: Self = StObject.set(x, "orc", js.undefined)
    
    inline def setParquet(value: Any): Self = StObject.set(x, "parquet", value.asInstanceOf[js.Any])
    
    inline def setParquetUndefined: Self = StObject.set(x, "parquet", js.undefined)
    
    inline def setProtobuf(value: GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setProtobufUndefined: Self = StObject.set(x, "protobuf", js.undefined)
    
    inline def setThrift(value: GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema): Self = StObject.set(x, "thrift", value.asInstanceOf[js.Any])
    
    inline def setThriftUndefined: Self = StObject.set(x, "thrift", js.undefined)
  }
}
