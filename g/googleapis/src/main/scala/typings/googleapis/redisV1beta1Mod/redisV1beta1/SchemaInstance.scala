package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Cloud Redis instance.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * Optional. Only applicable to STANDARD_HA tier which protects the instance
    * against zonal failures by provisioning it across two zones. If provided,
    * it must be a different zone from the one provided in [location_id].
    */
  var alternativeLocationId: js.UndefOr[String] = js.native
  /**
    * Optional. The full name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * instance is connected. If left unspecified, the `default` network will be
    * used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.native
  /**
    * Output only. The time the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The current zone where the Redis endpoint is placed. For
    * Basic Tier instances, this will always be the same as the [location_id]
    * provided by the user at creation time. For Standard Tier instances, this
    * can be either [location_id] or [alternative_location_id] and can change
    * after a failover event.
    */
  var currentLocationId: js.UndefOr[String] = js.native
  /**
    * An arbitrary and optional user-provided name for the instance.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. Hostname or IP address of the exposed Redis endpoint used by
    * clients to connect to the service.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Resource labels to represent user provided metadata
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The zone where the instance will be provisioned. If not
    * provided, the service will choose a zone for the instance. For
    * STANDARD_HA tier, instances will be created across two zones for
    * protection against zonal failures. If [alternative_location_id] is also
    * provided, it must be different from [location_id].
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Required. Redis memory size in GiB.
    */
  var memorySizeGb: js.UndefOr[Double] = js.native
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
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The port number of the exposed Redis endpoint.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Optional. Redis configuration parameters, according to
    * http://redis.io/topics/config. Currently, the only supported parameters
    * are:   Redis 3.2 and above:   *   maxmemory-policy  *
    * notify-keyspace-events   Redis 4.0 and above:   *   activedefrag  *
    * lfu-log-factor  *   lfu-decay-time
    */
  var redisConfigs: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The version of Redis software. If not provided, latest
    * supported version will be used. Updating the version will perform an
    * upgrade/downgrade to the new version. Currently, the supported values
    * are:   *   `REDIS_4_0` for Redis 4.0 compatibility  *   `REDIS_3_2` for
    * Redis 3.2 compatibility
    */
  var redisVersion: js.UndefOr[String] = js.native
  /**
    * Optional. The CIDR range of internal addresses that are reserved for this
    * instance. If not provided, the service will choose an unused /29 block,
    * for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be unique and
    * non-overlapping with existing subnets in an authorized network.
    */
  var reservedIpRange: js.UndefOr[String] = js.native
  /**
    * Output only. The current state of this instance.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Additional information about the current status of this
    * instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Required. The service tier of the instance.
    */
  var tier: js.UndefOr[String] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(
    alternativeLocationId: String = null,
    authorizedNetwork: String = null,
    createTime: String = null,
    currentLocationId: String = null,
    displayName: String = null,
    host: String = null,
    labels: StringDictionary[String] = null,
    locationId: String = null,
    memorySizeGb: Int | Double = null,
    name: String = null,
    port: Int | Double = null,
    redisConfigs: StringDictionary[String] = null,
    redisVersion: String = null,
    reservedIpRange: String = null,
    state: String = null,
    statusMessage: String = null,
    tier: String = null
  ): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    if (alternativeLocationId != null) __obj.updateDynamic("alternativeLocationId")(alternativeLocationId.asInstanceOf[js.Any])
    if (authorizedNetwork != null) __obj.updateDynamic("authorizedNetwork")(authorizedNetwork.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (currentLocationId != null) __obj.updateDynamic("currentLocationId")(currentLocationId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (memorySizeGb != null) __obj.updateDynamic("memorySizeGb")(memorySizeGb.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redisConfigs != null) __obj.updateDynamic("redisConfigs")(redisConfigs.asInstanceOf[js.Any])
    if (redisVersion != null) __obj.updateDynamic("redisVersion")(redisVersion.asInstanceOf[js.Any])
    if (reservedIpRange != null) __obj.updateDynamic("reservedIpRange")(reservedIpRange.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstance]
  }
}

