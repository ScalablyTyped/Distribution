package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1Entry extends StObject {
  
  /** Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding. */
  var bigqueryDateShardedSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec] = js.undefined
  
  /** Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`. */
  var bigqueryTableSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1BigQueryTableSpec] = js.undefined
  
  /** Entry description, which can consist of several sentences or paragraphs that describe entry contents. Default value is an empty string. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display information such as title and description. A short name to identify the entry, for example, "Analytics Data - Jan 2011". Default value is an empty string. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET. */
  var gcsFilesetSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1GcsFilesetSpec] = js.undefined
  
  /** Output only. This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub. */
  var integratedSystem: js.UndefOr[String] = js.undefined
  
  /**
    * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [full name of the
    * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: *
    * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this
    * field is optional and defaults to an empty string.
    */
  var linkedResource: js.UndefOr[String] = js.undefined
  
  /**
    * The Data Catalog resource name of the entry in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id} Note that this Entry
    * and its child resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Schema of the entry. An entry might not have any schema attached to it. */
  var schema: js.UndefOr[GoogleCloudDatacatalogV1beta1Schema] = js.undefined
  
  /**
    * Output only. Timestamps about the underlying resource, not about this Data Catalog entry. Output only when Entry is of type in the EntryType enum. For entries with
    * user_specified_type, this field is optional and defaults to an empty timestamp.
    */
  var sourceSystemTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.undefined
  
  /** The type of the entry. Only used for Entries with types in the EntryType enum. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * This field indicates the entry's source system that Data Catalog does not integrate with. `user_specified_system` strings must begin with a letter or underscore and can only contain
    * letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
    */
  var userSpecifiedSystem: js.UndefOr[String] = js.undefined
  
  /**
    * Entry type if it does not fit any of the input-allowed values listed in `EntryType` enum above. When creating an entry, users should check the enum values first, if nothing matches
    * the entry to be created, then provide a custom value, for example "my_special_type". `user_specified_type` strings must begin with a letter or underscore and can only contain
    * letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long. Currently, only FILESET enum value is allowed. All other
    * entries created through Data Catalog must use `user_specified_type`.
    */
  var userSpecifiedType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1Entry {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Entry]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1EntryMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1Entry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDateShardedSpec(value: GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec): Self = StObject.set(x, "bigqueryDateShardedSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDateShardedSpecUndefined: Self = StObject.set(x, "bigqueryDateShardedSpec", js.undefined)
    
    @scala.inline
    def setBigqueryTableSpec(value: GoogleCloudDatacatalogV1beta1BigQueryTableSpec): Self = StObject.set(x, "bigqueryTableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryTableSpecUndefined: Self = StObject.set(x, "bigqueryTableSpec", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGcsFilesetSpec(value: GoogleCloudDatacatalogV1beta1GcsFilesetSpec): Self = StObject.set(x, "gcsFilesetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsFilesetSpecUndefined: Self = StObject.set(x, "gcsFilesetSpec", js.undefined)
    
    @scala.inline
    def setIntegratedSystem(value: String): Self = StObject.set(x, "integratedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegratedSystemUndefined: Self = StObject.set(x, "integratedSystem", js.undefined)
    
    @scala.inline
    def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSchema(value: GoogleCloudDatacatalogV1beta1Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSourceSystemTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = StObject.set(x, "sourceSystemTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSystemTimestampsUndefined: Self = StObject.set(x, "sourceSystemTimestamps", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserSpecifiedSystem(value: String): Self = StObject.set(x, "userSpecifiedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSpecifiedSystemUndefined: Self = StObject.set(x, "userSpecifiedSystem", js.undefined)
    
    @scala.inline
    def setUserSpecifiedType(value: String): Self = StObject.set(x, "userSpecifiedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSpecifiedTypeUndefined: Self = StObject.set(x, "userSpecifiedType", js.undefined)
  }
}
