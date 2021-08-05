package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec extends StObject {
  
  /**
    * Output only. The Data Catalog resource name of the dataset entry the current table belongs to, for example,
    * `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
    */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Output only. Total number of shards. */
  var shardCount: js.UndefOr[String] = js.undefined
  
  /** Output only. The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the `table_prefix` is `MyTable`. */
  var tablePrefix: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setShardCount(value: String): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
    
    inline def setTablePrefix(value: String): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
  }
}
