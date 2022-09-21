package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalInstallationParams extends StObject {
  
  /**
    * Boresight direction of the horizontal plane of the antenna in degrees with respect to true north. The value of this parameter is an integer with a value between 0 and 359 inclusive. A value of 0 degrees means true north; a value of 90 degrees means east. This parameter is optional for Category A devices and conditional for Category B devices.
    */
  var antennaAzimuth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * 3-dB antenna beamwidth of the antenna in the horizontal-plane in degrees. This parameter is an unsigned integer having a value between 0 and 360 (degrees) inclusive; it is optional for Category A devices and conditional for Category B devices.
    */
  var antennaBeamwidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Antenna downtilt in degrees and is an integer with a value between -90 and +90 inclusive; a negative value means the antenna is tilted up (above horizontal). This parameter is optional for Category A devices and conditional for Category B devices.
    */
  var antennaDowntilt: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Peak antenna gain in dBi. This parameter is an integer with a value between -127 and +128 (dBi) inclusive.
    */
  var antennaGain: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If an external antenna is used, the antenna model is optionally provided in this field. The string has a maximum length of 128 octets.
    */
  var antennaModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If present, this parameter specifies whether the CBSD is a CPE-CBSD or not.
    */
  var cpeCbsdIndication: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This parameter is the maximum device EIRP in units of dBm/10MHz and is an integer with a value between -127 and +47 (dBm/10 MHz) inclusive. If not included, SAS interprets it as maximum allowable EIRP in units of dBm/10MHz for device category.
    */
  var eirpCapability: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Device antenna height in meters. When the `heightType` parameter value is "AGL", the antenna height should be given relative to ground level. When the `heightType` parameter value is "AMSL", it is given with respect to WGS84 datum.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies how the height is measured.
    */
  var heightType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna horizontal location. This optional parameter should only be present if its value is less than the FCC requirement of 50 meters.
    */
  var horizontalAccuracy: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether the device antenna is indoor or not. `true`: indoor. `false`: outdoor.
    */
  var indoorDeployment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Latitude of the device antenna location in degrees relative to the WGS 84 datum. The allowed range is from -90.000000 to +90.000000. Positive values represent latitudes north of the equator; negative values south of the equator.
    */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Longitude of the device antenna location in degrees relative to the WGS 84 datum. The allowed range is from -180.000000 to +180.000000. Positive values represent longitudes east of the prime meridian; negative values west of the prime meridian.
    */
  var longitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna vertical location. This optional parameter should only be present if its value is less than the FCC requirement of 3 meters.
    */
  var verticalAccuracy: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSasPortalInstallationParams {
  
  inline def apply(): SchemaSasPortalInstallationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalInstallationParams]
  }
  
  extension [Self <: SchemaSasPortalInstallationParams](x: Self) {
    
    inline def setAntennaAzimuth(value: Double): Self = StObject.set(x, "antennaAzimuth", value.asInstanceOf[js.Any])
    
    inline def setAntennaAzimuthNull: Self = StObject.set(x, "antennaAzimuth", null)
    
    inline def setAntennaAzimuthUndefined: Self = StObject.set(x, "antennaAzimuth", js.undefined)
    
    inline def setAntennaBeamwidth(value: Double): Self = StObject.set(x, "antennaBeamwidth", value.asInstanceOf[js.Any])
    
    inline def setAntennaBeamwidthNull: Self = StObject.set(x, "antennaBeamwidth", null)
    
    inline def setAntennaBeamwidthUndefined: Self = StObject.set(x, "antennaBeamwidth", js.undefined)
    
    inline def setAntennaDowntilt(value: Double): Self = StObject.set(x, "antennaDowntilt", value.asInstanceOf[js.Any])
    
    inline def setAntennaDowntiltNull: Self = StObject.set(x, "antennaDowntilt", null)
    
    inline def setAntennaDowntiltUndefined: Self = StObject.set(x, "antennaDowntilt", js.undefined)
    
    inline def setAntennaGain(value: Double): Self = StObject.set(x, "antennaGain", value.asInstanceOf[js.Any])
    
    inline def setAntennaGainNull: Self = StObject.set(x, "antennaGain", null)
    
    inline def setAntennaGainUndefined: Self = StObject.set(x, "antennaGain", js.undefined)
    
    inline def setAntennaModel(value: String): Self = StObject.set(x, "antennaModel", value.asInstanceOf[js.Any])
    
    inline def setAntennaModelNull: Self = StObject.set(x, "antennaModel", null)
    
    inline def setAntennaModelUndefined: Self = StObject.set(x, "antennaModel", js.undefined)
    
    inline def setCpeCbsdIndication(value: Boolean): Self = StObject.set(x, "cpeCbsdIndication", value.asInstanceOf[js.Any])
    
    inline def setCpeCbsdIndicationNull: Self = StObject.set(x, "cpeCbsdIndication", null)
    
    inline def setCpeCbsdIndicationUndefined: Self = StObject.set(x, "cpeCbsdIndication", js.undefined)
    
    inline def setEirpCapability(value: Double): Self = StObject.set(x, "eirpCapability", value.asInstanceOf[js.Any])
    
    inline def setEirpCapabilityNull: Self = StObject.set(x, "eirpCapability", null)
    
    inline def setEirpCapabilityUndefined: Self = StObject.set(x, "eirpCapability", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightType(value: String): Self = StObject.set(x, "heightType", value.asInstanceOf[js.Any])
    
    inline def setHeightTypeNull: Self = StObject.set(x, "heightType", null)
    
    inline def setHeightTypeUndefined: Self = StObject.set(x, "heightType", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAccuracyNull: Self = StObject.set(x, "horizontalAccuracy", null)
    
    inline def setHorizontalAccuracyUndefined: Self = StObject.set(x, "horizontalAccuracy", js.undefined)
    
    inline def setIndoorDeployment(value: Boolean): Self = StObject.set(x, "indoorDeployment", value.asInstanceOf[js.Any])
    
    inline def setIndoorDeploymentNull: Self = StObject.set(x, "indoorDeployment", null)
    
    inline def setIndoorDeploymentUndefined: Self = StObject.set(x, "indoorDeployment", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setVerticalAccuracyNull: Self = StObject.set(x, "verticalAccuracy", null)
    
    inline def setVerticalAccuracyUndefined: Self = StObject.set(x, "verticalAccuracy", js.undefined)
  }
}
