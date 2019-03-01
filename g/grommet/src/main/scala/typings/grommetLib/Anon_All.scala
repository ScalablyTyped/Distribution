package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var color: js.UndefOr[java.lang.String | Anon_Dark] = js.undefined
  var side: js.UndefOr[
    grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.all
  ] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var style: js.UndefOr[
    grommetLib.grommetLibStrings.solid | grommetLib.grommetLibStrings.dashed | grommetLib.grommetLibStrings.dotted | grommetLib.grommetLibStrings.double | grommetLib.grommetLibStrings.groove | grommetLib.grommetLibStrings.ridge | grommetLib.grommetLibStrings.inset | grommetLib.grommetLibStrings.outset | grommetLib.grommetLibStrings.hidden
  ] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    color: java.lang.String | Anon_Dark = null,
    side: grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.all = null,
    size: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    style: grommetLib.grommetLibStrings.solid | grommetLib.grommetLibStrings.dashed | grommetLib.grommetLibStrings.dotted | grommetLib.grommetLibStrings.double | grommetLib.grommetLibStrings.groove | grommetLib.grommetLibStrings.ridge | grommetLib.grommetLibStrings.inset | grommetLib.grommetLibStrings.outset | grommetLib.grommetLibStrings.hidden = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_All]
  }
}

