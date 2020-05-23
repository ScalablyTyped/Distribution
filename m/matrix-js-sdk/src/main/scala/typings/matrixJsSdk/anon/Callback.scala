package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  // <optional> Just return the content URI, rather than the whole body. Defaults to false (except on browsers, where it defaults to true for backwards compatibility).
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var includeFilename: Boolean
  // <optional> Return the raw body, rather than parsing the JSON. Defaults to false (except on node.js, where it defaults to true for backwards compatibility).
  var onlyContentUri: Boolean
  // <optional> Content-type for the upload. Defaults to file.type, or applicaton/octet-stream.
  var rawResponse: Boolean
  // <optional> if false will not send the filename, e.g for encrypted file uploads where filename leaks are undesirable. Defaults to true.
  var `type`: String
  // <optional> Deprecated. Optional. The callback to invoke on success/failure. See the promise return values for more information.
  def progressHandler(args: js.Any*): js.Any
}

object Callback {
  @scala.inline
  def apply(
    includeFilename: Boolean,
    onlyContentUri: Boolean,
    progressHandler: /* repeated */ js.Any => js.Any,
    rawResponse: Boolean,
    `type`: String,
    callback: /* repeated */ js.Any => _ = null
  ): Callback = {
    val __obj = js.Dynamic.literal(includeFilename = includeFilename.asInstanceOf[js.Any], onlyContentUri = onlyContentUri.asInstanceOf[js.Any], progressHandler = js.Any.fromFunction1(progressHandler), rawResponse = rawResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[Callback]
  }
}

