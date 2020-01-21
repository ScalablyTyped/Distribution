package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting information for operating systems.
  */
@js.native
trait SchemaOperatingSystemTargeting extends js.Object {
  /**
    * IDs of operating systems to be included/excluded.
    */
  var operatingSystemCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * IDs of operating system versions to be included/excluded.
    */
  var operatingSystemVersionCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
}

object SchemaOperatingSystemTargeting {
  @scala.inline
  def apply(
    operatingSystemCriteria: SchemaCriteriaTargeting = null,
    operatingSystemVersionCriteria: SchemaCriteriaTargeting = null
  ): SchemaOperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    if (operatingSystemCriteria != null) __obj.updateDynamic("operatingSystemCriteria")(operatingSystemCriteria.asInstanceOf[js.Any])
    if (operatingSystemVersionCriteria != null) __obj.updateDynamic("operatingSystemVersionCriteria")(operatingSystemVersionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperatingSystemTargeting]
  }
}

