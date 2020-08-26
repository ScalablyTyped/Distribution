package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSortedEventUIParam extends js.Object {
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets the sorting direction.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * Gets the sorted expressions.
    */
  var expressions: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnSortedEventUIParam {
  @scala.inline
  def apply(): ColumnSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSortedEventUIParam]
  }
  @scala.inline
  implicit class ColumnSortedEventUIParamOps[Self <: ColumnSortedEventUIParam] (val x: Self) extends AnyVal {
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setExpressions(value: js.Any): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

