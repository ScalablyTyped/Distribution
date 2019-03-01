package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomBottomleft extends js.Object {
  var corner: js.UndefOr[
    grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`top-right` | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`bottom-right`
  ] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
}

object Anon_BottomBottomleft {
  @scala.inline
  def apply(
    corner: grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`top-right` | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`bottom-right` = null,
    size: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null
  ): Anon_BottomBottomleft = {
    val __obj = js.Dynamic.literal()
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomBottomleft]
  }
}

