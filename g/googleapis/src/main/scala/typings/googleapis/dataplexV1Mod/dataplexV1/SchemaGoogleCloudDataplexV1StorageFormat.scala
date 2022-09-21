package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1StorageFormat extends StObject {
  
  /**
    * Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
    */
  var compressionFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Additional information about CSV formatted data.
    */
  var csv: js.UndefOr[SchemaGoogleCloudDataplexV1StorageFormatCsvOptions] = js.undefined
  
  /**
    * Output only. The data format associated with the stored data, which represents content type values. The value is inferred from mime type.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Additional information about CSV formatted data.
    */
  var json: js.UndefOr[SchemaGoogleCloudDataplexV1StorageFormatJsonOptions] = js.undefined
  
  /**
    * Required. The mime type descriptor for the data. Must match the pattern {type\}/{subtype\}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes\} text/csv text/ image/{image subtype\} video/{video subtype\} audio/{audio subtype\}
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1StorageFormat {
  
  inline def apply(): SchemaGoogleCloudDataplexV1StorageFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1StorageFormat]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1StorageFormat](x: Self) {
    
    inline def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatNull: Self = StObject.set(x, "compressionFormat", null)
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    inline def setCsv(value: SchemaGoogleCloudDataplexV1StorageFormatCsvOptions): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setJson(value: SchemaGoogleCloudDataplexV1StorageFormatJsonOptions): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
