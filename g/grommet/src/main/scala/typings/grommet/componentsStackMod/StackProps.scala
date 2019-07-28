package typings.grommet.componentsStackMod

import typings.grommet.Anon_Bottom
import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.first
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.last
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
  ] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var guidingChild: js.UndefOr[Double | first | last] = js.undefined
  var interactiveChild: js.UndefOr[Double | first | last] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
}

object StackProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    anchor: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right` = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gridArea: String = null,
    guidingChild: Double | first | last = null,
    interactiveChild: Double | first | last = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null
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

