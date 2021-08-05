package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Cloud Redis instance.
  */
trait SchemaInstance extends StObject {
  
  /**
    * Optional. Only applicable to STANDARD_HA tier which protects the instance
    * against zonal failures by provisioning it across two zones. If provided,
    * it must be a different zone from the one provided in [location_id].
    */
  var alternativeLocationId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The full name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * instance is connected. If left unspecified, the `default` network will be
    * used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time the instance was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The current zone where the Redis endpoint is placed. For
    * Basic Tier instances, this will always be the same as the [location_id]
    * provided by the user at creation time. For Standard Tier instances, this
    * can be either [location_id] or [alternative_location_id] and can change
    * after a failover event.
    */
  var currentLocationId: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary and optional user-provided name for the instance.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Hostname or IP address of the exposed Redis endpoint used by
    * clients to connect to the service.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Resource labels to represent user provided metadata
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Optional. The zone where the instance will be provisioned. If not
    * provided, the service will choose a zone for the instance. For
    * STANDARD_HA tier, instances will be created across two zones for
    * protection against zonal failures. If [alternative_location_id] is also
    * provided, it must be different from [location_id].
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Redis memory size in GiB.
    */
  var memorySizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. Unique name of the resource in this scope including project and
    * location using the form:
    * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
    * Note: Redis instances are managed and addressed at regional level so
    * location_id here refers to a GCP region; however, users may choose which
    * specific zone (or collection of zones for cross-zone instances) an
    * instance should be provisioned in. Refer to [location_id] and
    * [alternative_location_id] fields for more details.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The port number of the exposed Redis endpoint.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Redis configuration parameters, according to
    * http://redis.io/topics/config. Currently, the only supported parameters
    * are:   Redis 3.2 and above:   *   maxmemory-policy  *
    * notify-keyspace-events   Redis 4.0 and above:   *   activedefrag  *
    * lfu-log-factor  *   lfu-decay-time
    */
  var redisConfigs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Optional. The version of Redis software. If not provided, latest
    * supported version will be used. Updating the version will perform an
    * upgrade/downgrade to the new version. Currently, the supported values
    * are:   *   `REDIS_4_0` for Redis 4.0 compatibility  *   `REDIS_3_2` for
    * Redis 3.2 compatibility
    */
  var redisVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The CIDR range of internal addresses that are reserved for this
    * instance. If not provided, the service will choose an unused /29 block,
    * for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be unique and
    * non-overlapping with existing subnets in an authorized network.
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The current state of this instance.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Additional information about the current status of this
    * instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The service tier of the instance.
    */
  var tier: js.UndefOr[String] = js.undefined
}
object SchemaInstance {
  
  inline def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  extension [Self <: SchemaInstance](x: Self) {
    
    inline def setAlternativeLocationId(value: String): Self = StObject.set(x, "alternativeLocationId", value.asInstanceOf[js.Any])
    
    inline def setAlternativeLocationIdUndefined: Self = StObject.set(x, "alternativeLocationId", js.undefined)
    
    inline def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrentLocationId(value: String): Self = StObject.set(x, "currentLocationId", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationIdUndefined: Self = StObject.set(x, "currentLocationId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setMemorySizeGb(value: Double): Self = StObject.set(x, "memorySizeGb", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeGbUndefined: Self = StObject.set(x, "memorySizeGb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRedisConfigs(value: StringDictionary[String]): Self = StObject.set(x, "redisConfigs", value.asInstanceOf[js.Any])
    
    inline def setRedisConfigsUndefined: Self = StObject.set(x, "redisConfigs", js.undefined)
    
    inline def setRedisVersion(value: String): Self = StObject.set(x, "redisVersion", value.asInstanceOf[js.Any])
    
    inline def setRedisVersionUndefined: Self = StObject.set(x, "redisVersion", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
