package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a set of log entries that are not to be stored in Logging. If
  * your project receives a large volume of logs, you might be able to use
  * exclusions to reduce your chargeable logs. Exclusions are processed after
  * log sinks, so you can export log entries before they are excluded. Audit
  * log entries and log entries from Amazon Web Services are never excluded.
  */
@js.native
trait SchemaLogExclusion extends js.Object {
  /**
    * Output only. The creation timestamp of the exclusion.This field may not
    * be present for older exclusions.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional. A description of this exclusion.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not
    * exclude any log entries. You can update an exclusion to change the value
    * of this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Required. An advanced logs filter that matches the log entries to be
    * excluded. By using the sample function, you can exclude less than 100% of
    * the matching log entries. For example, the following filter matches 99%
    * of low-severity log entries from load
    * balancers:&quot;resource.type=http_load_balancer severity&lt;ERROR
    * sample(insertId, 0.99)&quot;
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Required. A client-assigned identifier, such as
    * &quot;load-balancer-exclusion&quot;. Identifiers are limited to 100
    * characters and can include only letters, digits, underscores, hyphens,
    * and periods.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of the exclusion.This field may
    * not be present for older exclusions.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaLogExclusion {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    name: String = null,
    updateTime: String = null
  ): SchemaLogExclusion = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogExclusion]
  }
}

