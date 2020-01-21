package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents all the details pertaining to an event.
  */
@js.native
trait SchemaEventData extends js.Object {
  /**
    * Type of interaction with the object. Eg: &#39;play&#39;.
    */
  var eventAction: js.UndefOr[String] = js.native
  /**
    * The object on the page that was interacted with. Eg: &#39;Video&#39;.
    */
  var eventCategory: js.UndefOr[String] = js.native
  /**
    * Number of such events in this activity.
    */
  var eventCount: js.UndefOr[String] = js.native
  /**
    * Label attached with the event.
    */
  var eventLabel: js.UndefOr[String] = js.native
  /**
    * Numeric value associated with the event.
    */
  var eventValue: js.UndefOr[String] = js.native
}

object SchemaEventData {
  @scala.inline
  def apply(
    eventAction: String = null,
    eventCategory: String = null,
    eventCount: String = null,
    eventLabel: String = null,
    eventValue: String = null
  ): SchemaEventData = {
    val __obj = js.Dynamic.literal()
    if (eventAction != null) __obj.updateDynamic("eventAction")(eventAction.asInstanceOf[js.Any])
    if (eventCategory != null) __obj.updateDynamic("eventCategory")(eventCategory.asInstanceOf[js.Any])
    if (eventCount != null) __obj.updateDynamic("eventCount")(eventCount.asInstanceOf[js.Any])
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel.asInstanceOf[js.Any])
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventData]
  }
}

