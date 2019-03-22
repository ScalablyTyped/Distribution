package typings
package grommetLib.componentsHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var as: js.UndefOr[grommetLib.utilsMod.PolymorphicType] = js.undefined
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[
    grommetLib.grommetLibStrings.`1` | grommetLib.grommetLibStrings.`2` | grommetLib.grommetLibStrings.`3` | grommetLib.grommetLibStrings.`4` | grommetLib.grommetLibStrings.`5` | grommetLib.grommetLibStrings.`6`
  ] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var textAlign: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end
  ] = js.undefined
  var truncate: js.UndefOr[scala.Boolean] = js.undefined
}

object HeadingProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    as: grommetLib.utilsMod.PolymorphicType = null,
    color: java.lang.String | grommetLib.Anon_Dark = null,
    gridArea: java.lang.String = null,
    level: grommetLib.grommetLibStrings.`1` | grommetLib.grommetLibStrings.`2` | grommetLib.grommetLibStrings.`3` | grommetLib.grommetLibStrings.`4` | grommetLib.grommetLibStrings.`5` | grommetLib.grommetLibStrings.`6` = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    textAlign: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined
  ): HeadingProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[HeadingProps]
  }
}

