package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bbox extends js.Object {
  var searchBy: js.UndefOr[
    jointjsLib.jointjsLibStrings.bottomLeft | jointjsLib.jointjsLibStrings.bottomMiddle | jointjsLib.jointjsLibStrings.center | jointjsLib.jointjsLibStrings.corner | jointjsLib.jointjsLibStrings.leftMiddle | jointjsLib.jointjsLibStrings.origin | jointjsLib.jointjsLibStrings.rightMiddle | jointjsLib.jointjsLibStrings.topMiddle | jointjsLib.jointjsLibStrings.topRight | jointjsLib.jointjsLibStrings.bbox
  ] = js.undefined
}

object Anon_Bbox {
  @scala.inline
  def apply(
    searchBy: jointjsLib.jointjsLibStrings.bottomLeft | jointjsLib.jointjsLibStrings.bottomMiddle | jointjsLib.jointjsLibStrings.center | jointjsLib.jointjsLibStrings.corner | jointjsLib.jointjsLibStrings.leftMiddle | jointjsLib.jointjsLibStrings.origin | jointjsLib.jointjsLibStrings.rightMiddle | jointjsLib.jointjsLibStrings.topMiddle | jointjsLib.jointjsLibStrings.topRight | jointjsLib.jointjsLibStrings.bbox = null
  ): Anon_Bbox = {
    val __obj = js.Dynamic.literal()
    if (searchBy != null) __obj.updateDynamic("searchBy")(searchBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bbox]
  }
}

