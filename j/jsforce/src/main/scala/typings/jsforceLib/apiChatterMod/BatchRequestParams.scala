package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestParams extends RequestParams {
  var richInput: js.UndefOr[java.lang.String] = js.undefined
}

object BatchRequestParams {
  @scala.inline
  def apply(
    method: java.lang.String,
    url: java.lang.String,
    body: java.lang.String = null,
    richInput: java.lang.String = null
  ): BatchRequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (richInput != null) __obj.updateDynamic("richInput")(richInput)
    __obj.asInstanceOf[BatchRequestParams]
  }
}

