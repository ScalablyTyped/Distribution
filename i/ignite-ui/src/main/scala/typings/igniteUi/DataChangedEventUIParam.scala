package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataChangedEventUIParam extends js.Object {
  /**
    * Used to obtain the new data.
    */
  var newData: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DataChangedEventUIParam {
  @scala.inline
  def apply(): DataChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataChangedEventUIParam]
  }
  @scala.inline
  implicit class DataChangedEventUIParamOps[Self <: DataChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setNewData(value: js.Any): Self = this.set("newData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

