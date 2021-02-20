package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Restricts messages returned to those matching a filter. Syntax:
    * https://cloud.google.com/appengine/docs/standard/python/search/query_strings
    * Fields/functions available for filtering are:  *  `message_type`, from
    * the MSH-9 segment; for example `NOT message_type = "ADT"` *  `send_date`
    * or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's
    * time_zone, from the MSH-7 segment; for example `send_date < "2017-01-02"`
    * *  `send_time`, the timestamp of when the message was sent, using the
    * RFC3339 time format for comparisons, from the MSH-7 segment; for example
    * `send_time < "2017-01-02T00:00:00-05:00"` *  `send_facility`, the care
    * center that the message came from, from the MSH-4 segment; for example
    * `send_facility = "ABC"` *  `HL7RegExp(expr)`, which does regular
    * expression matching of `expr` against the message payload using re2
    * (http://code.google.com/p/re2/) syntax; for example
    * `HL7RegExp("^.*\|.*\|EMERG")` *  `PatientId(value, type)`, which matches
    * if the message lists a patient having an ID of the given value and type
    * in the PID-2, PID-3, or PID-4 segments; for example `PatientId("123456",
    * "MRN")` *  `labels.x`, a string value of the label with key `x` as set
    * using the Message.labels map, for example `labels."priority"="high"`. The
    * operator `:*` can be used to assert the existence of a label, for example
    * `labels."priority":*`.  Limitations on conjunctions:  *  Negation on the
    * patient ID function or the labels field is not supported, for example
    * these queries are invalid: `NOT PatientId("123456", "MRN")`, `NOT
    * labels."tag1":*`, `NOT labels."tag2"="val2"`. *  Conjunction of multiple
    * patient ID functions is not supported, for example this query is invalid:
    * `PatientId("123456", "MRN") AND PatientId("456789", "MRN")`. *
    * Conjunction of multiple labels fields is also not supported, for example
    * this query is invalid: `labels."tag1":* AND labels."tag2"="val2"`. *
    * Conjunction of one patient ID function, one labels field and conditions
    * on other fields is supported, for example this query is valid:
    * `PatientId("123456", "MRN") AND labels."tag1":* AND message_type =
    * "ADT"`.  The HasLabel(x) and Label(x) syntax from previous API versions
    * are deprecated; replaced by the `labels.x` syntax.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Orders messages returned by the specified order_by clause. Syntax:
    * https://cloud.google.com/apis/design/design_patterns#sorting_order Fields
    * available for ordering are:  *  `send_time`
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Limit on the number of messages to return in a single response. If zero
    * the default page size of 100 is used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from the previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Name of the HL7v2 store to retrieve messages from.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesListMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
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
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
