package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  /**
    * If a device is blocked, connections or requests from this device will fail. Can be used to temporarily prevent the device from connecting if, for example, the sensor is generating
    * bad data and needs maintenance.
    */
  var blocked: js.UndefOr[Boolean] = js.native
  
  /**
    * The most recent device configuration, which is eventually sent from Cloud IoT Core to the device. If not present on creation, the configuration will be initialized with an empty
    * payload and version value of `1`. To update this field after creation, use the `DeviceManager.ModifyCloudToDeviceConfig` method.
    */
  var config: js.UndefOr[DeviceConfig] = js.native
  
  /**
    * The credentials used to authenticate this device. To allow credential rotation without interruption, multiple device credentials can be bound to this device. No more than 3
    * credentials can be bound to a single device at a time. When new credentials are added to a device, they are verified against the registry credentials. For details, see the
    * description of the `DeviceRegistry.credentials` field.
    */
  var credentials: js.UndefOr[js.Array[DeviceCredential]] = js.native
  
  /** Gateway-related configuration and state. */
  var gatewayConfig: js.UndefOr[GatewayConfig] = js.native
  
  /** The user-defined device identifier. The device ID must be unique within a device registry. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output only] The last time a cloud-to-device config version acknowledgment was received from the device. This field is only for configurations sent through MQTT. */
  var lastConfigAckTime: js.UndefOr[String] = js.native
  
  /** [Output only] The last time a cloud-to-device config version was sent to the device. */
  var lastConfigSendTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The error message of the most recent error, such as a failure to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have
    * occurred, this field has an empty message and the status code 0 == OK. Otherwise, this field is expected to have a status code other than OK.
    */
  var lastErrorStatus: js.UndefOr[Status] = js.native
  
  /** [Output only] The time the most recent error occurred, such as a failure to publish to Cloud Pub/Sub. This field is the timestamp of 'last_error_status'. */
  var lastErrorTime: js.UndefOr[String] = js.native
  
  /** [Output only] The last time a telemetry event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes. */
  var lastEventTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the
    * connection is idle, and no other messages have been sent. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
    */
  var lastHeartbeatTime: js.UndefOr[String] = js.native
  
  /** [Output only] The last time a state event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes. */
  var lastStateTime: js.UndefOr[String] = js.native
  
  /** **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used. */
  var logLevel: js.UndefOr[String] = js.native
  
  /**
    * The metadata key-value pairs assigned to the device. This metadata is not interpreted or indexed by Cloud IoT Core. It can be used to add contextual information for the device. Keys
    * must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length. Values are free-form strings. Each value must be less than or equal to 32 KB in size. The total
    * size of all keys and values must be less than 256 KB, and the maximum number of key-value pairs is 500.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.Device with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
    * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output only] A server-defined unique numeric ID for the device. This is a more compact way to identify devices, and it is globally unique. */
  var numId: js.UndefOr[String] = js.native
  
  /** [Output only] The state most recently received from the device. If no state has been reported, this field is not present. */
  var state: js.UndefOr[DeviceState] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    @scala.inline
    def setConfig(value: DeviceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCredentials(value: js.Array[DeviceCredential]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCredentialsVarargs(value: DeviceCredential*): Self = StObject.set(x, "credentials", js.Array(value :_*))
    
    @scala.inline
    def setGatewayConfig(value: GatewayConfig): Self = StObject.set(x, "gatewayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayConfigUndefined: Self = StObject.set(x, "gatewayConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastConfigAckTime(value: String): Self = StObject.set(x, "lastConfigAckTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastConfigAckTimeUndefined: Self = StObject.set(x, "lastConfigAckTime", js.undefined)
    
    @scala.inline
    def setLastConfigSendTime(value: String): Self = StObject.set(x, "lastConfigSendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastConfigSendTimeUndefined: Self = StObject.set(x, "lastConfigSendTime", js.undefined)
    
    @scala.inline
    def setLastErrorStatus(value: Status): Self = StObject.set(x, "lastErrorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorStatusUndefined: Self = StObject.set(x, "lastErrorStatus", js.undefined)
    
    @scala.inline
    def setLastErrorTime(value: String): Self = StObject.set(x, "lastErrorTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorTimeUndefined: Self = StObject.set(x, "lastErrorTime", js.undefined)
    
    @scala.inline
    def setLastEventTime(value: String): Self = StObject.set(x, "lastEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventTimeUndefined: Self = StObject.set(x, "lastEventTime", js.undefined)
    
    @scala.inline
    def setLastHeartbeatTime(value: String): Self = StObject.set(x, "lastHeartbeatTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHeartbeatTimeUndefined: Self = StObject.set(x, "lastHeartbeatTime", js.undefined)
    
    @scala.inline
    def setLastStateTime(value: String): Self = StObject.set(x, "lastStateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateTimeUndefined: Self = StObject.set(x, "lastStateTime", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.Device with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumId(value: String): Self = StObject.set(x, "numId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumIdUndefined: Self = StObject.set(x, "numId", js.undefined)
    
    @scala.inline
    def setState(value: DeviceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
