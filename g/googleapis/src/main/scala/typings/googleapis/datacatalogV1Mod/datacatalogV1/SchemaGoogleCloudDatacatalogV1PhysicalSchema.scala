package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1PhysicalSchema extends StObject {
  
  /**
    * Schema in Avro JSON format.
    */
  var avro: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema] = js.undefined
  
  /**
    * Marks a CSV-encoded data source.
    */
  var csv: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaCsvSchema] = js.undefined
  
  /**
    * Marks an ORC-encoded data source.
    */
  var orc: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaOrcSchema] = js.undefined
  
  /**
    * Marks a Parquet-encoded data source.
    */
  var parquet: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaParquetSchema] = js.undefined
  
  /**
    * Schema in protocol buffer format.
    */
  var protobuf: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema] = js.undefined
  
  /**
    * Schema in Thrift format.
    */
  var thrift: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1PhysicalSchema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1PhysicalSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1PhysicalSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1PhysicalSchema](x: Self) {
    
    inline def setAvro(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema): Self = StObject.set(x, "avro", value.asInstanceOf[js.Any])
    
    inline def setAvroUndefined: Self = StObject.set(x, "avro", js.undefined)
    
    inline def setCsv(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaCsvSchema): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setOrc(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaOrcSchema): Self = StObject.set(x, "orc", value.asInstanceOf[js.Any])
    
    inline def setOrcUndefined: Self = StObject.set(x, "orc", js.undefined)
    
    inline def setParquet(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaParquetSchema): Self = StObject.set(x, "parquet", value.asInstanceOf[js.Any])
    
    inline def setParquetUndefined: Self = StObject.set(x, "parquet", js.undefined)
    
    inline def setProtobuf(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setProtobufUndefined: Self = StObject.set(x, "protobuf", js.undefined)
    
    inline def setThrift(value: SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema): Self = StObject.set(x, "thrift", value.asInstanceOf[js.Any])
    
    inline def setThriftUndefined: Self = StObject.set(x, "thrift", js.undefined)
  }
}
