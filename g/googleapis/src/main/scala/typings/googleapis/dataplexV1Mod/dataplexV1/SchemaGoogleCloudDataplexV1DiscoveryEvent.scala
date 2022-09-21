package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1DiscoveryEvent extends StObject {
  
  /**
    * Details about the action associated with the event.
    */
  var action: js.UndefOr[SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails] = js.undefined
  
  /**
    * The id of the associated asset.
    */
  var assetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about discovery configuration in effect.
    */
  var config: js.UndefOr[SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails] = js.undefined
  
  /**
    * The data location associated with the event.
    */
  var dataLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the entity associated with the event.
    */
  var entity: js.UndefOr[SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails] = js.undefined
  
  /**
    * The id of the associated lake.
    */
  var lakeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The log message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the partition associated with the event.
    */
  var partition: js.UndefOr[SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails] = js.undefined
  
  /**
    * The type of the event being logged.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the associated zone.
    */
  var zoneId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1DiscoveryEvent {
  
  inline def apply(): SchemaGoogleCloudDataplexV1DiscoveryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1DiscoveryEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1DiscoveryEvent](x: Self) {
    
    inline def setAction(value: SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdNull: Self = StObject.set(x, "assetId", null)
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDataLocation(value: String): Self = StObject.set(x, "dataLocation", value.asInstanceOf[js.Any])
    
    inline def setDataLocationNull: Self = StObject.set(x, "dataLocation", null)
    
    inline def setDataLocationUndefined: Self = StObject.set(x, "dataLocation", js.undefined)
    
    inline def setEntity(value: SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setLakeId(value: String): Self = StObject.set(x, "lakeId", value.asInstanceOf[js.Any])
    
    inline def setLakeIdNull: Self = StObject.set(x, "lakeId", null)
    
    inline def setLakeIdUndefined: Self = StObject.set(x, "lakeId", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPartition(value: SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    inline def setZoneIdNull: Self = StObject.set(x, "zoneId", null)
    
    inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
