package typings.materializeCss.anon

import typings.materializeCss.M.Materialbox
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.MaterialboxOptions> */
@js.native
trait PartialMaterialboxOptionsInDuration extends js.Object {
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  var outDuration: js.UndefOr[Double] = js.native
}

object PartialMaterialboxOptionsInDuration {
  @scala.inline
  def apply(): PartialMaterialboxOptionsInDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMaterialboxOptionsInDuration]
  }
  @scala.inline
  implicit class PartialMaterialboxOptionsInDurationOps[Self <: PartialMaterialboxOptionsInDuration] (val x: Self) extends AnyVal {
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
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInDuration: Self = this.set("inDuration", js.undefined)
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = this.set("onCloseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseEnd: Self = this.set("onCloseEnd", js.undefined)
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = this.set("onCloseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseStart: Self = this.set("onCloseStart", js.undefined)
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = this.set("onOpenEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenEnd: Self = this.set("onOpenEnd", js.undefined)
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = this.set("onOpenStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenStart: Self = this.set("onOpenStart", js.undefined)
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutDuration: Self = this.set("outDuration", js.undefined)
  }
  
}

