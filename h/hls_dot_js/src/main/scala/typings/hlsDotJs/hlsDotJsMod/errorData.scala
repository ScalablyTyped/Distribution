package typings.hlsDotJs.hlsDotJsMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait errorData extends js.Object {
  var buffer: js.UndefOr[Double] = js.undefined
  var context: js.UndefOr[LoaderContext] = js.undefined
  var details: String
  var fatal: Boolean
  var frag: js.UndefOr[Fragment] = js.undefined
  var levelRetry: js.UndefOr[Boolean] = js.undefined
  var loader: js.UndefOr[Loader] = js.undefined
  var networkDetails: js.UndefOr[XMLHttpRequest] = js.undefined
  var response: js.UndefOr[LoaderError] = js.undefined
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
}

object errorData {
  @scala.inline
  def apply(
    details: String,
    fatal: Boolean,
    `type`: String,
    buffer: Int | Double = null,
    context: LoaderContext = null,
    frag: Fragment = null,
    levelRetry: js.UndefOr[Boolean] = js.undefined,
    loader: Loader = null,
    networkDetails: XMLHttpRequest = null,
    response: LoaderError = null,
    url: String = null
  ): errorData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (frag != null) __obj.updateDynamic("frag")(frag.asInstanceOf[js.Any])
    if (!js.isUndefined(levelRetry)) __obj.updateDynamic("levelRetry")(levelRetry.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (networkDetails != null) __obj.updateDynamic("networkDetails")(networkDetails.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[errorData]
  }
}

