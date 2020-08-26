package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFixedEventUIParam extends js.Object {
  /**
    * Gets the columnKey or the columnIndex.
    */
  var columnIdentifier: js.UndefOr[js.Any] = js.native
  /**
    * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
    */
  var isGroupHeader: js.UndefOr[Boolean] = js.native
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnFixedEventUIParam {
  @scala.inline
  def apply(): ColumnFixedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFixedEventUIParam]
  }
  @scala.inline
  implicit class ColumnFixedEventUIParamOps[Self <: ColumnFixedEventUIParam] (val x: Self) extends AnyVal {
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
    def setColumnIdentifier(value: js.Any): Self = this.set("columnIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIdentifier: Self = this.set("columnIdentifier", js.undefined)
    @scala.inline
    def setIsGroupHeader(value: Boolean): Self = this.set("isGroupHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGroupHeader: Self = this.set("isGroupHeader", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

