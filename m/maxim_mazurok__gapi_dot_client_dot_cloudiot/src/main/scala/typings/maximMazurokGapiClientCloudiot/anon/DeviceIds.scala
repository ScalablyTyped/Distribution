package typings.maximMazurokGapiClientCloudiot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceIds extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** A list of device string IDs. For example, `['device0', 'device12']`. If empty, this field is ignored. Maximum IDs: 10,000 */
  var deviceIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** A list of device numeric IDs. If empty, this field is ignored. Maximum IDs: 10,000. */
  var deviceNumIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** The fields of the `Device` resource to be returned in the response. The fields `id` and `num_id` are always returned, along with any other fields specified. */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * If set, returns only the gateways with which the specified device is associated. The device ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `456`
    * is specified, returns only the gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * If set, only devices associated with the specified gateway are returned. The gateway ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `123` is
    * specified, only devices bound to the gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY` is specified, only non-gateway devices are returned. If `GATEWAY_TYPE_UNSPECIFIED` is specified, all
    * devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of devices to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A
    * non-empty `next_page_token` in the response indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** The value returned by the last `ListDevicesResponse`; indicates that this is a continuation of a prior `ListDevices` call and the system should return the next page of data. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Required. The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`. */
  var parent: String
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object DeviceIds {
  
  @scala.inline
  def apply(parent: String): DeviceIds = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceIds]
  }
  
  @scala.inline
  implicit class DeviceIdsMutableBuilder[Self <: DeviceIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDeviceIds(value: String | js.Array[String]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    @scala.inline
    def setDeviceIdsVarargs(value: String*): Self = StObject.set(x, "deviceIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceNumIds(value: String | js.Array[String]): Self = StObject.set(x, "deviceNumIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNumIdsUndefined: Self = StObject.set(x, "deviceNumIds", js.undefined)
    
    @scala.inline
    def setDeviceNumIdsVarargs(value: String*): Self = StObject.set(x, "deviceNumIds", js.Array(value :_*))
    
    @scala.inline
    def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsDeviceId(value: String): Self = StObject.set(x, "gatewayListOptions.associationsDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayListOptionsDotassociationsDeviceIdUndefined: Self = StObject.set(x, "gatewayListOptions.associationsDeviceId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsGatewayId(value: String): Self = StObject.set(x, "gatewayListOptions.associationsGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayListOptionsDotassociationsGatewayIdUndefined: Self = StObject.set(x, "gatewayListOptions.associationsGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotgatewayType(value: String): Self = StObject.set(x, "gatewayListOptions.gatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayListOptionsDotgatewayTypeUndefined: Self = StObject.set(x, "gatewayListOptions.gatewayType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
