package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current state of the Domain Mapping.
  */
@js.native
trait SchemaDomainMappingStatus extends js.Object {
  /**
    * Array of observed DomainMappingConditions, indicating the current state
    * of the DomainMapping.
    */
  var conditions: js.UndefOr[js.Array[SchemaDomainMappingCondition]] = js.native
  /**
    * The name of the route that the mapping currently points to.
    */
  var mappedRouteName: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the DomainMapping that
    * was last processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  /**
    * The resource records required to configure this domain mapping. These
    * records must be added to the domain&#39;s DNS configuration in order to
    * serve the application via this domain mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.native
}

object SchemaDomainMappingStatus {
  @scala.inline
  def apply(
    conditions: js.Array[SchemaDomainMappingCondition] = null,
    mappedRouteName: String = null,
    observedGeneration: Int | Double = null,
    resourceRecords: js.Array[SchemaResourceRecord] = null
  ): SchemaDomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (mappedRouteName != null) __obj.updateDynamic("mappedRouteName")(mappedRouteName.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (resourceRecords != null) __obj.updateDynamic("resourceRecords")(resourceRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainMappingStatus]
  }
}

