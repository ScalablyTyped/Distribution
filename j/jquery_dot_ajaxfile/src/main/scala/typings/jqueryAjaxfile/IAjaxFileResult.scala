package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAjaxFileResult[T] extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var status: js.UndefOr[IResponseStatus] = js.native
}

object IAjaxFileResult {
  @scala.inline
  def apply[T](): IAjaxFileResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxFileResult[T]]
  }
  @scala.inline
  implicit class IAjaxFileResultOps[Self <: IAjaxFileResult[_], T] (val x: Self with IAjaxFileResult[T]) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setStatus(value: IResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

