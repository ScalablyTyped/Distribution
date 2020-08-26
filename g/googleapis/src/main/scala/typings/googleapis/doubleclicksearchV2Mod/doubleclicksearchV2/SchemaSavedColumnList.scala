package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of saved columns. Advertisers create saved columns to report on
  * Floodlight activities, Google Analytics goals, or custom KPIs. To request
  * reports with saved columns, you&#39;ll need the saved column names that are
  * available from this list.
  */
@js.native
trait SchemaSavedColumnList extends js.Object {
  /**
    * The saved columns being requested.
    */
  var items: js.UndefOr[js.Array[SchemaSavedColumn]] = js.native
  /**
    * Identifies this as a SavedColumnList resource. Value: the fixed string
    * doubleclicksearch#savedColumnList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSavedColumnList {
  @scala.inline
  def apply(): SchemaSavedColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumnList]
  }
  @scala.inline
  implicit class SchemaSavedColumnListOps[Self <: SchemaSavedColumnList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaSavedColumn*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaSavedColumn]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

