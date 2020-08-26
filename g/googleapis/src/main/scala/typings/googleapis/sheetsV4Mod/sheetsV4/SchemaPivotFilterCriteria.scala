package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a pivot table.
  */
@js.native
trait SchemaPivotFilterCriteria extends js.Object {
  /**
    * Values that should be included.  Values not listed here are excluded.
    */
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPivotFilterCriteria {
  @scala.inline
  def apply(): SchemaPivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotFilterCriteria]
  }
  @scala.inline
  implicit class SchemaPivotFilterCriteriaOps[Self <: SchemaPivotFilterCriteria] (val x: Self) extends AnyVal {
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
    def setVisibleValuesVarargs(value: String*): Self = this.set("visibleValues", js.Array(value :_*))
    @scala.inline
    def setVisibleValues(value: js.Array[String]): Self = this.set("visibleValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleValues: Self = this.set("visibleValues", js.undefined)
  }
  
}

