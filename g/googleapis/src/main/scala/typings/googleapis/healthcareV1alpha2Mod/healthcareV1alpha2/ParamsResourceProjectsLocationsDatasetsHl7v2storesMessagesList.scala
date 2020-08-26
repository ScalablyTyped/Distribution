package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesListOps[Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

