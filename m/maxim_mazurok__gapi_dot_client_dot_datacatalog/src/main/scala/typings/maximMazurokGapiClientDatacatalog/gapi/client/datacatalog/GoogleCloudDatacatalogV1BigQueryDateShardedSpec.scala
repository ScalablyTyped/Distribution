package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1BigQueryDateShardedSpec extends StObject {
  
  /**
    * Output only. The Data Catalog resource name of the dataset entry the current table belongs to. For example:
    * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
    */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Output only. BigQuery resource name of the latest shard. */
  var latestShardResource: js.UndefOr[String] = js.undefined
  
  /** Output only. Total number of shards. */
  var shardCount: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`. For example, for the `MyTable20180101` shard, the `table_prefix` is
    * `MyTable`.
    */
  var tablePrefix: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1BigQueryDateShardedSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1BigQueryDateShardedSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1BigQueryDateShardedSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1BigQueryDateShardedSpec](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setLatestShardResource(value: String): Self = StObject.set(x, "latestShardResource", value.asInstanceOf[js.Any])
    
    inline def setLatestShardResourceUndefined: Self = StObject.set(x, "latestShardResource", js.undefined)
    
    inline def setShardCount(value: String): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
    
    inline def setTablePrefix(value: String): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
  }
}
