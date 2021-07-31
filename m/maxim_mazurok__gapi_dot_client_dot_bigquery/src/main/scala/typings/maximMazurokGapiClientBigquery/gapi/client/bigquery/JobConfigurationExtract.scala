package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationExtract extends StObject {
  
  /**
    * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported
    * for Avro. Not applicable when extracting models.
    */
  var compression: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The
    * default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
    */
  var destinationFormat: js.UndefOr[String] = js.undefined
  
  /** [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written. */
  var destinationUri: js.UndefOr[String] = js.undefined
  
  /** [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written. */
  var destinationUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models. */
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  /** [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models. */
  var printHeader: js.UndefOr[Boolean] = js.undefined
  
  /** A reference to the model being exported. */
  var sourceModel: js.UndefOr[ModelReference] = js.undefined
  
  /** A reference to the table being exported. */
  var sourceTable: js.UndefOr[TableReference] = js.undefined
  
  /**
    * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical
    * types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
}
object JobConfigurationExtract {
  
  @scala.inline
  def apply(): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationExtract]
  }
  
  @scala.inline
  implicit class JobConfigurationExtractMutableBuilder[Self <: JobConfigurationExtract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setDestinationFormat(value: String): Self = StObject.set(x, "destinationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFormatUndefined: Self = StObject.set(x, "destinationFormat", js.undefined)
    
    @scala.inline
    def setDestinationUri(value: String): Self = StObject.set(x, "destinationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUriUndefined: Self = StObject.set(x, "destinationUri", js.undefined)
    
    @scala.inline
    def setDestinationUris(value: js.Array[String]): Self = StObject.set(x, "destinationUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrisUndefined: Self = StObject.set(x, "destinationUris", js.undefined)
    
    @scala.inline
    def setDestinationUrisVarargs(value: String*): Self = StObject.set(x, "destinationUris", js.Array(value :_*))
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setPrintHeader(value: Boolean): Self = StObject.set(x, "printHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHeaderUndefined: Self = StObject.set(x, "printHeader", js.undefined)
    
    @scala.inline
    def setSourceModel(value: ModelReference): Self = StObject.set(x, "sourceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceModelUndefined: Self = StObject.set(x, "sourceModel", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    @scala.inline
    def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
  }
}
