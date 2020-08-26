package typings.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingKeyHandlerOptions extends js.Object {
  var lngParam: js.UndefOr[String] = js.native
  var nsParam: js.UndefOr[String] = js.native
}

object MissingKeyHandlerOptions {
  @scala.inline
  def apply(): MissingKeyHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissingKeyHandlerOptions]
  }
  @scala.inline
  implicit class MissingKeyHandlerOptionsOps[Self <: MissingKeyHandlerOptions] (val x: Self) extends AnyVal {
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
    def setLngParam(value: String): Self = this.set("lngParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLngParam: Self = this.set("lngParam", js.undefined)
    @scala.inline
    def setNsParam(value: String): Self = this.set("nsParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsParam: Self = this.set("nsParam", js.undefined)
  }
  
}

