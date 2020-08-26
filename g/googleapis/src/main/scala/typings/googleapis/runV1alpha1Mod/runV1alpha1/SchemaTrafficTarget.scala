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
  def apply(): SchemaTrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficTarget]
  }
  @scala.inline
  implicit class SchemaTrafficTargetOps[Self <: SchemaTrafficTarget] (val x: Self) extends AnyVal {
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
    def setConfigurationName(value: String): Self = this.set("configurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationName: Self = this.set("configurationName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setRevisionName(value: String): Self = this.set("revisionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionName: Self = this.set("revisionName", js.undefined)
  }
  
}

