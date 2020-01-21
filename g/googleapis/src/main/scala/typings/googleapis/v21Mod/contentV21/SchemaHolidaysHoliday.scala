package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHolidaysHoliday extends js.Object {
  /**
    * The CLDR territory code of the country in which the holiday is available.
    * E.g. &quot;US&quot;, &quot;DE&quot;, &quot;GB&quot;. A holiday cutoff can
    * only be configured in a shipping settings service with matching delivery
    * country. Always present.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Date of the holiday, in ISO 8601 format. E.g. &quot;2016-12-25&quot; for
    * Christmas 2016. Always present.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Date on which the order has to arrive at the customer&#39;s, in ISO 8601
    * format. E.g. &quot;2016-12-24&quot; for 24th December 2016. Always
    * present.
    */
  var deliveryGuaranteeDate: js.UndefOr[String] = js.native
  /**
    * Hour of the day in the delivery location&#39;s timezone on the guaranteed
    * delivery date by which the order has to arrive at the customer&#39;s.
    * Possible values are: 0 (midnight), 1, ..., 12 (noon), 13, ..., 23. Always
    * present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the holiday to be used when configuring holiday
    * cutoffs. Always present.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The holiday type. Always present.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaHolidaysHoliday {
  @scala.inline
  def apply(
    countryCode: String = null,
    date: String = null,
    deliveryGuaranteeDate: String = null,
    deliveryGuaranteeHour: String = null,
    id: String = null,
    `type`: String = null
  ): SchemaHolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (deliveryGuaranteeDate != null) __obj.updateDynamic("deliveryGuaranteeDate")(deliveryGuaranteeDate.asInstanceOf[js.Any])
    if (deliveryGuaranteeHour != null) __obj.updateDynamic("deliveryGuaranteeHour")(deliveryGuaranteeHour.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHolidaysHoliday]
  }
}

