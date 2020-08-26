package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerRenderedEventUIParam extends js.Object {
  /**
    * Gets a reference to grid's data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object PagerRenderedEventUIParam {
  @scala.inline
  def apply(): PagerRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerRenderedEventUIParam]
  }
  @scala.inline
  implicit class PagerRenderedEventUIParamOps[Self <: PagerRenderedEventUIParam] (val x: Self) extends AnyVal {
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

