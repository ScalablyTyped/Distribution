package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxTotalResults extends js.Object {
  var maxTotalResults: js.UndefOr[Double] = js.native
}

object MaxTotalResults {
  @scala.inline
  def apply(): MaxTotalResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTotalResults]
  }
  @scala.inline
  implicit class MaxTotalResultsOps[Self <: MaxTotalResults] (val x: Self) extends AnyVal {
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
    def setMaxTotalResults(value: Double): Self = this.set("maxTotalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTotalResults: Self = this.set("maxTotalResults", js.undefined)
  }
  
}

