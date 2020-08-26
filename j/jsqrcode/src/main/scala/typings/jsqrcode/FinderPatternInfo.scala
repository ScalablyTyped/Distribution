package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinderPatternInfo extends js.Object {
  val BottomLeft: AlignmentPattern = js.native
  val TopLeft: AlignmentPattern = js.native
  val TopRight: AlignmentPattern = js.native
}

object FinderPatternInfo {
  @scala.inline
  def apply(BottomLeft: AlignmentPattern, TopLeft: AlignmentPattern, TopRight: AlignmentPattern): FinderPatternInfo = {
    val __obj = js.Dynamic.literal(BottomLeft = BottomLeft.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any], TopRight = TopRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderPatternInfo]
  }
  @scala.inline
  implicit class FinderPatternInfoOps[Self <: FinderPatternInfo] (val x: Self) extends AnyVal {
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
    def setBottomLeft(value: AlignmentPattern): Self = this.set("BottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: AlignmentPattern): Self = this.set("TopLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRight(value: AlignmentPattern): Self = this.set("TopRight", value.asInstanceOf[js.Any])
  }
  
}

