package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationExtract extends js.Object {
  
  /**
    * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported
    * for Avro. Not applicable when extracting models.
    */
  var compression: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The
    * default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
    */
  var destinationFormat: js.UndefOr[String] = js.native
  
  /** [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written. */
  var destinationUri: js.UndefOr[String] = js.native
  
  /** [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written. */
  var destinationUris: js.UndefOr[js.Array[String]] = js.native
  
  /** [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models. */
  var fieldDelimiter: js.UndefOr[String] = js.native
  
  /** [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models. */
  var printHeader: js.UndefOr[Boolean] = js.native
  
  /** A reference to the model being exported. */
  var sourceModel: js.UndefOr[ModelReference] = js.native
  
  /** A reference to the table being exported. */
  var sourceTable: js.UndefOr[TableReference] = js.native
  
  /**
    * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical
    * types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.native
}
object JobConfigurationExtract {
  
  @scala.inline
  def apply(): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationExtract]
  }
  
  @scala.inline
  implicit class JobConfigurationExtractOps[Self <: JobConfigurationExtract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setDestinationFormat(value: String): Self = this.set("destinationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationFormat: Self = this.set("destinationFormat", js.undefined)
    
    @scala.inline
    def setDestinationUri(value: String): Self = this.set("destinationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUri: Self = this.set("destinationUri", js.undefined)
    
    @scala.inline
    def setDestinationUrisVarargs(value: String*): Self = this.set("destinationUris", js.Array(value :_*))
    
    @scala.inline
    def setDestinationUris(value: js.Array[String]): Self = this.set("destinationUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUris: Self = this.set("destinationUris", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
    
    @scala.inline
    def setPrintHeader(value: Boolean): Self = this.set("printHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintHeader: Self = this.set("printHeader", js.undefined)
    
    @scala.inline
    def setSourceModel(value: ModelReference): Self = this.set("sourceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceModel: Self = this.set("sourceModel", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableReference): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
    
    @scala.inline
    def setUseAvroLogicalTypes(value: Boolean): Self = this.set("useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAvroLogicalTypes: Self = this.set("useAvroLogicalTypes", js.undefined)
  }
}
