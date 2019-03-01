package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var method: java.lang.String
  var url: java.lang.String
}

object RequestParams {
  @scala.inline
  def apply(method: java.lang.String, url: java.lang.String, body: java.lang.String = null): RequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[RequestParams]
  }
}

