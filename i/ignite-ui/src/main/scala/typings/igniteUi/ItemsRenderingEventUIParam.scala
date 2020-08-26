package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsRenderingEventUIParam extends js.Object {
  /**
    * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ItemsRenderingEventUIParam {
  @scala.inline
  def apply(): ItemsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsRenderingEventUIParam]
  }
  @scala.inline
  implicit class ItemsRenderingEventUIParamOps[Self <: ItemsRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

