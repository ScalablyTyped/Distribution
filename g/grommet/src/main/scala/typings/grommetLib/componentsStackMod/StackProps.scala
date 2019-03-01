package typings
package grommetLib.componentsStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var anchor: js.UndefOr[
    grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`top-right` | grommetLib.grommetLibStrings.`bottom-right`
  ] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var guidingChild: js.UndefOr[
    scala.Double | grommetLib.grommetLibStrings.first | grommetLib.grommetLibStrings.last
  ] = js.undefined
  var interactiveChild: js.UndefOr[
    scala.Double | grommetLib.grommetLibStrings.first | grommetLib.grommetLibStrings.last
  ] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
}

object StackProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    anchor: grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`top-right` | grommetLib.grommetLibStrings.`bottom-right` = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    gridArea: java.lang.String = null,
    guidingChild: scala.Double | grommetLib.grommetLibStrings.first | grommetLib.grommetLibStrings.last = null,
    interactiveChild: scala.Double | grommetLib.grommetLibStrings.first | grommetLib.grommetLibStrings.last = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null
  ): StackProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (guidingChild != null) __obj.updateDynamic("guidingChild")(guidingChild.asInstanceOf[js.Any])
    if (interactiveChild != null) __obj.updateDynamic("interactiveChild")(interactiveChild.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackProps]
  }
}

