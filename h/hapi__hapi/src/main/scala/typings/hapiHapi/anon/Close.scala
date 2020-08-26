package typings.hapiHapi.anon

import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close extends js.Object {
  var close: js.UndefOr[js.Function1[/* response */ ResponseObject, Unit]] = js.native
  var marshal: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseValue]]] = js.native
  var prepare: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseObject]]] = js.native
  var variety: js.UndefOr[String] = js.native
}

object Close {
  @scala.inline
  def apply(): Close = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
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
    def setClose(value: /* response */ ResponseObject => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setMarshal(value: /* response */ ResponseObject => js.Promise[ResponseValue]): Self = this.set("marshal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarshal: Self = this.set("marshal", js.undefined)
    @scala.inline
    def setPrepare(value: /* response */ ResponseObject => js.Promise[ResponseObject]): Self = this.set("prepare", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    @scala.inline
    def setVariety(value: String): Self = this.set("variety", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariety: Self = this.set("variety", js.undefined)
  }
  
}

