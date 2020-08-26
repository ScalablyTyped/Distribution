package typings.jqueryGridster

import typings.jqueryGridster.anon.Helper
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterResizable extends js.Object {
  var axes: js.UndefOr[js.Array[String]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var handle_append_to: js.UndefOr[String] = js.native
  var handle_class: js.UndefOr[String] = js.native
  var max_size: js.UndefOr[js.Array[Double]] = js.native
  var min_size: js.UndefOr[js.Array[Double]] = js.native
  var resize: js.UndefOr[js.Function3[/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.native
  var start: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.native
  var stop: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.native
}

object GridsterResizable {
  @scala.inline
  def apply(): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterResizable]
  }
  @scala.inline
  implicit class GridsterResizableOps[Self <: GridsterResizable] (val x: Self) extends AnyVal {
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
    def setAxesVarargs(value: String*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[String]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHandle_append_to(value: String): Self = this.set("handle_append_to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle_append_to: Self = this.set("handle_append_to", js.undefined)
    @scala.inline
    def setHandle_class(value: String): Self = this.set("handle_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle_class: Self = this.set("handle_class", js.undefined)
    @scala.inline
    def setMax_sizeVarargs(value: Double*): Self = this.set("max_size", js.Array(value :_*))
    @scala.inline
    def setMax_size(value: js.Array[Double]): Self = this.set("max_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_size: Self = this.set("max_size", js.undefined)
    @scala.inline
    def setMin_sizeVarargs(value: Double*): Self = this.set("min_size", js.Array(value :_*))
    @scala.inline
    def setMin_size(value: js.Array[Double]): Self = this.set("min_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_size: Self = this.set("min_size", js.undefined)
    @scala.inline
    def setResize(value: (/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery) => Unit): Self = this.set("resize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Unit): Self = this.set("start", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Unit): Self = this.set("stop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

