package typings.materializeCss.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
@js.native
trait PartialTapTargetOptions extends js.Object {
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.native
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.native
}

object PartialTapTargetOptions {
  @scala.inline
  def apply(): PartialTapTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTapTargetOptions]
  }
  @scala.inline
  implicit class PartialTapTargetOptionsOps[Self <: PartialTapTargetOptions] (val x: Self) extends AnyVal {
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
    def setOnClose(value: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
  }
  
}

