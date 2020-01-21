package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output generated from semantically comparing two versions of a service
  * configuration.  Includes detailed information about a field that have
  * changed with applicable advice about potential consequences for the change,
  * such as backwards-incompatibility.
  */
@js.native
trait SchemaConfigChange extends js.Object {
  /**
    * Collection of advice provided for this change, useful for determining the
    * possible impact of this change.
    */
  var advices: js.UndefOr[js.Array[SchemaAdvice]] = js.native
  /**
    * The type for this change, either ADDED, REMOVED, or MODIFIED.
    */
  var changeType: js.UndefOr[String] = js.native
  /**
    * Object hierarchy path to the change, with levels separated by a
    * &#39;.&#39; character. For repeated fields, an applicable unique
    * identifier field is used for the index (usually selector, name, or id).
    * For maps, the term &#39;key&#39; is used. If the field has no unique
    * identifier, the numeric index is used. ## Examples:
    * visibility.rules[selector==&quot;google.LibraryService.CreateBook&quot;].restriction
    * -
    * quota.metric_rules[selector==&quot;google&quot;].metric_costs[key==&quot;reads&quot;].value
    * - logging.producer_destinations[0]
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Value of the changed object in the new Service configuration, in JSON
    * format. This field will not be populated if ChangeType == REMOVED.
    */
  var newValue: js.UndefOr[String] = js.native
  /**
    * Value of the changed object in the old Service configuration, in JSON
    * format. This field will not be populated if ChangeType == ADDED.
    */
  var oldValue: js.UndefOr[String] = js.native
}

object SchemaConfigChange {
  @scala.inline
  def apply(
    advices: js.Array[SchemaAdvice] = null,
    changeType: String = null,
    element: String = null,
    newValue: String = null,
    oldValue: String = null
  ): SchemaConfigChange = {
    val __obj = js.Dynamic.literal()
    if (advices != null) __obj.updateDynamic("advices")(advices.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfigChange]
  }
}

