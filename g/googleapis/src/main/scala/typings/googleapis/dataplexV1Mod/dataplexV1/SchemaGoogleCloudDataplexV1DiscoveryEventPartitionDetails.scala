package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails extends StObject {
  
  /**
    * The name to the containing entity resource. The name is the fully-qualified resource name.
    */
  var entity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name to the partition resource. The name is the fully-qualified resource name.
    */
  var partition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The locations of the data items (e.g., a Cloud Storage objects) sampled for metadata inference.
    */
  var sampledDataLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The type of the containing entity resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails {
  
  inline def apply(): SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1DiscoveryEventPartitionDetails](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setSampledDataLocations(value: js.Array[String]): Self = StObject.set(x, "sampledDataLocations", value.asInstanceOf[js.Any])
    
    inline def setSampledDataLocationsNull: Self = StObject.set(x, "sampledDataLocations", null)
    
    inline def setSampledDataLocationsUndefined: Self = StObject.set(x, "sampledDataLocations", js.undefined)
    
    inline def setSampledDataLocationsVarargs(value: String*): Self = StObject.set(x, "sampledDataLocations", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
