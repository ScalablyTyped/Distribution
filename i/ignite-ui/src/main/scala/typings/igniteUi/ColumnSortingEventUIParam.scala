package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSortingEventUIParam extends js.Object {
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets the sorting direction.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * Gets sorting expressions.
    */
  var newExpressions: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnSortingEventUIParam {
  @scala.inline
  def apply(): ColumnSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSortingEventUIParam]
  }
  @scala.inline
  implicit class ColumnSortingEventUIParamOps[Self <: ColumnSortingEventUIParam] (val x: Self) extends AnyVal {
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
    def setNewExpressionsVarargs(value: js.Any*): Self = this.set("newExpressions", js.Array(value :_*))
    @scala.inline
    def setNewExpressions(value: js.Array[_]): Self = this.set("newExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewExpressions: Self = this.set("newExpressions", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

