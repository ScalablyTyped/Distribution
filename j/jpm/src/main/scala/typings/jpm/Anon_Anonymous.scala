package typings.jpm

import typings.jpm.FFAddonSDKNs.SDKURL
import typings.jpm.sdkRequestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anonymous extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | js.Object] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* response */ Response, _]] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | SDKURL] = js.undefined
}

object Anon_Anonymous {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    content: String | js.Object = null,
    contentType: String = null,
    headers: js.Object = null,
    onComplete: /* response */ Response => _ = null,
    overrideMimeType: String = null,
    url: String | SDKURL = null
  ): Anon_Anonymous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Anonymous]
  }
}

