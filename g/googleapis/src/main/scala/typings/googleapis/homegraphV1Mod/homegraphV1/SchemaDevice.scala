package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevice extends StObject {
  
  /**
    * Attributes for the traits supported by the device.
    */
  var attributes: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Custom device attributes stored in Home Graph and provided to your smart home Action in each [QUERY](https://developers.google.com/assistant/smarthome/reference/intent/query) and [EXECUTE](https://developers.google.com/assistant/smarthome/reference/intent/execute) intent. Data in this object has a few constraints: No sensitive information, including but not limited to Personally Identifiable Information.
    */
  var customData: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Device manufacturer, model, hardware version, and software version.
    */
  var deviceInfo: js.UndefOr[SchemaDeviceInfo] = js.undefined
  
  /**
    * Third-party device ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Names given to this device by your smart home Action.
    */
  var name: js.UndefOr[SchemaDeviceNames] = js.undefined
  
  /**
    * Indicates whether your smart home Action will report notifications to Google for this device via ReportStateAndNotification. If your smart home Action enables users to control device notifications, you should update this field and call RequestSyncDevices.
    */
  var notificationSupportedByAgent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Alternate IDs associated with this device. This is used to identify cloud synced devices enabled for [local fulfillment](https://developers.google.com/assistant/smarthome/concepts/local).
    */
  var otherDeviceIds: js.UndefOr[js.Array[SchemaAgentOtherDeviceId]] = js.undefined
  
  /**
    * Suggested name for the room where this device is installed. Google attempts to use this value during user setup.
    */
  var roomHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suggested name for the structure where this device is installed. Google attempts to use this value during user setup.
    */
  var structureHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Traits supported by the device. See [device traits](https://developers.google.com/assistant/smarthome/traits).
    */
  var traits: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Hardware type of the device. See [device types](https://developers.google.com/assistant/smarthome/guides).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether your smart home Action will report state of this device to Google via ReportStateAndNotification.
    */
  var willReportState: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDevice {
  
  inline def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  extension [Self <: SchemaDevice](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCustomData(value: StringDictionary[Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataNull: Self = StObject.set(x, "customData", null)
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setDeviceInfo(value: SchemaDeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: SchemaDeviceNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationSupportedByAgent(value: Boolean): Self = StObject.set(x, "notificationSupportedByAgent", value.asInstanceOf[js.Any])
    
    inline def setNotificationSupportedByAgentNull: Self = StObject.set(x, "notificationSupportedByAgent", null)
    
    inline def setNotificationSupportedByAgentUndefined: Self = StObject.set(x, "notificationSupportedByAgent", js.undefined)
    
    inline def setOtherDeviceIds(value: js.Array[SchemaAgentOtherDeviceId]): Self = StObject.set(x, "otherDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setOtherDeviceIdsUndefined: Self = StObject.set(x, "otherDeviceIds", js.undefined)
    
    inline def setOtherDeviceIdsVarargs(value: SchemaAgentOtherDeviceId*): Self = StObject.set(x, "otherDeviceIds", js.Array(value*))
    
    inline def setRoomHint(value: String): Self = StObject.set(x, "roomHint", value.asInstanceOf[js.Any])
    
    inline def setRoomHintNull: Self = StObject.set(x, "roomHint", null)
    
    inline def setRoomHintUndefined: Self = StObject.set(x, "roomHint", js.undefined)
    
    inline def setStructureHint(value: String): Self = StObject.set(x, "structureHint", value.asInstanceOf[js.Any])
    
    inline def setStructureHintNull: Self = StObject.set(x, "structureHint", null)
    
    inline def setStructureHintUndefined: Self = StObject.set(x, "structureHint", js.undefined)
    
    inline def setTraits(value: js.Array[String]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsNull: Self = StObject.set(x, "traits", null)
    
    inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    
    inline def setTraitsVarargs(value: String*): Self = StObject.set(x, "traits", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWillReportState(value: Boolean): Self = StObject.set(x, "willReportState", value.asInstanceOf[js.Any])
    
    inline def setWillReportStateNull: Self = StObject.set(x, "willReportState", null)
    
    inline def setWillReportStateUndefined: Self = StObject.set(x, "willReportState", js.undefined)
  }
}
