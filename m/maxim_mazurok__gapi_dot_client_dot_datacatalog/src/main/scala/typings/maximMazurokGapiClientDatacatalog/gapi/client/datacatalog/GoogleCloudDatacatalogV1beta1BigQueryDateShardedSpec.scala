package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec extends js.Object {
  
  /**
    * Output only. The Data Catalog resource name of the dataset entry the current table belongs to, for example,
    * `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
    */
  var dataset: js.UndefOr[String] = js.native
  
  /** Output only. Total number of shards. */
  var shardCount: js.UndefOr[String] = js.native
  
  /** Output only. The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the `table_prefix` is `MyTable`. */
  var tablePrefix: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecOps[Self <: GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setShardCount(value: String): Self = this.set("shardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardCount: Self = this.set("shardCount", js.undefined)
    
    @scala.inline
    def setTablePrefix(value: String): Self = this.set("tablePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablePrefix: Self = this.set("tablePrefix", js.undefined)
  }
}
