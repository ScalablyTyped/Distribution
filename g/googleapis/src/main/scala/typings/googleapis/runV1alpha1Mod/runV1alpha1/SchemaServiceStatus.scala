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
  def apply(
    address: SchemaAddressable = null,
    conditions: js.Array[SchemaServiceCondition] = null,
    domain: String = null,
    latestCreatedRevisionName: String = null,
    latestReadyRevisionName: String = null,
    observedGeneration: js.UndefOr[Double] = js.undefined,
    traffic: js.Array[SchemaTrafficTarget] = null
  ): SchemaServiceStatus = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (latestCreatedRevisionName != null) __obj.updateDynamic("latestCreatedRevisionName")(latestCreatedRevisionName.asInstanceOf[js.Any])
    if (latestReadyRevisionName != null) __obj.updateDynamic("latestReadyRevisionName")(latestReadyRevisionName.asInstanceOf[js.Any])
    if (!js.isUndefined(observedGeneration)) __obj.updateDynamic("observedGeneration")(observedGeneration.get.asInstanceOf[js.Any])
    if (traffic != null) __obj.updateDynamic("traffic")(traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceStatus]
  }
}

