package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol for the ListUptimeCheckIps response.
  */
@js.native
trait SchemaListUptimeCheckIpsResponse extends js.Object {
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
  implicit class SchemaListUptimeCheckIpsResponseOps[Self <: SchemaListUptimeCheckIpsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUptimeCheckIpsVarargs(value: SchemaUptimeCheckIp*): Self = this.set("uptimeCheckIps", js.Array(value :_*))
    @scala.inline
    def setUptimeCheckIps(value: js.Array[SchemaUptimeCheckIp]): Self = this.set("uptimeCheckIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUptimeCheckIps: Self = this.set("uptimeCheckIps", js.undefined)
  }
  
}

