package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An isolated set of Cloud Spanner resources on which databases can be
  * hosted.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * Required. The name of the instance&#39;s configuration. Values are of the
    * form `projects/&lt;project&gt;/instanceConfigs/&lt;configuration&gt;`.
    * See also InstanceConfig and ListInstanceConfigs.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Required. The descriptive name for this instance as it appears in UIs.
    * Must be unique per project and between 4 and 30 characters in length.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Cloud Labels are a flexible and lightweight mechanism for organizing
    * cloud resources into groups that reflect a customer&#39;s organizational
    * needs and deployment strategies. Cloud Labels can be used to filter
    * collections of resources. They can be used to control how resource
    * metrics are aggregated. And they can be used as arguments to policy
    * management rules (e.g. route, firewall, load balancing, etc.).   * Label
    * keys must be between 1 and 63 characters long and must conform to    the
    * following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.  * Label
    * values must be between 0 and 63 characters long and must conform    to
    * the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.  * No more than
    * 64 labels can be associated with a given resource.  See
    * https://goo.gl/xmQnxf for more information on and examples of labels.  If
    * you plan to use labels in your own code, please note that additional
    * characters may be allowed in the future. And so you are advised to use an
    * internal label representation, such as JSON, which doesn&#39;t rely upon
    * specific characters being disallowed.  For example, representing labels
    * as the string:  name + &quot;_&quot; + value  would prove problematic if
    * we were to allow &quot;_&quot; in a future release.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. A unique identifier for the instance, which cannot be changed
    * after the instance is created. Values are of the form
    * `projects/&lt;project&gt;/instances/a-z*[a-z0-9]`. The final segment of
    * the name must be between 6 and 30 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The number of nodes allocated to this instance. This may be
    * zero in API responses for instances that are not yet in state `READY`.
    * See [the
    * documentation](https://cloud.google.com/spanner/docs/instances#node_count)
    * for more information about nodes.
    */
  var nodeCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The current instance state. For CreateInstance, the state
    * must be either omitted or set to `CREATING`. For UpdateInstance, the
    * state must be either omitted or set to `READY`.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(
    config: String = null,
    displayName: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    nodeCount: js.UndefOr[Double] = js.undefined,
    state: String = null
  ): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeCount)) __obj.updateDynamic("nodeCount")(nodeCount.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstance]
  }
}

