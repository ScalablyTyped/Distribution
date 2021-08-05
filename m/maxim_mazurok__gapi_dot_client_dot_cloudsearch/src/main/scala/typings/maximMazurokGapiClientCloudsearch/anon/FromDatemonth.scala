package typings.maximMazurokGapiClientCloudsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromDatemonth extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Day of month. Must be from 1 to 31 and valid for the year and month. */
  @JSName("fromDate.day")
  var fromDateDotday: js.UndefOr[Double] = js.undefined
  
  /** Month of date. Must be from 1 to 12. */
  @JSName("fromDate.month")
  var fromDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /** Year of date. Must be from 1 to 9999. */
  @JSName("fromDate.year")
  var fromDateDotyear: js.UndefOr[Double] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Day of month. Must be from 1 to 31 and valid for the year and month. */
  @JSName("toDate.day")
  var toDateDotday: js.UndefOr[Double] = js.undefined
  
  /** Month of date. Must be from 1 to 12. */
  @JSName("toDate.month")
  var toDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /** Year of date. Must be from 1 to 9999. */
  @JSName("toDate.year")
  var toDateDotyear: js.UndefOr[Double] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object FromDatemonth {
  
  inline def apply(): FromDatemonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromDatemonth]
  }
  
  extension [Self <: FromDatemonth](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromDateDotday(value: Double): Self = StObject.set(x, "fromDate.day", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotdayUndefined: Self = StObject.set(x, "fromDate.day", js.undefined)
    
    inline def setFromDateDotmonth(value: Double): Self = StObject.set(x, "fromDate.month", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotmonthUndefined: Self = StObject.set(x, "fromDate.month", js.undefined)
    
    inline def setFromDateDotyear(value: Double): Self = StObject.set(x, "fromDate.year", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotyearUndefined: Self = StObject.set(x, "fromDate.year", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setToDateDotday(value: Double): Self = StObject.set(x, "toDate.day", value.asInstanceOf[js.Any])
    
    inline def setToDateDotdayUndefined: Self = StObject.set(x, "toDate.day", js.undefined)
    
    inline def setToDateDotmonth(value: Double): Self = StObject.set(x, "toDate.month", value.asInstanceOf[js.Any])
    
    inline def setToDateDotmonthUndefined: Self = StObject.set(x, "toDate.month", js.undefined)
    
    inline def setToDateDotyear(value: Double): Self = StObject.set(x, "toDate.year", value.asInstanceOf[js.Any])
    
    inline def setToDateDotyearUndefined: Self = StObject.set(x, "toDate.year", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
