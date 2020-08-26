package typings.greasemonkey.GM

import typings.greasemonkey.greasemonkeyBooleans.`false`
import typings.greasemonkey.greasemonkeyNumbers.`1`
import typings.greasemonkey.greasemonkeyNumbers.`2`
import typings.greasemonkey.greasemonkeyNumbers.`3`
import typings.greasemonkey.greasemonkeyNumbers.`4`
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressResponse[TContext] extends Response[TContext] {
  var lengthComputable: Boolean = js.native
  var loaded: Double = js.native
  var total: Double = js.native
}

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document | `false`,
    status: Double,
    statusText: String,
    total: Double
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
  @scala.inline
  implicit class ProgressResponseOps[Self <: ProgressResponse[_], TContext] (val x: Self with ProgressResponse[TContext]) extends AnyVal {
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
    def setLengthComputable(value: Boolean): Self = this.set("lengthComputable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

