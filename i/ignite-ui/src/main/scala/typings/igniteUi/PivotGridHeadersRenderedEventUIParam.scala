package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridHeadersRenderedEventUIParam extends js.Object {
  /**
    * Gets a reference to the igGrid widget, which holds the headers.
    */
  var grid: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the headers table DOM element.
    */
  var table: js.UndefOr[Element] = js.native
}

object PivotGridHeadersRenderedEventUIParam {
  @scala.inline
  def apply(): PivotGridHeadersRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridHeadersRenderedEventUIParam]
  }
  @scala.inline
  implicit class PivotGridHeadersRenderedEventUIParamOps[Self <: PivotGridHeadersRenderedEventUIParam] (val x: Self) extends AnyVal {
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
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTable(value: Element): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

