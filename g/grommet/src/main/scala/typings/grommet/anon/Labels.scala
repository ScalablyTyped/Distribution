package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var guide: js.UndefOr[Boolean] = js.native
  var labels: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var render: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* data */ js.Array[js.Object], 
      /* dataIndex */ Double, 
      /* axisIndex */ Double, 
      Unit
    ]
  ] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object Labels {
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
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
    def setLabels(value: Double): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRender(
      value: (/* value */ js.Any, /* data */ js.Array[js.Object], /* dataIndex */ Double, /* axisIndex */ Double) => Unit
    ): Self = this.set("render", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

