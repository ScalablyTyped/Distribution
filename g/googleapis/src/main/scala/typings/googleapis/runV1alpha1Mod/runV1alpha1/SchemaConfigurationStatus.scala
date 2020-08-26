package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigurationStatus communicates the observed state of the Configuration
  * (from the controller).
  */
@js.native
trait SchemaConfigurationStatus extends js.Object {
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaConfigurationCondition]] = js.native
  /**
    * LatestCreatedRevisionName is the last revision that was created from this
    * Configuration. It might not be ready yet, for that use
    * LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.native
  /**
    * LatestReadyRevisionName holds the name of the latest Revision stamped out
    * from this Configuration that has had its &quot;Ready&quot; condition
    * become &quot;True&quot;.
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Configuration that
    * was last processed by the controller. The observed generation is updated
    * even if the controller failed to process the spec and create the
    * Revision.  Clients polling for completed reconciliation should poll until
    * observedGeneration = metadata.generation, and the Ready condition&#39;s
    * status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
}

object SchemaConfigurationStatus {
  @scala.inline
  def apply(): SchemaConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationStatus]
  }
  @scala.inline
  implicit class SchemaConfigurationStatusOps[Self <: SchemaConfigurationStatus] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: SchemaConfigurationCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[SchemaConfigurationCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
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
  }
  
}

