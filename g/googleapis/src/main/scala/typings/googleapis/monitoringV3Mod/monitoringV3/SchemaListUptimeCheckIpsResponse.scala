package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol for the ListUptimeCheckIps response.
  */
@js.native
trait SchemaListUptimeCheckIpsResponse extends StObject {
  
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field). NOTE: this field is not yet
    * implemented
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The returned list of IP addresses (including region and location) that
    * the checkers run from.
    */
  var uptimeCheckIps: js.UndefOr[js.Array[SchemaUptimeCheckIp]] = js.native
}
object SchemaListUptimeCheckIpsResponse {
  
  @scala.inline
  def apply(): SchemaListUptimeCheckIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUptimeCheckIpsResponse]
  }
  
  @scala.inline
  implicit class SchemaListUptimeCheckIpsResponseMutableBuilder[Self <: SchemaListUptimeCheckIpsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUptimeCheckIps(value: js.Array[SchemaUptimeCheckIp]): Self = StObject.set(x, "uptimeCheckIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptimeCheckIpsUndefined: Self = StObject.set(x, "uptimeCheckIps", js.undefined)
    
    @scala.inline
    def setUptimeCheckIpsVarargs(value: SchemaUptimeCheckIp*): Self = StObject.set(x, "uptimeCheckIps", js.Array(value :_*))
  }
}
