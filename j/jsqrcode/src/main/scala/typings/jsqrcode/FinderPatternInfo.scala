package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderPatternInfo extends js.Object {
  val BottomLeft: AlignmentPattern
  val TopLeft: AlignmentPattern
  val TopRight: AlignmentPattern
}

object FinderPatternInfo {
  @scala.inline
  def apply(BottomLeft: AlignmentPattern, TopLeft: AlignmentPattern, TopRight: AlignmentPattern): FinderPatternInfo = {
    val __obj = js.Dynamic.literal(BottomLeft = BottomLeft.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any], TopRight = TopRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderPatternInfo]
  }
}

