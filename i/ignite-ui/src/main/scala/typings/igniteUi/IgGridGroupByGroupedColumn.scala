package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupByGroupedColumn
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * [column](ui.iggrid#options:columns) object for the column that is grouped
    *
    */
  var col: js.UndefOr[js.Any] = js.native
  /**
    * sort order - ascending or descending
    *
    */
  var dir: js.UndefOr[js.Any] = js.native
  /**
    * Key of the column that's grouped
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Key of the columnLayout, if the grid is hierarchical
    *
    */
  var layout: js.UndefOr[String] = js.native
}

object IgGridGroupByGroupedColumn {
  @scala.inline
  def apply(): IgGridGroupByGroupedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByGroupedColumn]
  }
  @scala.inline
  implicit class IgGridGroupByGroupedColumnOps[Self <: IgGridGroupByGroupedColumn] (val x: Self) extends AnyVal {
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
    def setCol(value: js.Any): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    @scala.inline
    def setDir(value: js.Any): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
  
}

