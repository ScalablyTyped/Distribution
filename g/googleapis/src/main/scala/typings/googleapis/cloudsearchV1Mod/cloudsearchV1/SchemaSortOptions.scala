package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSortOptions extends js.Object {
  /**
    * Name of the operator corresponding to the field to sort on. The
    * corresponding property must be marked as sortable.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Ascending is the default sort order
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object SchemaSortOptions {
  @scala.inline
  def apply(): SchemaSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortOptions]
  }
  @scala.inline
  implicit class SchemaSortOptionsOps[Self <: SchemaSortOptions] (val x: Self) extends AnyVal {
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
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

