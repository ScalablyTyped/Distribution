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
  def apply(): SchemaOperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemTargeting]
  }
  @scala.inline
  implicit class SchemaOperatingSystemTargetingOps[Self <: SchemaOperatingSystemTargeting] (val x: Self) extends AnyVal {
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
    def setOperatingSystemCriteria(value: SchemaCriteriaTargeting): Self = this.set("operatingSystemCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemCriteria: Self = this.set("operatingSystemCriteria", js.undefined)
    @scala.inline
    def setOperatingSystemVersionCriteria(value: SchemaCriteriaTargeting): Self = this.set("operatingSystemVersionCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersionCriteria: Self = this.set("operatingSystemVersionCriteria", js.undefined)
  }
  
}

