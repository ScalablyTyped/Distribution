package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a filter view being duplicated.
  */
@js.native
trait SchemaDuplicateFilterViewResponse extends js.Object {
  /**
    * The newly created filter.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}

object SchemaDuplicateFilterViewResponse {
  @scala.inline
  def apply(): SchemaDuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateFilterViewResponse]
  }
  @scala.inline
  implicit class SchemaDuplicateFilterViewResponseOps[Self <: SchemaDuplicateFilterViewResponse] (val x: Self) extends AnyVal {
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
    def setFilter(value: SchemaFilterView): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

