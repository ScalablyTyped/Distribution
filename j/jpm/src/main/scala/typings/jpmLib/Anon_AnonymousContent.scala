package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousContent[ResponseType] extends js.Object {
  var anonymous: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* response */ jpmLib.sdkRequestMod.STResponse[ResponseType], _]] = js.undefined
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String | jpmLib.FFAddonSDKNs.SDKURL] = js.undefined
}

object Anon_AnonymousContent {
  @scala.inline
  def apply[ResponseType](
    anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | js.Object = null,
    contentType: java.lang.String = null,
    headers: js.Object = null,
    onComplete: /* response */ jpmLib.sdkRequestMod.STResponse[ResponseType] => _ = null,
    overrideMimeType: java.lang.String = null,
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL = null
  ): Anon_AnonymousContent[ResponseType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousContent[ResponseType]]
  }
}

