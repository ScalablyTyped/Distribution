package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current state of the Service. Output only.
  */
@js.native
trait SchemaServiceStatus extends js.Object {
  /**
    * From RouteStatus. Similar to domain, information on where the service is
    * available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.native
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaServiceCondition]] = js.native
  /**
    * From RouteStatus. Domain holds the top-level domain that will distribute
    * traffic over the provided targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * From ConfigurationStatus. LatestCreatedRevisionName is the last revision
    * that was created from this Service&#39;s Configuration. It might not be
    * ready yet, for that use LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.native
  /**
    * From ConfigurationStatus. LatestReadyRevisionName holds the name of the
    * latest Revision stamped out from this Service&#39;s Configuration that
    * has had its &quot;Ready&quot; condition become &quot;True&quot;.
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Route that was last
    * processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  /**
    * From RouteStatus. Traffic holds the configured traffic distribution.
    * These entries will always contain RevisionName references. When
    * ConfigurationName appears in the spec, this will hold the
    * LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.native
}

object SchemaServiceStatus {
  @scala.inline
  def apply(): SchemaServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceStatus]
  }
  @scala.inline
  implicit class SchemaServiceStatusOps[Self <: SchemaServiceStatus] (val x: Self) extends AnyVal {
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
    def setAddress(value: SchemaAddressable): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: SchemaServiceCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[SchemaServiceCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setLatestCreatedRevisionName(value: String): Self = this.set("latestCreatedRevisionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestCreatedRevisionName: Self = this.set("latestCreatedRevisionName", js.undefined)
    @scala.inline
    def setLatestReadyRevisionName(value: String): Self = this.set("latestReadyRevisionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestReadyRevisionName: Self = this.set("latestReadyRevisionName", js.undefined)
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    @scala.inline
    def setTrafficVarargs(value: SchemaTrafficTarget*): Self = this.set("traffic", js.Array(value :_*))
    @scala.inline
    def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = this.set("traffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraffic: Self = this.set("traffic", js.undefined)
  }
  
}

