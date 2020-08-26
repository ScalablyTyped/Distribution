package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AscendingCount extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
}

object AscendingCount {
  @scala.inline
  def apply(): AscendingCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingCount]
  }
  @scala.inline
  implicit class AscendingCountOps[Self <: AscendingCount] (val x: Self) extends AnyVal {
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
  }
  
}

