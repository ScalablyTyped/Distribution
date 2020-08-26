package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guide extends js.Object {
  var guide: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var labels: js.UndefOr[Double] = js.native
  var render: js.UndefOr[js.Function2[/* dataIndex */ Double, /* axisIndex */ Double, Unit]] = js.native
}

object Guide {
  @scala.inline
  def apply(): Guide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guide]
  }
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
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
    def setGuide(value: Boolean): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabels(value: Double): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setRender(value: (/* dataIndex */ Double, /* axisIndex */ Double) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

