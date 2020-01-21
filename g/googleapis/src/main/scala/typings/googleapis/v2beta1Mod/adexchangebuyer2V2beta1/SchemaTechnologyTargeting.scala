package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about various types of technology.
  */
@js.native
trait SchemaTechnologyTargeting extends js.Object {
  /**
    * IDs of device capabilities to be included/excluded.
    */
  var deviceCapabilityTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * IDs of device categories to be included/excluded.
    */
  var deviceCategoryTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * Operating system related targeting information.
    */
  var operatingSystemTargeting: js.UndefOr[SchemaOperatingSystemTargeting] = js.native
}

object SchemaTechnologyTargeting {
  @scala.inline
  def apply(
    deviceCapabilityTargeting: SchemaCriteriaTargeting = null,
    deviceCategoryTargeting: SchemaCriteriaTargeting = null,
    operatingSystemTargeting: SchemaOperatingSystemTargeting = null
  ): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    if (deviceCapabilityTargeting != null) __obj.updateDynamic("deviceCapabilityTargeting")(deviceCapabilityTargeting.asInstanceOf[js.Any])
    if (deviceCategoryTargeting != null) __obj.updateDynamic("deviceCategoryTargeting")(deviceCategoryTargeting.asInstanceOf[js.Any])
    if (operatingSystemTargeting != null) __obj.updateDynamic("operatingSystemTargeting")(operatingSystemTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
}

