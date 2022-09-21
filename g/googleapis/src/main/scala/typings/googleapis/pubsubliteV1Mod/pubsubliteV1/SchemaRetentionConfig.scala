package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetentionConfig extends StObject {
  
  /**
    * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic's partitions grows beyond this value, older messages will be dropped to make room for newer ones, regardless of the value of `period`.
    */
  var perPartitionBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`.
    */
  var period: js.UndefOr[String | Null] = js.undefined
}
object SchemaRetentionConfig {
  
  inline def apply(): SchemaRetentionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetentionConfig]
  }
  
  extension [Self <: SchemaRetentionConfig](x: Self) {
    
    inline def setPerPartitionBytes(value: String): Self = StObject.set(x, "perPartitionBytes", value.asInstanceOf[js.Any])
    
    inline def setPerPartitionBytesNull: Self = StObject.set(x, "perPartitionBytes", null)
    
    inline def setPerPartitionBytesUndefined: Self = StObject.set(x, "perPartitionBytes", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodNull: Self = StObject.set(x, "period", null)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
