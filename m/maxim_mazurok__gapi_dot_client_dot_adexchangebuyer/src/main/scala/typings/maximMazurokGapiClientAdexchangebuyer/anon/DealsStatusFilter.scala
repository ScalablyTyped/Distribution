package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealsStatusFilter extends StObject {
  
  /** When specified, only creatives for the given account ids are returned. */
  var accountId: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** When specified, only creatives for the given buyer creative ids are returned. */
  var buyerCreativeId: js.UndefOr[String | js.Array[String]] = js.native
  
  /** When specified, only creatives having the given deals status are returned. */
  var dealsStatusFilter: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Maximum number of entries returned on one result page. If not set, the default is 100. Optional. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** When specified, only creatives having the given open auction status are returned. */
  var openAuctionStatusFilter: js.UndefOr[String] = js.native
  
  /** A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object DealsStatusFilter {
  
  @scala.inline
  def apply(): DealsStatusFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealsStatusFilter]
  }
  
  @scala.inline
  implicit class DealsStatusFilterMutableBuilder[Self <: DealsStatusFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Double | js.Array[Double]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountIdVarargs(value: Double*): Self = StObject.set(x, "accountId", js.Array(value :_*))
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setBuyerCreativeId(value: String | js.Array[String]): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    @scala.inline
    def setBuyerCreativeIdVarargs(value: String*): Self = StObject.set(x, "buyerCreativeId", js.Array(value :_*))
    
    @scala.inline
    def setDealsStatusFilter(value: String): Self = StObject.set(x, "dealsStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsStatusFilterUndefined: Self = StObject.set(x, "dealsStatusFilter", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOpenAuctionStatusFilter(value: String): Self = StObject.set(x, "openAuctionStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAuctionStatusFilterUndefined: Self = StObject.set(x, "openAuctionStatusFilter", js.undefined)
    
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
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
