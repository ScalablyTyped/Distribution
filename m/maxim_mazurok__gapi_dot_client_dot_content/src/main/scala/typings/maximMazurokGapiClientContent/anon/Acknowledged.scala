package typings.maximMazurokGapiClientContent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acknowledged extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * Obtains order returns that match the acknowledgement status. When set to true, obtains order returns that have been acknowledged. When false, obtains order returns that have not
    * been acknowledged. When not provided, obtains order returns regardless of their acknowledgement status. We recommend using this filter set to `false`, in conjunction with the
    * `acknowledge` call, such that only un-acknowledged order returns are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Obtains order returns created before this date (inclusively), in ISO 8601 format. */
  var createdEndDate: js.UndefOr[String] = js.native
  
  /** Obtains order returns created after this date (inclusively), in ISO 8601 format. */
  var createdStartDate: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * Obtains order returns with the specified order ids. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged
    * parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the
    * specified order id or the specified tracking number.
    */
  var googleOrderIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** The maximum number of order returns to return in the response, used for paging. The default value is 25 returns per page, and the maximum allowed value is 250 returns per page. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** The ID of the account that manages the order. This cannot be a multi-client account. */
  var merchantId: String = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Return the results in the specified order. */
  var orderBy: js.UndefOr[String] = js.native
  
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Obtains order returns that match any shipment state provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment
    * states.
    */
  var shipmentStates: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Obtains order returns that match any shipment status provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment
    * statuses.
    */
  var shipmentStatus: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Obtains order returns with the specified tracking numbers. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and
    * acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that
    * either match the specified order id or the specified tracking number.
    */
  var shipmentTrackingNumbers: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Obtains order returns that match any shipment type provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment
    * types.
    */
  var shipmentTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Acknowledged {
  
  @scala.inline
  def apply(merchantId: String): Acknowledged = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acknowledged]
  }
  
  @scala.inline
  implicit class AcknowledgedOps[Self <: Acknowledged] (val x: Self) extends AnyVal {
    
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAcknowledged(value: Boolean): Self = this.set("acknowledged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledged: Self = this.set("acknowledged", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCreatedEndDate(value: String): Self = this.set("createdEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedEndDate: Self = this.set("createdEndDate", js.undefined)
    
    @scala.inline
    def setCreatedStartDate(value: String): Self = this.set("createdStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedStartDate: Self = this.set("createdStartDate", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGoogleOrderIdsVarargs(value: String*): Self = this.set("googleOrderIds", js.Array(value :_*))
    
    @scala.inline
    def setGoogleOrderIds(value: String | js.Array[String]): Self = this.set("googleOrderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleOrderIds: Self = this.set("googleOrderIds", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
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
    def setShipmentStatesVarargs(value: String*): Self = this.set("shipmentStates", js.Array(value :_*))
    
    @scala.inline
    def setShipmentStates(value: String | js.Array[String]): Self = this.set("shipmentStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentStates: Self = this.set("shipmentStates", js.undefined)
    
    @scala.inline
    def setShipmentStatusVarargs(value: String*): Self = this.set("shipmentStatus", js.Array(value :_*))
    
    @scala.inline
    def setShipmentStatus(value: String | js.Array[String]): Self = this.set("shipmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentStatus: Self = this.set("shipmentStatus", js.undefined)
    
    @scala.inline
    def setShipmentTrackingNumbersVarargs(value: String*): Self = this.set("shipmentTrackingNumbers", js.Array(value :_*))
    
    @scala.inline
    def setShipmentTrackingNumbers(value: String | js.Array[String]): Self = this.set("shipmentTrackingNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentTrackingNumbers: Self = this.set("shipmentTrackingNumbers", js.undefined)
    
    @scala.inline
    def setShipmentTypesVarargs(value: String*): Self = this.set("shipmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setShipmentTypes(value: String | js.Array[String]): Self = this.set("shipmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentTypes: Self = this.set("shipmentTypes", js.undefined)
    
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
