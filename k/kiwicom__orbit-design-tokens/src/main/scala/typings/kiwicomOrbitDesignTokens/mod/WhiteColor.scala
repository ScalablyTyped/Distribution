package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhiteColor extends js.Object {
  var normal: String = js.native
  var normalActive: String = js.native
  var normalHover: String = js.native
}

object WhiteColor {
  @scala.inline
  def apply(normal: String, normalActive: String, normalHover: String): WhiteColor = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteColor]
  }
  @scala.inline
  implicit class WhiteColorOps[Self <: WhiteColor] (val x: Self) extends AnyVal {
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
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalActive(value: String): Self = this.set("normalActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalHover(value: String): Self = this.set("normalHover", value.asInstanceOf[js.Any])
  }
  
}

