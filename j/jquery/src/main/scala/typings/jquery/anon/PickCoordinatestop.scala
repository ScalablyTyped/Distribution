package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'top'> */
@js.native
trait PickCoordinatestop extends _CoordinatesPartial {
  var top: Double = js.native
}

object PickCoordinatestop {
  @scala.inline
  def apply(top: Double): PickCoordinatestop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatestop]
  }
  @scala.inline
  implicit class PickCoordinatestopOps[Self <: PickCoordinatestop] (val x: Self) extends AnyVal {
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
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

