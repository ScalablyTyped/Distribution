package typings.jimpCore.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffReturn[This] extends js.Object {
  var image: This = js.native
  var percent: Double = js.native
}

object DiffReturn {
  @scala.inline
  def apply[This](image: This, percent: Double): DiffReturn[This] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffReturn[This]]
  }
  @scala.inline
  implicit class DiffReturnOps[Self <: DiffReturn[_], This] (val x: Self with DiffReturn[This]) extends AnyVal {
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
    def setImage(value: This): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
  
}

