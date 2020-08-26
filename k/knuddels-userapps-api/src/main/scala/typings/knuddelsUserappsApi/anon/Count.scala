package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var maximumValue: js.UndefOr[Double] = js.native
  var minimumValue: js.UndefOr[Double] = js.native
  var page: js.UndefOr[Double] = js.native
}

object Count {
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

