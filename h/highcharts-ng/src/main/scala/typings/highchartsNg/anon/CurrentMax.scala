package typings.highchartsNg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.native
  var currentMin: js.UndefOr[Double] = js.native
  var title: js.UndefOr[Text] = js.native
}

object CurrentMax {
  @scala.inline
  def apply(): CurrentMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMax]
  }
  @scala.inline
  implicit class CurrentMaxOps[Self <: CurrentMax] (val x: Self) extends AnyVal {
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
    def setCurrentMax(value: Double): Self = this.set("currentMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMax: Self = this.set("currentMax", js.undefined)
    @scala.inline
    def setCurrentMin(value: Double): Self = this.set("currentMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMin: Self = this.set("currentMin", js.undefined)
    @scala.inline
    def setTitle(value: Text): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

