package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataBoundEventUIParam extends js.Object {
  /**
    * Used to obtain reference to array actual data which is displayed by chart.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DataBoundEventUIParam {
  @scala.inline
  def apply(): DataBoundEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBoundEventUIParam]
  }
  @scala.inline
  implicit class DataBoundEventUIParamOps[Self <: DataBoundEventUIParam] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

