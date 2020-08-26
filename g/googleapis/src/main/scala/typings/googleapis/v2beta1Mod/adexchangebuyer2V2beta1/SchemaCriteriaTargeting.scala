package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic targeting used for targeting dimensions that contains a list of
  * included and excluded numeric IDs.
  */
@js.native
trait SchemaCriteriaTargeting extends js.Object {
  /**
    * A list of numeric IDs to be excluded.
    */
  var excludedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of numeric IDs to be included.
    */
  var targetedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCriteriaTargeting {
  @scala.inline
  def apply(): SchemaCriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCriteriaTargeting]
  }
  @scala.inline
  implicit class SchemaCriteriaTargetingOps[Self <: SchemaCriteriaTargeting] (val x: Self) extends AnyVal {
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
    def setExcludedCriteriaIdsVarargs(value: String*): Self = this.set("excludedCriteriaIds", js.Array(value :_*))
    @scala.inline
    def setExcludedCriteriaIds(value: js.Array[String]): Self = this.set("excludedCriteriaIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedCriteriaIds: Self = this.set("excludedCriteriaIds", js.undefined)
    @scala.inline
    def setTargetedCriteriaIdsVarargs(value: String*): Self = this.set("targetedCriteriaIds", js.Array(value :_*))
    @scala.inline
    def setTargetedCriteriaIds(value: js.Array[String]): Self = this.set("targetedCriteriaIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedCriteriaIds: Self = this.set("targetedCriteriaIds", js.undefined)
  }
  
}

