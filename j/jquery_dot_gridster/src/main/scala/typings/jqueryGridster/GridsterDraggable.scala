package typings.jqueryGridster

import typings.jqueryGridster.anon.Helper
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterDraggable extends js.Object {
  var distance: js.UndefOr[Double] = js.native
  var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ GridsterUi, Unit]] = js.native
  var handle: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var limit: js.UndefOr[Boolean] = js.native
  var offset_left: js.UndefOr[Double] = js.native
  var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.native
  var stop: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.native
}

object GridsterDraggable {
  @scala.inline
  def apply(): GridsterDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterDraggable]
  }
  @scala.inline
  implicit class GridsterDraggableOps[Self <: GridsterDraggable] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ GridsterUi) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLimit(value: Boolean): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset_left(value: Double): Self = this.set("offset_left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset_left: Self = this.set("offset_left", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

