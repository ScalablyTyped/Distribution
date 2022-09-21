package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1Entry extends StObject {
  
  /**
    * Output only. Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables]
    * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
    */
  var bigqueryDateShardedSpec: js.UndefOr[GoogleCloudDatacatalogV1BigQueryDateShardedSpec] = js.undefined
  
  /** Output only. Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type. */
  var bigqueryTableSpec: js.UndefOr[GoogleCloudDatacatalogV1BigQueryTableSpec] = js.undefined
  
  /** Business Context of the entry. Not supported for BigQuery datasets */
  var businessContext: js.UndefOr[GoogleCloudDatacatalogV1BusinessContext] = js.undefined
  
  /** Output only. Physical location of the entry. */
  var dataSource: js.UndefOr[GoogleCloudDatacatalogV1DataSource] = js.undefined
  
  /** Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type. */
  var dataSourceConnectionSpec: js.UndefOr[GoogleCloudDatacatalogV1DataSourceConnectionSpec] = js.undefined
  
  /** Specification that applies to a table resource. Valid only for entries with the `TABLE` type. */
  var databaseTableSpec: js.UndefOr[GoogleCloudDatacatalogV1DatabaseTableSpec] = js.undefined
  
  /**
    * Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1
    * control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum size is
    * 200 bytes when encoded in UTF-8. Default value is an empty string.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type. */
  var filesetSpec: js.UndefOr[GoogleCloudDatacatalogV1FilesetSpec] = js.undefined
  
  /**
    * Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be
    * used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized
    * resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table:
    * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  
  /** Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type. */
  var gcsFilesetSpec: js.UndefOr[GoogleCloudDatacatalogV1GcsFilesetSpec] = js.undefined
  
  /** Output only. Indicates the entry's source system that Data Catalog integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore. */
  var integratedSystem: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the
    * source system.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1Entry & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name]
    * (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is:
    * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a
    * `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.),
    * colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
    */
  var linkedResource: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information related to the entry. Private to the current user. */
  var personalDetails: js.UndefOr[GoogleCloudDatacatalogV1PersonalDetails] = js.undefined
  
  /** Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type. */
  var routineSpec: js.UndefOr[GoogleCloudDatacatalogV1RoutineSpec] = js.undefined
  
  /** Schema of the entry. An entry might not have any schema attached to it. */
  var schema: js.UndefOr[GoogleCloudDatacatalogV1Schema] = js.undefined
  
  /**
    * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with
    * `user_specified_type`, this field is optional and defaults to an empty timestamp.
    */
  var sourceSystemTimestamps: js.UndefOr[GoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
  
  /**
    * The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog
    * must use the `user_specified_type`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource usage statistics. */
  var usageSignal: js.UndefOr[GoogleCloudDatacatalogV1UsageSignal] = js.undefined
  
  /**
    * Indicates the entry's source system that Data Catalog doesn't automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive.
    * * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
    */
  var userSpecifiedSystem: js.UndefOr[String] = js.undefined
  
  /**
    * Custom entry type that doesn't match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If
    * there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case
    * insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
    */
  var userSpecifiedType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1Entry {
  
  inline def apply(): GoogleCloudDatacatalogV1Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1Entry]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1Entry](x: Self) {
    
    inline def setBigqueryDateShardedSpec(value: GoogleCloudDatacatalogV1BigQueryDateShardedSpec): Self = StObject.set(x, "bigqueryDateShardedSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDateShardedSpecUndefined: Self = StObject.set(x, "bigqueryDateShardedSpec", js.undefined)
    
    inline def setBigqueryTableSpec(value: GoogleCloudDatacatalogV1BigQueryTableSpec): Self = StObject.set(x, "bigqueryTableSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryTableSpecUndefined: Self = StObject.set(x, "bigqueryTableSpec", js.undefined)
    
    inline def setBusinessContext(value: GoogleCloudDatacatalogV1BusinessContext): Self = StObject.set(x, "businessContext", value.asInstanceOf[js.Any])
    
    inline def setBusinessContextUndefined: Self = StObject.set(x, "businessContext", js.undefined)
    
    inline def setDataSource(value: GoogleCloudDatacatalogV1DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConnectionSpec(value: GoogleCloudDatacatalogV1DataSourceConnectionSpec): Self = StObject.set(x, "dataSourceConnectionSpec", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConnectionSpecUndefined: Self = StObject.set(x, "dataSourceConnectionSpec", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDatabaseTableSpec(value: GoogleCloudDatacatalogV1DatabaseTableSpec): Self = StObject.set(x, "databaseTableSpec", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTableSpecUndefined: Self = StObject.set(x, "databaseTableSpec", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilesetSpec(value: GoogleCloudDatacatalogV1FilesetSpec): Self = StObject.set(x, "filesetSpec", value.asInstanceOf[js.Any])
    
    inline def setFilesetSpecUndefined: Self = StObject.set(x, "filesetSpec", js.undefined)
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setGcsFilesetSpec(value: GoogleCloudDatacatalogV1GcsFilesetSpec): Self = StObject.set(x, "gcsFilesetSpec", value.asInstanceOf[js.Any])
    
    inline def setGcsFilesetSpecUndefined: Self = StObject.set(x, "gcsFilesetSpec", js.undefined)
    
    inline def setIntegratedSystem(value: String): Self = StObject.set(x, "integratedSystem", value.asInstanceOf[js.Any])
    
    inline def setIntegratedSystemUndefined: Self = StObject.set(x, "integratedSystem", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1Entry & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPersonalDetails(value: GoogleCloudDatacatalogV1PersonalDetails): Self = StObject.set(x, "personalDetails", value.asInstanceOf[js.Any])
    
    inline def setPersonalDetailsUndefined: Self = StObject.set(x, "personalDetails", js.undefined)
    
    inline def setRoutineSpec(value: GoogleCloudDatacatalogV1RoutineSpec): Self = StObject.set(x, "routineSpec", value.asInstanceOf[js.Any])
    
    inline def setRoutineSpecUndefined: Self = StObject.set(x, "routineSpec", js.undefined)
    
    inline def setSchema(value: GoogleCloudDatacatalogV1Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSourceSystemTimestamps(value: GoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "sourceSystemTimestamps", value.asInstanceOf[js.Any])
    
    inline def setSourceSystemTimestampsUndefined: Self = StObject.set(x, "sourceSystemTimestamps", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsageSignal(value: GoogleCloudDatacatalogV1UsageSignal): Self = StObject.set(x, "usageSignal", value.asInstanceOf[js.Any])
    
    inline def setUsageSignalUndefined: Self = StObject.set(x, "usageSignal", js.undefined)
    
    inline def setUserSpecifiedSystem(value: String): Self = StObject.set(x, "userSpecifiedSystem", value.asInstanceOf[js.Any])
    
    inline def setUserSpecifiedSystemUndefined: Self = StObject.set(x, "userSpecifiedSystem", js.undefined)
    
    inline def setUserSpecifiedType(value: String): Self = StObject.set(x, "userSpecifiedType", value.asInstanceOf[js.Any])
    
    inline def setUserSpecifiedTypeUndefined: Self = StObject.set(x, "userSpecifiedType", js.undefined)
  }
}
