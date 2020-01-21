package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `QuotaLimit` defines a specific limit that applies over a specified
  * duration for a limit type. There can be at most one limit for a duration
  * and limit type combination defined within a `QuotaGroup`.
  */
@js.native
trait SchemaQuotaLimit extends js.Object {
  /**
    * Default number of tokens that can be consumed during the specified
    * duration. This is the number of tokens assigned when a client application
    * developer activates the service for his/her project.  Specifying a value
    * of 0 will block all requests. This can be used if you are provisioning
    * quota to selected consumers and blocking others. Similarly, a value of -1
    * will indicate an unlimited quota. No other negative values are allowed.
    * Used by group-based quotas only.
    */
  var defaultLimit: js.UndefOr[String] = js.native
  /**
    * Optional. User-visible, extended description for this quota limit. Should
    * be used only when more context is needed to understand this limit than
    * provided by the limit&#39;s display name (see: `display_name`).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * User-visible display name for this limit. Optional. If not set, the UI
    * will provide a default display name based on the quota configuration.
    * This field can be used to override the default display name generated
    * from the configuration.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Duration of this limit in textual notation. Example: &quot;100s&quot;,
    * &quot;24h&quot;, &quot;1d&quot;. For duration longer than a day, only
    * multiple of days is supported. We support only &quot;100s&quot; and
    * &quot;1d&quot; for now. Additional support will be added in the future.
    * &quot;0&quot; indicates indefinite duration.  Used by group-based quotas
    * only.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Free tier value displayed in the Developers Console for this limit. The
    * free tier is the number of tokens that will be subtracted from the billed
    * amount when billing is enabled. This field can only be set on a limit
    * with duration &quot;1d&quot;, in a billable group; it is invalid on any
    * other limit. If this field is not set, it defaults to 0, indicating that
    * there is no free tier for this service.  Used by group-based quotas only.
    */
  var freeTier: js.UndefOr[String] = js.native
  /**
    * Maximum number of tokens that can be consumed during the specified
    * duration. Client application developers can override the default limit up
    * to this maximum. If specified, this value cannot be set to a value less
    * than the default limit. If not specified, it is set to the default limit.
    * To allow clients to apply overrides with no upper bound, set this to -1,
    * indicating unlimited maximum quota.  Used by group-based quotas only.
    */
  var maxLimit: js.UndefOr[String] = js.native
  /**
    * The name of the metric this quota limit applies to. The quota limits with
    * the same metric will be checked together during runtime. The metric must
    * be defined within the service config.
    */
  var metric: js.UndefOr[String] = js.native
  /**
    * Name of the quota limit.  The name must be provided, and it must be
    * unique within the service. The name can only include alphanumeric
    * characters as well as &#39;-&#39;.  The maximum length of the limit name
    * is 64 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specify the unit of the quota limit. It uses the same syntax as
    * Metric.unit. The supported unit kinds are determined by the quota backend
    * system.  Here are some examples: * &quot;1/min/{project}&quot; for quota
    * per minute per project.  Note: the order of unit components is
    * insignificant. The &quot;1&quot; at the beginning is required to follow
    * the metric unit syntax.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * Tiered limit values. You must specify this as a key:value pair, with an
    * integer value that is the maximum number of requests allowed for the
    * specified unit. Currently only STANDARD is supported.
    */
  var values: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaQuotaLimit {
  @scala.inline
  def apply(
    defaultLimit: String = null,
    description: String = null,
    displayName: String = null,
    duration: String = null,
    freeTier: String = null,
    maxLimit: String = null,
    metric: String = null,
    name: String = null,
    unit: String = null,
    values: StringDictionary[String] = null
  ): SchemaQuotaLimit = {
    val __obj = js.Dynamic.literal()
    if (defaultLimit != null) __obj.updateDynamic("defaultLimit")(defaultLimit.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (freeTier != null) __obj.updateDynamic("freeTier")(freeTier.asInstanceOf[js.Any])
    if (maxLimit != null) __obj.updateDynamic("maxLimit")(maxLimit.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuotaLimit]
  }
}

