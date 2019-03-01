package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: js.UndefOr[
    grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal
  ] = js.undefined
  var color: js.UndefOr[java.lang.String | Anon_Dark] = js.undefined
  var fromTarget: java.lang.String | js.Object
  var label: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String
  ] = js.undefined
  var thickness: js.UndefOr[
    grommetLib.grommetLibStrings.hair | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String
  ] = js.undefined
  var toTarget: java.lang.String | js.Object
  var `type`: js.UndefOr[
    grommetLib.grommetLibStrings.direct | grommetLib.grommetLibStrings.curved | grommetLib.grommetLibStrings.rectilinear
  ] = js.undefined
}

object Anon_Anchor {
  @scala.inline
  def apply(
    fromTarget: java.lang.String | js.Object,
    toTarget: java.lang.String | js.Object,
    anchor: grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal = null,
    color: java.lang.String | Anon_Dark = null,
    label: java.lang.String = null,
    offset: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String = null,
    thickness: grommetLib.grommetLibStrings.hair | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String = null,
    `type`: grommetLib.grommetLibStrings.direct | grommetLib.grommetLibStrings.curved | grommetLib.grommetLibStrings.rectilinear = null
  ): Anon_Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromTarget")(fromTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("toTarget")(toTarget.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Anchor]
  }
}

