package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an InterconnectLocations resource. The InterconnectLocations
  * resource describes the locations where you can connect to Google&#39;s
  * networks. For more information, see  Colocation Facilities.
  */
@js.native
trait SchemaInterconnectLocation extends js.Object {
  /**
    * [Output Only] The postal address of the Point of Presence, each line in
    * the address is separated by a newline character.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * [Output Only] Availability zone for this InterconnectLocation. Within a
    * metropolitan area (metro), maintenance will not be simultaneously
    * scheduled in more than one availability zone. Example: &quot;zone1&quot;
    * or &quot;zone2&quot;.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * [Output Only] Metropolitan area designator that indicates which city an
    * interconnect is located. For example: &quot;Chicago, IL&quot;,
    * &quot;Amsterdam, Netherlands&quot;.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * [Output Only] Continent for this location.
    */
  var continent: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
    */
  var facilityProvider: js.UndefOr[String] = js.native
  /**
    * [Output Only] A provider-assigned Identifier for this facility (e.g.,
    * Ashburn-DC1).
    */
  var facilityProviderFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnectLocation
    * for interconnect locations.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The peeringdb identifier for this facility (corresponding
    * with a netfac type in peeringdb).
    */
  var peeringdbFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of InterconnectLocation.RegionInfo objects, that
    * describe parameters pertaining to the relation between this
    * InterconnectLocation and various Google Cloud regions.
    */
  var regionInfos: js.UndefOr[js.Array[SchemaInterconnectLocationRegionInfo]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of this InterconnectLocation. If the status is
    * AVAILABLE, new Interconnects may be provisioned in this
    * InterconnectLocation. Otherwise, no new Interconnects may be provisioned.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocation {
  @scala.inline
  def apply(
    address: String = null,
    availabilityZone: String = null,
    city: String = null,
    continent: String = null,
    creationTimestamp: String = null,
    description: String = null,
    facilityProvider: String = null,
    facilityProviderFacilityId: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    peeringdbFacilityId: String = null,
    regionInfos: js.Array[SchemaInterconnectLocationRegionInfo] = null,
    selfLink: String = null,
    status: String = null
  ): SchemaInterconnectLocation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (facilityProvider != null) __obj.updateDynamic("facilityProvider")(facilityProvider.asInstanceOf[js.Any])
    if (facilityProviderFacilityId != null) __obj.updateDynamic("facilityProviderFacilityId")(facilityProviderFacilityId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (peeringdbFacilityId != null) __obj.updateDynamic("peeringdbFacilityId")(peeringdbFacilityId.asInstanceOf[js.Any])
    if (regionInfos != null) __obj.updateDynamic("regionInfos")(regionInfos.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectLocation]
  }
}

