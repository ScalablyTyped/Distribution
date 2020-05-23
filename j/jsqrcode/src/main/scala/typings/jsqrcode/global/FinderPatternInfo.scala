package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPatternInfo")
@js.native
class FinderPatternInfo protected ()
  extends typings.jsqrcode.FinderPatternInfo {
  def this(patternCenters: js.Tuple3[
        typings.jsqrcode.AlignmentPattern, 
        typings.jsqrcode.AlignmentPattern, 
        typings.jsqrcode.AlignmentPattern
      ]) = this()
  /* CompleteClass */
  override val BottomLeft: typings.jsqrcode.AlignmentPattern = js.native
  /* CompleteClass */
  override val TopLeft: typings.jsqrcode.AlignmentPattern = js.native
  /* CompleteClass */
  override val TopRight: typings.jsqrcode.AlignmentPattern = js.native
}

