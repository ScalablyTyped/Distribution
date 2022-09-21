package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1AssetDiscoveryStatus extends StObject {
  
  /**
    * The duration of the last discovery run.
    */
  var lastRunDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of the last discovery run.
    */
  var lastRunTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about the current state.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current status of the discovery feature.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data Stats of the asset reported by discovery.
    */
  var stats: js.UndefOr[SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats] = js.undefined
  
  /**
    * Last update time of the status.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1AssetDiscoveryStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1AssetDiscoveryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1AssetDiscoveryStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1AssetDiscoveryStatus](x: Self) {
    
    inline def setLastRunDuration(value: String): Self = StObject.set(x, "lastRunDuration", value.asInstanceOf[js.Any])
    
    inline def setLastRunDurationNull: Self = StObject.set(x, "lastRunDuration", null)
    
    inline def setLastRunDurationUndefined: Self = StObject.set(x, "lastRunDuration", js.undefined)
    
    inline def setLastRunTime(value: String): Self = StObject.set(x, "lastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeNull: Self = StObject.set(x, "lastRunTime", null)
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "lastRunTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStats(value: SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
