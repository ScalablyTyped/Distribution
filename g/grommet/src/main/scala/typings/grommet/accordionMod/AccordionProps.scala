package typings.grommet.accordionMod

import typings.grommet.anon.TabContents
import typings.grommet.utilsMod.AnimateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var animate: js.UndefOr[AnimateType] = js.native
  var messages: js.UndefOr[TabContents] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onActive: js.UndefOr[js.Function1[/* activeIndexes */ js.Array[Double], Unit]] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveIndexVarargs(value: Double*): Self = this.set("activeIndex", js.Array(value :_*))
    @scala.inline
    def setActiveIndex(value: Double | js.Array[Double]): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setAnimate(value: AnimateType): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setMessages(value: TabContents): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnActive(value: /* activeIndexes */ js.Array[Double] => Unit): Self = this.set("onActive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActive: Self = this.set("onActive", js.undefined)
  }
  
}

