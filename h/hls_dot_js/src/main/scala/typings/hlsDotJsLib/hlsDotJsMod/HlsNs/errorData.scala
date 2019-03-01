package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait errorData extends js.Object {
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var context: js.UndefOr[LoaderContext] = js.undefined
  var details: java.lang.String
  var fatal: scala.Boolean
  var frag: js.UndefOr[Fragment] = js.undefined
  var levelRetry: js.UndefOr[scala.Boolean] = js.undefined
  var loader: js.UndefOr[Loader] = js.undefined
  var networkDetails: js.UndefOr[stdLib.XMLHttpRequest] = js.undefined
  var response: js.UndefOr[LoaderError] = js.undefined
  var `type`: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object errorData {
  @scala.inline
  def apply(
    details: java.lang.String,
    fatal: scala.Boolean,
    `type`: java.lang.String,
    buffer: scala.Int | scala.Double = null,
    context: LoaderContext = null,
    frag: Fragment = null,
    levelRetry: js.UndefOr[scala.Boolean] = js.undefined,
    loader: Loader = null,
    networkDetails: stdLib.XMLHttpRequest = null,
    response: LoaderError = null,
    url: java.lang.String = null
  ): errorData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("fatal")(fatal)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (frag != null) __obj.updateDynamic("frag")(frag)
    if (!js.isUndefined(levelRetry)) __obj.updateDynamic("levelRetry")(levelRetry)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (networkDetails != null) __obj.updateDynamic("networkDetails")(networkDetails)
    if (response != null) __obj.updateDynamic("response")(response)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[errorData]
  }
}

