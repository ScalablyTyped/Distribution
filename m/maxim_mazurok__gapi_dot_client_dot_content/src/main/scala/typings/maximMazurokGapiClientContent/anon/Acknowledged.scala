package typings.maximMazurokGapiClientContent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acknowledged extends StObject {
  
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
  implicit class AcknowledgedMutableBuilder[Self <: Acknowledged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCreatedEndDate(value: String): Self = StObject.set(x, "createdEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedEndDateUndefined: Self = StObject.set(x, "createdEndDate", js.undefined)
    
    @scala.inline
    def setCreatedStartDate(value: String): Self = StObject.set(x, "createdStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedStartDateUndefined: Self = StObject.set(x, "createdStartDate", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGoogleOrderIds(value: String | js.Array[String]): Self = StObject.set(x, "googleOrderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleOrderIdsUndefined: Self = StObject.set(x, "googleOrderIds", js.undefined)
    
    @scala.inline
    def setGoogleOrderIdsVarargs(value: String*): Self = StObject.set(x, "googleOrderIds", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setShipmentStates(value: String | js.Array[String]): Self = StObject.set(x, "shipmentStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentStatesUndefined: Self = StObject.set(x, "shipmentStates", js.undefined)
    
    @scala.inline
    def setShipmentStatesVarargs(value: String*): Self = StObject.set(x, "shipmentStates", js.Array(value :_*))
    
    @scala.inline
    def setShipmentStatus(value: String | js.Array[String]): Self = StObject.set(x, "shipmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentStatusUndefined: Self = StObject.set(x, "shipmentStatus", js.undefined)
    
    @scala.inline
    def setShipmentStatusVarargs(value: String*): Self = StObject.set(x, "shipmentStatus", js.Array(value :_*))
    
    @scala.inline
    def setShipmentTrackingNumbers(value: String | js.Array[String]): Self = StObject.set(x, "shipmentTrackingNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentTrackingNumbersUndefined: Self = StObject.set(x, "shipmentTrackingNumbers", js.undefined)
    
    @scala.inline
    def setShipmentTrackingNumbersVarargs(value: String*): Self = StObject.set(x, "shipmentTrackingNumbers", js.Array(value :_*))
    
    @scala.inline
    def setShipmentTypes(value: String | js.Array[String]): Self = StObject.set(x, "shipmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentTypesUndefined: Self = StObject.set(x, "shipmentTypes", js.undefined)
    
    @scala.inline
    def setShipmentTypesVarargs(value: String*): Self = StObject.set(x, "shipmentTypes", js.Array(value :_*))
    
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
