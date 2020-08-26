package typings.materializeCss.anon

import typings.materializeCss.M.Dropdown
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.DropdownOptions> */
@js.native
trait PartialDropdownOptionsAlignment extends js.Object {
  var alignment: js.UndefOr[left | right] = js.native
  var autoTrigger: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var constrainWidth: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[Element] = js.native
  var coverTrigger: js.UndefOr[Boolean] = js.native
  var hover: js.UndefOr[Boolean] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  var outDuration: js.UndefOr[Double] = js.native
}

object PartialDropdownOptionsAlignment {
  @scala.inline
  def apply(): PartialDropdownOptionsAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropdownOptionsAlignment]
  }
  @scala.inline
  implicit class PartialDropdownOptionsAlignmentOps[Self <: PartialDropdownOptionsAlignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAutoTrigger(value: Boolean): Self = this.set("autoTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoTrigger: Self = this.set("autoTrigger", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setConstrainWidth(value: Boolean): Self = this.set("constrainWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainWidth: Self = this.set("constrainWidth", js.undefined)
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCoverTrigger(value: Boolean): Self = this.set("coverTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverTrigger: Self = this.set("coverTrigger", js.undefined)
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInDuration: Self = this.set("inDuration", js.undefined)
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = this.set("onCloseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseEnd: Self = this.set("onCloseEnd", js.undefined)
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = this.set("onCloseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseStart: Self = this.set("onCloseStart", js.undefined)
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = this.set("onOpenEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenEnd: Self = this.set("onOpenEnd", js.undefined)
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = this.set("onOpenStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenStart: Self = this.set("onOpenStart", js.undefined)
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutDuration: Self = this.set("outDuration", js.undefined)
  }
  
}

