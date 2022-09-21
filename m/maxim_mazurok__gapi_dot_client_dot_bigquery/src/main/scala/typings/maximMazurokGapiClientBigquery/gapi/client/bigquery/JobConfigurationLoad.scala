package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationLoad extends StObject {
  
  /**
    * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad
    * records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false. */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  
  /** [Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources. */
  var autodetect: js.UndefOr[Boolean] = js.undefined
  
  /** [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered. */
  var clustering: js.UndefOr[Clustering] = js.undefined
  
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
    * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field
    * determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING
    * supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and
    * if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is ["NUMERIC", "BIGNUMERIC"]. If (precision,scale)
    * is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38)
    * -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, ["BIGNUMERIC",
    * "NUMERIC"] is the same as ["NUMERIC", "BIGNUMERIC"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to ["NUMERIC", "STRING"] for ORC and ["NUMERIC"] for the other file
    * formats.
    */
  var decimalTargetTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  /** [Required] The destination table to load the data into. */
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  
  /** [Beta] [Optional] Properties with which to create the destination table if it is new. */
  var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.undefined
  
  /**
    * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has
    * been split using the values of the quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character
    * as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports
    * the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
    */
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  /** [Optional] Options to configure hive partitioning support. */
  var hivePartitioningOptions: js.UndefOr[HivePartitioningOptions] = js.undefined
  
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns
    * are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines
    * what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit
    * this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.
    */
  var jsonExtension: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job
    * result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.
    */
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  
  /**
    * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value when loading a CSV file. The
    * default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE.
    * For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
    */
  var nullMarker: js.UndefOr[String] = js.undefined
  
  /** [Optional] Options to configure parquet support. */
  var parquetOptions: js.UndefOr[ParquetOptions] = js.undefined
  
  /**
    * [Optional] Preserves the embedded ASCII control characters (the first 32 characters in the ASCII-table, from '\x00' to '\x1F') when loading from CSV. Only applicable to CSV, ignored
    * for other formats.
    */
  var preserveAsciiControlCharacters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be
    * top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in
    * the job result.
    */
  var projectionFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to
    * split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your
    * data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
    */
  var quote: js.UndefOr[String] = js.undefined
  
  /** [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified. */
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  
  /** User provided referencing file with the expected reader schema, Available for the format: AVRO, PARQUET, ORC. */
  var referenceFileSchemaUri: js.UndefOr[String] = js.undefined
  
  /** [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from Google Cloud Datastore. */
  var schema: js.UndefOr[TableSchema] = js.undefined
  
  /** [Deprecated] The inline schema. For CSV schemas, specify as "Field1:Type1[,Field2:Type2]*". For example, "foo:STRING, bar:INTEGER, baz:FLOAT". */
  var schemaInline: js.UndefOr[String] = js.undefined
  
  /** [Deprecated] The format of the schemaInline property. */
  var schemaInlineFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are
    * supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition
    * decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable
    * field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the
    * file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[Double] = js.undefined
  
  /**
    * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON, specify
    * "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". For parquet, specify "PARQUET". For orc, specify "ORC". The default value is CSV.
    */
  var sourceFormat: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after
    * the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified
    * and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  
  /**
    * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw
    * type (for example, INTEGER).
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
    * overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a
    * 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
    * Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object JobConfigurationLoad {
  
  inline def apply(): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationLoad]
  }
  
  extension [Self <: JobConfigurationLoad](x: Self) {
    
    inline def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
    
    inline def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
    
    inline def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
    
    inline def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
    
    inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    inline def setDecimalTargetTypes(value: js.Array[String]): Self = StObject.set(x, "decimalTargetTypes", value.asInstanceOf[js.Any])
    
    inline def setDecimalTargetTypesUndefined: Self = StObject.set(x, "decimalTargetTypes", js.undefined)
    
    inline def setDecimalTargetTypesVarargs(value: String*): Self = StObject.set(x, "decimalTargetTypes", js.Array(value*))
    
    inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    inline def setDestinationTableProperties(value: DestinationTableProperties): Self = StObject.set(x, "destinationTableProperties", value.asInstanceOf[js.Any])
    
    inline def setDestinationTablePropertiesUndefined: Self = StObject.set(x, "destinationTableProperties", js.undefined)
    
    inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    inline def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    inline def setHivePartitioningOptions(value: HivePartitioningOptions): Self = StObject.set(x, "hivePartitioningOptions", value.asInstanceOf[js.Any])
    
    inline def setHivePartitioningOptionsUndefined: Self = StObject.set(x, "hivePartitioningOptions", js.undefined)
    
    inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    inline def setJsonExtension(value: String): Self = StObject.set(x, "jsonExtension", value.asInstanceOf[js.Any])
    
    inline def setJsonExtensionUndefined: Self = StObject.set(x, "jsonExtension", js.undefined)
    
    inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    inline def setNullMarker(value: String): Self = StObject.set(x, "nullMarker", value.asInstanceOf[js.Any])
    
    inline def setNullMarkerUndefined: Self = StObject.set(x, "nullMarker", js.undefined)
    
    inline def setParquetOptions(value: ParquetOptions): Self = StObject.set(x, "parquetOptions", value.asInstanceOf[js.Any])
    
    inline def setParquetOptionsUndefined: Self = StObject.set(x, "parquetOptions", js.undefined)
    
    inline def setPreserveAsciiControlCharacters(value: Boolean): Self = StObject.set(x, "preserveAsciiControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setPreserveAsciiControlCharactersUndefined: Self = StObject.set(x, "preserveAsciiControlCharacters", js.undefined)
    
    inline def setProjectionFields(value: js.Array[String]): Self = StObject.set(x, "projectionFields", value.asInstanceOf[js.Any])
    
    inline def setProjectionFieldsUndefined: Self = StObject.set(x, "projectionFields", js.undefined)
    
    inline def setProjectionFieldsVarargs(value: String*): Self = StObject.set(x, "projectionFields", js.Array(value*))
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    inline def setReferenceFileSchemaUri(value: String): Self = StObject.set(x, "referenceFileSchemaUri", value.asInstanceOf[js.Any])
    
    inline def setReferenceFileSchemaUriUndefined: Self = StObject.set(x, "referenceFileSchemaUri", js.undefined)
    
    inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaInline(value: String): Self = StObject.set(x, "schemaInline", value.asInstanceOf[js.Any])
    
    inline def setSchemaInlineFormat(value: String): Self = StObject.set(x, "schemaInlineFormat", value.asInstanceOf[js.Any])
    
    inline def setSchemaInlineFormatUndefined: Self = StObject.set(x, "schemaInlineFormat", js.undefined)
    
    inline def setSchemaInlineUndefined: Self = StObject.set(x, "schemaInline", js.undefined)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    inline def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
    
    inline def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value*))
    
    inline def setSkipLeadingRows(value: Double): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
    
    inline def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
    
    inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value*))
    
    inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    inline def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    inline def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
