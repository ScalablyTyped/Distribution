package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDataConfiguration extends StObject {
  
  /** Try to detect schema and format options automatically. Any option specified explicitly will be honored. */
  var autodetect: js.UndefOr[Boolean] = js.native
  
  /** [Optional] Additional options if sourceFormat is set to BIGTABLE. */
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.native
  
  /**
    * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud
    * Datastore backups and Avro formats.
    */
  var compression: js.UndefOr[String] = js.native
  
  /** [Optional, Trusted Tester] Connection for external data source. */
  var connectionId: js.UndefOr[String] = js.native
  
  /** Additional properties to set if sourceFormat is set to CSV. */
  var csvOptions: js.UndefOr[CsvOptions] = js.native
  
  /** [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS. */
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.native
  
  /** [Optional, Trusted Tester] Options to configure hive partitioning support. */
  var hivePartitioningOptions: js.UndefOr[HivePartitioningOptions] = js.native
  
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns
    * are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines
    * what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud
    * Datastore backups: This setting is ignored. Avro: This setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job
    * result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable,
    * Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  
  /** [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore backups, and Avro formats. */
  var schema: js.UndefOr[TableSchema] = js.native
  
  /**
    * [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro files,
    * specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud Bigtable, specify "BIGTABLE".
    */
  var sourceFormat: js.UndefOr[String] = js.native
  
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after
    * the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified
    * and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}
object ExternalDataConfiguration {
  
  @scala.inline
  def apply(): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
  
  @scala.inline
  implicit class ExternalDataConfigurationMutableBuilder[Self <: ExternalDataConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    @scala.inline
    def setBigtableOptions(value: BigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setCsvOptions(value: CsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    @scala.inline
    def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
    
    @scala.inline
    def setHivePartitioningOptions(value: HivePartitioningOptions): Self = StObject.set(x, "hivePartitioningOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHivePartitioningOptionsUndefined: Self = StObject.set(x, "hivePartitioningOptions", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value :_*))
  }
}
