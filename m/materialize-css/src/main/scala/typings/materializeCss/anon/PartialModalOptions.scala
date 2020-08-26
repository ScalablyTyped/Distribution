package typings.materializeCss.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ModalOptions> */
@js.native
trait PartialModalOptions extends js.Object {
  var dismissible: js.UndefOr[Boolean] = js.native
  var endingTop: js.UndefOr[String] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var outDuration: js.UndefOr[Double] = js.native
  var preventScrolling: js.UndefOr[Boolean] = js.native
  var startingTop: js.UndefOr[String] = js.native
}

object PartialModalOptions {
  @scala.inline
  def apply(): PartialModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalOptions]
  }
  @scala.inline
  implicit class PartialModalOptionsOps[Self <: PartialModalOptions] (val x: Self) extends AnyVal {
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
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setEndingTop(value: String): Self = this.set("endingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndingTop: Self = this.set("endingTop", js.undefined)
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInDuration: Self = this.set("inDuration", js.undefined)
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit]): Self = this.set("onCloseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseEnd: Self = this.set("onCloseEnd", js.undefined)
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit]): Self = this.set("onCloseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseStart: Self = this.set("onCloseStart", js.undefined)
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit]): Self = this.set("onOpenEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenEnd: Self = this.set("onOpenEnd", js.undefined)
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit]): Self = this.set("onOpenStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenStart: Self = this.set("onOpenStart", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutDuration: Self = this.set("outDuration", js.undefined)
    @scala.inline
    def setPreventScrolling(value: Boolean): Self = this.set("preventScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventScrolling: Self = this.set("preventScrolling", js.undefined)
    @scala.inline
    def setStartingTop(value: String): Self = this.set("startingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingTop: Self = this.set("startingTop", js.undefined)
  }
  
}

