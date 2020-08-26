package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxWidth extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[String] = js.native
}

object MaxWidth {
  @scala.inline
  def apply(): MaxWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth]
  }
  @scala.inline
  implicit class MaxWidthOps[Self <: MaxWidth] (val x: Self) extends AnyVal {
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
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

