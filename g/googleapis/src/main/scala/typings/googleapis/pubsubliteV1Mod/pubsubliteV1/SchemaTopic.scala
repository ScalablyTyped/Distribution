package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopic extends StObject {
  
  /**
    * The name of the topic. Structured like: projects/{project_number\}/locations/{location\}/topics/{topic_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The settings for this topic's partitions.
    */
  var partitionConfig: js.UndefOr[SchemaPartitionConfig] = js.undefined
  
  /**
    * The settings for this topic's Reservation usage.
    */
  var reservationConfig: js.UndefOr[SchemaReservationConfig] = js.undefined
  
  /**
    * The settings for this topic's message retention.
    */
  var retentionConfig: js.UndefOr[SchemaRetentionConfig] = js.undefined
}
object SchemaTopic {
  
  inline def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  
  extension [Self <: SchemaTopic](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartitionConfig(value: SchemaPartitionConfig): Self = StObject.set(x, "partitionConfig", value.asInstanceOf[js.Any])
    
    inline def setPartitionConfigUndefined: Self = StObject.set(x, "partitionConfig", js.undefined)
    
    inline def setReservationConfig(value: SchemaReservationConfig): Self = StObject.set(x, "reservationConfig", value.asInstanceOf[js.Any])
    
    inline def setReservationConfigUndefined: Self = StObject.set(x, "reservationConfig", js.undefined)
    
    inline def setRetentionConfig(value: SchemaRetentionConfig): Self = StObject.set(x, "retentionConfig", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigUndefined: Self = StObject.set(x, "retentionConfig", js.undefined)
  }
}
