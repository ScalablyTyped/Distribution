package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1BigQueryDateShardedSpec extends StObject {
  
  /**
    * Output only. The Data Catalog resource name of the dataset entry the current table belongs to. For example: `projects/{PROJECT_ID\}/locations/{LOCATION\}/entrygroups/{ENTRY_GROUP_ID\}/entries/{ENTRY_ID\}`.
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. BigQuery resource name of the latest shard.
    */
  var latestShardResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Total number of shards.
    */
  var shardCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`. For example, for the `MyTable20180101` shard, the `table_prefix` is `MyTable`.
    */
  var tablePrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1BigQueryDateShardedSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1BigQueryDateShardedSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1BigQueryDateShardedSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1BigQueryDateShardedSpec](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setLatestShardResource(value: String): Self = StObject.set(x, "latestShardResource", value.asInstanceOf[js.Any])
    
    inline def setLatestShardResourceNull: Self = StObject.set(x, "latestShardResource", null)
    
    inline def setLatestShardResourceUndefined: Self = StObject.set(x, "latestShardResource", js.undefined)
    
    inline def setShardCount(value: String): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountNull: Self = StObject.set(x, "shardCount", null)
    
    inline def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
    
    inline def setTablePrefix(value: String): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixNull: Self = StObject.set(x, "tablePrefix", null)
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
  }
}
