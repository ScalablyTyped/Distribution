package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  // <optional> Just return the content URI, rather than the whole body. Defaults to false (except on browsers, where it defaults to true for backwards compatibility).
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var includeFilename: Boolean = js.native
  // <optional> Return the raw body, rather than parsing the JSON. Defaults to false (except on node.js, where it defaults to true for backwards compatibility).
  var onlyContentUri: Boolean = js.native
  // <optional> Content-type for the upload. Defaults to file.type, or applicaton/octet-stream.
  var rawResponse: Boolean = js.native
  // <optional> if false will not send the filename, e.g for encrypted file uploads where filename leaks are undesirable. Defaults to true.
  var `type`: String = js.native
  // <optional> Deprecated. Optional. The callback to invoke on success/failure. See the promise return values for more information.
  def progressHandler(args: js.Any*): js.Any = js.native
}

object Callback {
  @scala.inline
  def apply(
    includeFilename: Boolean,
    onlyContentUri: Boolean,
    progressHandler: /* repeated */ js.Any => js.Any,
    rawResponse: Boolean,
    `type`: String
  ): Callback = {
    val __obj = js.Dynamic.literal(includeFilename = includeFilename.asInstanceOf[js.Any], onlyContentUri = onlyContentUri.asInstanceOf[js.Any], progressHandler = js.Any.fromFunction1(progressHandler), rawResponse = rawResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setIncludeFilename(value: Boolean): Self = this.set("includeFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyContentUri(value: Boolean): Self = this.set("onlyContentUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressHandler(value: /* repeated */ js.Any => js.Any): Self = this.set("progressHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setRawResponse(value: Boolean): Self = this.set("rawResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: /* repeated */ js.Any => _): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
  }
  
}

