package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse extends StObject {
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var androidAppDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAndroidAppDataStream]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidAppDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaAndroidAppDataStream]): Self = StObject.set(x, "androidAppDataStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidAppDataStreamsUndefined: Self = StObject.set(x, "androidAppDataStreams", js.undefined)
    
    @scala.inline
    def setAndroidAppDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaAndroidAppDataStream*): Self = StObject.set(x, "androidAppDataStreams", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
