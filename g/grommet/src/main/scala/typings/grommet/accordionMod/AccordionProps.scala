package typings.grommet.accordionMod

import typings.grommet.anon.TabContents
import typings.grommet.utilsMod.AnimateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var animate: js.UndefOr[AnimateType] = js.undefined
  var messages: js.UndefOr[TabContents] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* activeIndexes */ js.Array[Double], Unit]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    activeIndex: Double | js.Array[Double] = null,
    animate: js.UndefOr[AnimateType] = js.undefined,
    messages: TabContents = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onActive: /* activeIndexes */ js.Array[Double] => Unit = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    __obj.asInstanceOf[AccordionProps]
  }
}

