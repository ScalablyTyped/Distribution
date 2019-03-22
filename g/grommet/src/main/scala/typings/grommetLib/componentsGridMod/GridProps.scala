package typings
package grommetLib.componentsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var align: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var alignContent: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var areas: js.UndefOr[js.Array[grommetLib.Anon_End]] = js.undefined
  var as: js.UndefOr[grommetLib.utilsMod.PolymorphicType] = js.undefined
  var columns: js.UndefOr[
    (js.Array[
      grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | grommetLib.grommetLibStrings.flex | grommetLib.grommetLibStrings.auto | java.lang.String | js.Array[java.lang.String]
    ]) | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_12 | java.lang.String
  ] = js.undefined
  var fill: js.UndefOr[
    grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical | scala.Boolean
  ] = js.undefined
  var gap: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.none | grommetLib.Anon_Column | java.lang.String
  ] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var justify: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var justifyContent: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var rows: js.UndefOr[
    (js.Array[
      grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | grommetLib.grommetLibStrings.flex | grommetLib.grommetLibStrings.auto | java.lang.String | js.Array[java.lang.String]
    ]) | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var tag: js.UndefOr[grommetLib.utilsMod.PolymorphicType] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    align: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    alignContent: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    areas: js.Array[grommetLib.Anon_End] = null,
    as: grommetLib.utilsMod.PolymorphicType = null,
    columns: (js.Array[
      grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | grommetLib.grommetLibStrings.flex | grommetLib.grommetLibStrings.auto | java.lang.String | js.Array[java.lang.String]
    ]) | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_12 | java.lang.String = null,
    fill: grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical | scala.Boolean = null,
    gap: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.none | grommetLib.Anon_Column | java.lang.String = null,
    gridArea: java.lang.String = null,
    justify: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    justifyContent: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    rows: (js.Array[
      grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | grommetLib.grommetLibStrings.flex | grommetLib.grommetLibStrings.auto | java.lang.String | js.Array[java.lang.String]
    ]) | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    tag: grommetLib.utilsMod.PolymorphicType = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (areas != null) __obj.updateDynamic("areas")(areas)
    if (as != null) __obj.updateDynamic("as")(as)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[GridProps]
  }
}

