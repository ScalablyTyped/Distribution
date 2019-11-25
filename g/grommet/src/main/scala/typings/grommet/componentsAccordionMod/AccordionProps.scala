package typings.grommet.componentsAccordionMod

import typings.grommet.Anon_TabContents
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.AnimateType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var animate: js.UndefOr[AnimateType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[Anon_TabContents] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* activeIndexes */ js.Array[Double], Unit]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    activeIndex: Double | js.Array[Double] = null,
    alignSelf: AlignSelfType = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    messages: Anon_TabContents = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onActive: /* activeIndexes */ js.Array[Double] => Unit = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    __obj.asInstanceOf[AccordionProps]
  }
}

