package typings.jpm.anon

import typings.jpm.FFAddonSDK.SDKURL
import typings.jpm.requestMod.STResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content[ResponseType] extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | js.Object] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* response */ STResponse[ResponseType], _]] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | SDKURL] = js.undefined
}

object Content {
  @scala.inline
  def apply[ResponseType](
    anonymous: js.UndefOr[Boolean] = js.undefined,
    content: String | js.Object = null,
    contentType: String = null,
    headers: js.Object = null,
    onComplete: /* response */ STResponse[ResponseType] => _ = null,
    overrideMimeType: String = null,
    url: String | SDKURL = null
  ): Content[ResponseType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[ResponseType]]
  }
}

