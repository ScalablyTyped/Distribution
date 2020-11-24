package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Entry extends js.Object {
  
  /** Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding. */
  var bigqueryDateShardedSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec] = js.native
  
  /** Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`. */
  var bigqueryTableSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1BigQueryTableSpec] = js.native
  
  /** Entry description, which can consist of several sentences or paragraphs that describe entry contents. Default value is an empty string. */
  var description: js.UndefOr[String] = js.native
  
  /** Display information such as title and description. A short name to identify the entry, for example, "Analytics Data - Jan 2011". Default value is an empty string. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET. */
  var gcsFilesetSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1GcsFilesetSpec] = js.native
  
  /** Output only. This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub. */
  var integratedSystem: js.UndefOr[String] = js.native
  
  /**
    * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [full name of the
    * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: *
    * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this
    * field is optional and defaults to an empty string.
    */
  var linkedResource: js.UndefOr[String] = js.native
  
  /**
    * The Data Catalog resource name of the entry in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id} Note that this Entry
    * and its child resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Schema of the entry. An entry might not have any schema attached to it. */
  var schema: js.UndefOr[GoogleCloudDatacatalogV1beta1Schema] = js.native
  
  /**
    * Output only. Timestamps about the underlying resource, not about this Data Catalog entry. Output only when Entry is of type in the EntryType enum. For entries with
    * user_specified_type, this field is optional and defaults to an empty timestamp.
    */
  var sourceSystemTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.native
  
  /** The type of the entry. Only used for Entries with types in the EntryType enum. */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * This field indicates the entry's source system that Data Catalog does not integrate with. `user_specified_system` strings must begin with a letter or underscore and can only contain
    * letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
    */
  var userSpecifiedSystem: js.UndefOr[String] = js.native
  
  /**
    * Entry type if it does not fit any of the input-allowed values listed in `EntryType` enum above. When creating an entry, users should check the enum values first, if nothing matches
    * the entry to be created, then provide a custom value, for example "my_special_type". `user_specified_type` strings must begin with a letter or underscore and can only contain
    * letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long. Currently, only FILESET enum value is allowed. All other
    * entries created through Data Catalog must use `user_specified_type`.
    */
  var userSpecifiedType: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1Entry {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Entry]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1EntryOps[Self <: GoogleCloudDatacatalogV1beta1Entry] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDateShardedSpec(value: GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec): Self = this.set("bigqueryDateShardedSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDateShardedSpec: Self = this.set("bigqueryDateShardedSpec", js.undefined)
    
    @scala.inline
    def setBigqueryTableSpec(value: GoogleCloudDatacatalogV1beta1BigQueryTableSpec): Self = this.set("bigqueryTableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryTableSpec: Self = this.set("bigqueryTableSpec", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGcsFilesetSpec(value: GoogleCloudDatacatalogV1beta1GcsFilesetSpec): Self = this.set("gcsFilesetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsFilesetSpec: Self = this.set("gcsFilesetSpec", js.undefined)
    
    @scala.inline
    def setIntegratedSystem(value: String): Self = this.set("integratedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegratedSystem: Self = this.set("integratedSystem", js.undefined)
    
    @scala.inline
    def setLinkedResource(value: String): Self = this.set("linkedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedResource: Self = this.set("linkedResource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchema(value: GoogleCloudDatacatalogV1beta1Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSourceSystemTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = this.set("sourceSystemTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSystemTimestamps: Self = this.set("sourceSystemTimestamps", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserSpecifiedSystem(value: String): Self = this.set("userSpecifiedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSpecifiedSystem: Self = this.set("userSpecifiedSystem", js.undefined)
    
    @scala.inline
    def setUserSpecifiedType(value: String): Self = this.set("userSpecifiedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSpecifiedType: Self = this.set("userSpecifiedType", js.undefined)
  }
}
