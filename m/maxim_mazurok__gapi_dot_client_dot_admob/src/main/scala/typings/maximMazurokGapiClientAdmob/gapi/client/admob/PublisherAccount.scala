package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherAccount extends js.Object {
  
  /** Currency code of the earning-related metrics, which is the 3-letter code defined in ISO 4217. The daily average rate is used for the currency conversion. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Resource name of this account. Format is accounts/{publisher_id}. */
  var name: js.UndefOr[String] = js.native
  
  /** The unique ID by which this publisher account can be identified in the API requests (for example, pub-1234567890). */
  var publisherId: js.UndefOr[String] = js.native
  
  /** The time zone that is used in reports that are generated for this account. The value is a time-zone ID as specified by the CLDR project, for example, "America/Los_Angeles". */
  var reportingTimeZone: js.UndefOr[String] = js.native
}
object PublisherAccount {
  
  @scala.inline
  def apply(): PublisherAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherAccount]
  }
  
  @scala.inline
  implicit class PublisherAccountOps[Self <: PublisherAccount] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherId: Self = this.set("publisherId", js.undefined)
    
    @scala.inline
    def setReportingTimeZone(value: String): Self = this.set("reportingTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingTimeZone: Self = this.set("reportingTimeZone", js.undefined)
  }
}
