package typings.googleapis.redisV1Mod.redisV1

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
    * are:   *   maxmemory-policy  *   notify-keyspace-events
    */
  var redisConfigs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Optional. The version of Redis software. If not provided, latest
    * supported version will be used. Updating the version will perform an
    * upgrade/downgrade to the new version. Currently, the supported values are
    * `REDIS_3_2` for Redis 3.2.
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
  
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  @scala.inline
  implicit class SchemaInstanceMutableBuilder[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeLocationId(value: String): Self = StObject.set(x, "alternativeLocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeLocationIdUndefined: Self = StObject.set(x, "alternativeLocationId", js.undefined)
    
    @scala.inline
    def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCurrentLocationId(value: String): Self = StObject.set(x, "currentLocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLocationIdUndefined: Self = StObject.set(x, "currentLocationId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setMemorySizeGb(value: Double): Self = StObject.set(x, "memorySizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeGbUndefined: Self = StObject.set(x, "memorySizeGb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRedisConfigs(value: StringDictionary[String]): Self = StObject.set(x, "redisConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedisConfigsUndefined: Self = StObject.set(x, "redisConfigs", js.undefined)
    
    @scala.inline
    def setRedisVersion(value: String): Self = StObject.set(x, "redisVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedisVersionUndefined: Self = StObject.set(x, "redisVersion", js.undefined)
    
    @scala.inline
    def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
