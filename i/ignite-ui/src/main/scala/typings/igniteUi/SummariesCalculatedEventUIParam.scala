package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummariesCalculatedEventUIParam extends js.Object {
  /**
    * Gets the data for calculated summaries.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object SummariesCalculatedEventUIParam {
  @scala.inline
  def apply(): SummariesCalculatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesCalculatedEventUIParam]
  }
  @scala.inline
  implicit class SummariesCalculatedEventUIParamOps[Self <: SummariesCalculatedEventUIParam] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

