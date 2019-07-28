package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxFileResult[T] extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[IResponseStatus] = js.undefined
}

object IAjaxFileResult {
  @scala.inline
  def apply[T](data: js.Any = null, error: js.Any = null, status: IResponseStatus = null): IAjaxFileResult[T] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[IAjaxFileResult[T]]
  }
}

