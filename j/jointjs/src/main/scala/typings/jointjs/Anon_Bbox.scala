package typings.jointjs

import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.bottomMiddle
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.corner
import typings.jointjs.jointjsStrings.leftMiddle
import typings.jointjs.jointjsStrings.origin
import typings.jointjs.jointjsStrings.rightMiddle
import typings.jointjs.jointjsStrings.topMiddle
import typings.jointjs.jointjsStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bbox extends js.Object {
  var searchBy: js.UndefOr[
    bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
  ] = js.undefined
}

object Anon_Bbox {
  @scala.inline
  def apply(
    searchBy: bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox = null
  ): Anon_Bbox = {
    val __obj = js.Dynamic.literal()
    if (searchBy != null) __obj.updateDynamic("searchBy")(searchBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bbox]
  }
}

