package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShard extends StObject {
  
  /**
    * Output only. The total number of shards.
    */
  var numShards: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The index of the shard among all the shards.
    */
  var shardIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Test targets for each shard. Only set for manual sharding.
    */
  var testTargetsForShard: js.UndefOr[SchemaTestTargetsForShard] = js.undefined
}
object SchemaShard {
  
  inline def apply(): SchemaShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShard]
  }
  
  extension [Self <: SchemaShard](x: Self) {
    
    inline def setNumShards(value: Double): Self = StObject.set(x, "numShards", value.asInstanceOf[js.Any])
    
    inline def setNumShardsNull: Self = StObject.set(x, "numShards", null)
    
    inline def setNumShardsUndefined: Self = StObject.set(x, "numShards", js.undefined)
    
    inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    
    inline def setShardIndexNull: Self = StObject.set(x, "shardIndex", null)
    
    inline def setShardIndexUndefined: Self = StObject.set(x, "shardIndex", js.undefined)
    
    inline def setTestTargetsForShard(value: SchemaTestTargetsForShard): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
  }
}
