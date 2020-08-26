package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'left'> */
@js.native
trait PickCoordinatesleft extends _CoordinatesPartial {
  var left: Double = js.native
}

object PickCoordinatesleft {
  @scala.inline
  def apply(left: Double): PickCoordinatesleft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatesleft]
  }
  @scala.inline
  implicit class PickCoordinatesleftOps[Self <: PickCoordinatesleft] (val x: Self) extends AnyVal {
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
  }
  
}

