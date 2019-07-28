package typings.grommet.componentsAccordionMod

import typings.grommet.Anon_Bottom
import typings.grommet.Anon_TabContents
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var messages: js.UndefOr[Anon_TabContents] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    activeIndex: Double | js.Array[Double] = null,
    alignSelf: start | center | end | stretch = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    gridArea: String = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    messages: Anon_TabContents = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onActive: /* repeated */ js.Any => _ = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    __obj.asInstanceOf[AccordionProps]
  }
}

