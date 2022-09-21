package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConfig extends StObject {
  
  /**
    * The name of this instance configuration as it appears in UIs.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Describes whether free instances are available to be created in this instance config.
    */
  var freeInstanceAvailability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Allowed values of the "default_leader" schema option for databases in instances that use this instance configuration.
    */
  var leaderOptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique identifier for the instance configuration. Values are of the form `projects//instanceConfigs/a-z*`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geographic placement of nodes in this instance configuration and their replication properties.
    */
  var replicas: js.UndefOr[js.Array[SchemaReplicaInfo]] = js.undefined
}
object SchemaInstanceConfig {
  
  inline def apply(): SchemaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConfig]
  }
  
  extension [Self <: SchemaInstanceConfig](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFreeInstanceAvailability(value: String): Self = StObject.set(x, "freeInstanceAvailability", value.asInstanceOf[js.Any])
    
    inline def setFreeInstanceAvailabilityNull: Self = StObject.set(x, "freeInstanceAvailability", null)
    
    inline def setFreeInstanceAvailabilityUndefined: Self = StObject.set(x, "freeInstanceAvailability", js.undefined)
    
    inline def setLeaderOptions(value: js.Array[String]): Self = StObject.set(x, "leaderOptions", value.asInstanceOf[js.Any])
    
    inline def setLeaderOptionsNull: Self = StObject.set(x, "leaderOptions", null)
    
    inline def setLeaderOptionsUndefined: Self = StObject.set(x, "leaderOptions", js.undefined)
    
    inline def setLeaderOptionsVarargs(value: String*): Self = StObject.set(x, "leaderOptions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicas(value: js.Array[SchemaReplicaInfo]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: SchemaReplicaInfo*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
