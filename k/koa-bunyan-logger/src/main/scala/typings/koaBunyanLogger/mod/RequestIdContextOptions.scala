package typings.koaBunyanLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestIdContextOptions extends js.Object {
  var field: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var prop: js.UndefOr[String] = js.native
  var requestProp: js.UndefOr[String] = js.native
}

object RequestIdContextOptions {
  @scala.inline
  def apply(): RequestIdContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestIdContextOptions]
  }
  @scala.inline
  implicit class RequestIdContextOptionsOps[Self <: RequestIdContextOptions] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    @scala.inline
    def setRequestProp(value: String): Self = this.set("requestProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestProp: Self = this.set("requestProp", js.undefined)
  }
  
}

