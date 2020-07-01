package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TrafficTarget holds a single entry of the routing table for a Route.
  */
@js.native
trait SchemaTrafficTarget extends js.Object {
  /**
    * ConfigurationName of a configuration to whose latest revision we will
    * send this portion of traffic. When the
    * &quot;status.latestReadyRevisionName&quot; of the referenced
    * configuration changes, we will automatically migrate traffic from the
    * prior &quot;latest ready&quot; revision to the new one. This field is
    * never set in Route&#39;s status, only its spec. This is mutually
    * exclusive with RevisionName.  Cloud Run currently supports a single
    * ConfigurationName.
    */
  var configurationName: js.UndefOr[String] = js.native
  /**
    * Name is optionally used to expose a dedicated hostname for referencing
    * this target exclusively.  Not currently supported by Cloud Run. +optional
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Percent specifies percent of the traffic to this Revision or
    * Configuration. This defaults to zero if unspecified.  Cloud Run currently
    * requires 100 percent for a single ConfigurationName TrafficTarget entry.
    */
  var percent: js.UndefOr[Double] = js.native
  /**
    * RevisionName of a specific revision to which to send this portion of
    * traffic. This is mutually exclusive with ConfigurationName.  Providing
    * RevisionName in spec is not currently supported by Cloud Run.
    */
  var revisionName: js.UndefOr[String] = js.native
}

object SchemaTrafficTarget {
  @scala.inline
  def apply(
    configurationName: String = null,
    name: String = null,
    percent: js.UndefOr[Double] = js.undefined,
    revisionName: String = null
  ): SchemaTrafficTarget = {
    val __obj = js.Dynamic.literal()
    if (configurationName != null) __obj.updateDynamic("configurationName")(configurationName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (revisionName != null) __obj.updateDynamic("revisionName")(revisionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrafficTarget]
  }
}

