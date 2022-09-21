package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDeviceConfig extends StObject {
  
  /**
    * Information about this device's air interface.
    */
  var airInterface: js.UndefOr[SchemaSasPortalDeviceAirInterface] = js.undefined
  
  /**
    * The call sign of the device operator.
    */
  var callSign: js.UndefOr[String | Null] = js.undefined
  
  /**
    * FCC category of the device.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Installation parameters for the device.
    */
  var installationParams: js.UndefOr[SchemaSasPortalInstallationParams] = js.undefined
  
  /**
    * Output only. Whether the configuration has been signed by a CPI.
    */
  var isSigned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Measurement reporting capabilities of the device.
    */
  var measurementCapabilities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Information about this device model.
    */
  var model: js.UndefOr[SchemaSasPortalDeviceModel] = js.undefined
  
  /**
    * State of the configuration.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last time the device configuration was edited.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier of a device user.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalDeviceConfig {
  
  inline def apply(): SchemaSasPortalDeviceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDeviceConfig]
  }
  
  extension [Self <: SchemaSasPortalDeviceConfig](x: Self) {
    
    inline def setAirInterface(value: SchemaSasPortalDeviceAirInterface): Self = StObject.set(x, "airInterface", value.asInstanceOf[js.Any])
    
    inline def setAirInterfaceUndefined: Self = StObject.set(x, "airInterface", js.undefined)
    
    inline def setCallSign(value: String): Self = StObject.set(x, "callSign", value.asInstanceOf[js.Any])
    
    inline def setCallSignNull: Self = StObject.set(x, "callSign", null)
    
    inline def setCallSignUndefined: Self = StObject.set(x, "callSign", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setInstallationParams(value: SchemaSasPortalInstallationParams): Self = StObject.set(x, "installationParams", value.asInstanceOf[js.Any])
    
    inline def setInstallationParamsUndefined: Self = StObject.set(x, "installationParams", js.undefined)
    
    inline def setIsSigned(value: Boolean): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    inline def setIsSignedNull: Self = StObject.set(x, "isSigned", null)
    
    inline def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    inline def setMeasurementCapabilities(value: js.Array[String]): Self = StObject.set(x, "measurementCapabilities", value.asInstanceOf[js.Any])
    
    inline def setMeasurementCapabilitiesNull: Self = StObject.set(x, "measurementCapabilities", null)
    
    inline def setMeasurementCapabilitiesUndefined: Self = StObject.set(x, "measurementCapabilities", js.undefined)
    
    inline def setMeasurementCapabilitiesVarargs(value: String*): Self = StObject.set(x, "measurementCapabilities", js.Array(value*))
    
    inline def setModel(value: SchemaSasPortalDeviceModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
