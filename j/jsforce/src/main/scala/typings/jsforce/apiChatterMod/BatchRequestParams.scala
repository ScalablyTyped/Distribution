package typings.jsforce.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestParams extends RequestParams {
  var richInput: js.UndefOr[String] = js.undefined
}

object BatchRequestParams {
  @scala.inline
  def apply(method: String, url: String, body: String = null, richInput: String = null): BatchRequestParams = {
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (richInput != null) __obj.updateDynamic("richInput")(richInput)
    __obj.asInstanceOf[BatchRequestParams]
  }
}

