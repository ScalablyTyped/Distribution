package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a beacon device.
  */
@js.native
trait SchemaBeacon extends StObject {
  
  /**
    * The identifier of a beacon as advertised by it. This field must be
    * populated when registering. It may be empty when updating a beacon record
    * because it is ignored in updates.  When registering a beacon that
    * broadcasts Eddystone-EID, this field should contain a &quot;stable&quot;
    * Eddystone-UID that identifies the beacon and links it to its attachments.
    * The stable Eddystone-UID is only used for administering the beacon.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.native
  
  /**
    * Resource name of this beacon. A beacon name has the format
    * &quot;beacons/N!beaconId&quot; where the beaconId is the base16 ID
    * broadcast by the beacon and N is a code for the beacon&#39;s type.
    * Possible values are `3` for Eddystone, `1` for iBeacon, or `5` for
    * AltBeacon.  This field must be left empty when registering. After reading
    * a beacon, clients can use the name for future operations.
    */
  var beaconName: js.UndefOr[String] = js.native
  
  /**
    * Free text used to identify and describe the beacon. Maximum length 140
    * characters. Optional.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Write-only registration parameters for beacons using Eddystone-EID
    * (remotely resolved ephemeral ID) format. This information will not be
    * populated in API responses. When submitting this data, the
    * `advertised_id` field must contain an ID of type Eddystone-UID. Any other
    * ID type will result in an error.
    */
  var ephemeralIdRegistration: js.UndefOr[SchemaEphemeralIdRegistration] = js.native
  
  /**
    * Expected location stability. This is set when the beacon is registered or
    * updated, not automatically detected in any way. Optional.
    */
  var expectedStability: js.UndefOr[String] = js.native
  
  /**
    * The indoor level information for this beacon, if known. As returned by
    * the Google Maps API. Optional.
    */
  var indoorLevel: js.UndefOr[SchemaIndoorLevel] = js.native
  
  /**
    * The location of the beacon, expressed as a latitude and longitude pair.
    * This location is given when the beacon is registered or updated. It does
    * not necessarily indicate the actual current location of the beacon.
    * Optional.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * The [Google Places API](/places/place-id) Place ID of the place where the
    * beacon is deployed. This is given when the beacon is registered or
    * updated, not automatically detected in any way. Optional.
    */
  var placeId: js.UndefOr[String] = js.native
  
  /**
    * Properties of the beacon device, for example battery type or firmware
    * version. Optional.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Some beacons may require a user to provide an authorization key before
    * changing any of its configuration (e.g. broadcast frames, transmit
    * power). This field provides a place to store and control access to that
    * key. This field is populated in responses to `GET
    * /v1beta1/beacons/3!beaconId` from users with write access to the given
    * beacon. That is to say: If the user is authorized to write the
    * beacon&#39;s confidential data in the service, the service considers them
    * authorized to configure the beacon. Note that this key grants nothing on
    * the service, only on the beacon itself.
    */
  var provisioningKey: js.UndefOr[String] = js.native
  
  /**
    * Current status of the beacon. Required.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaBeacon {
  
  @scala.inline
  def apply(): SchemaBeacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeacon]
  }
  
  @scala.inline
  implicit class SchemaBeaconMutableBuilder[Self <: SchemaBeacon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisedId(value: SchemaAdvertisedId): Self = StObject.set(x, "advertisedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedIdUndefined: Self = StObject.set(x, "advertisedId", js.undefined)
    
    @scala.inline
    def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEphemeralIdRegistration(value: SchemaEphemeralIdRegistration): Self = StObject.set(x, "ephemeralIdRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralIdRegistrationUndefined: Self = StObject.set(x, "ephemeralIdRegistration", js.undefined)
    
    @scala.inline
    def setExpectedStability(value: String): Self = StObject.set(x, "expectedStability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedStabilityUndefined: Self = StObject.set(x, "expectedStability", js.undefined)
    
    @scala.inline
    def setIndoorLevel(value: SchemaIndoorLevel): Self = StObject.set(x, "indoorLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoorLevelUndefined: Self = StObject.set(x, "indoorLevel", js.undefined)
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProvisioningKey(value: String): Self = StObject.set(x, "provisioningKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningKeyUndefined: Self = StObject.set(x, "provisioningKey", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
