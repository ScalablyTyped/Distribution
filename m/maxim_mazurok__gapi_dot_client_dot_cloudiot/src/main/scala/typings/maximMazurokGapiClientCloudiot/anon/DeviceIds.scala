package typings.maximMazurokGapiClientCloudiot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIds extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** A list of device string IDs. For example, `['device0', 'device12']`. If empty, this field is ignored. Maximum IDs: 10,000 */
  var deviceIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** A list of device numeric IDs. If empty, this field is ignored. Maximum IDs: 10,000. */
  var deviceNumIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** The fields of the `Device` resource to be returned in the response. The fields `id` and `num_id` are always returned, along with any other fields specified. */
  var fieldMask: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * If set, returns only the gateways with which the specified device is associated. The device ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `456`
    * is specified, returns only the gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.native
  
  /**
    * If set, only devices associated with the specified gateway are returned. The gateway ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `123` is
    * specified, only devices bound to the gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.native
  
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY` is specified, only non-gateway devices are returned. If `GATEWAY_TYPE_UNSPECIFIED` is specified, all
    * devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of devices to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A
    * non-empty `next_page_token` in the response indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The value returned by the last `ListDevicesResponse`; indicates that this is a continuation of a prior `ListDevices` call and the system should return the next page of data. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Required. The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`. */
  var parent: String = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object DeviceIds {
  
  @scala.inline
  def apply(parent: String): DeviceIds = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceIds]
  }
  
  @scala.inline
  implicit class DeviceIdsOps[Self <: DeviceIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDeviceIdsVarargs(value: String*): Self = this.set("deviceIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceIds(value: String | js.Array[String]): Self = this.set("deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIds: Self = this.set("deviceIds", js.undefined)
    
    @scala.inline
    def setDeviceNumIdsVarargs(value: String*): Self = this.set("deviceNumIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceNumIds(value: String | js.Array[String]): Self = this.set("deviceNumIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceNumIds: Self = this.set("deviceNumIds", js.undefined)
    
    @scala.inline
    def setFieldMask(value: String): Self = this.set("fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMask: Self = this.set("fieldMask", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsDeviceId(value: String): Self = this.set("gatewayListOptions.associationsDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotassociationsDeviceId: Self = this.set("gatewayListOptions.associationsDeviceId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsGatewayId(value: String): Self = this.set("gatewayListOptions.associationsGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotassociationsGatewayId: Self = this.set("gatewayListOptions.associationsGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotgatewayType(value: String): Self = this.set("gatewayListOptions.gatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotgatewayType: Self = this.set("gatewayListOptions.gatewayType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
