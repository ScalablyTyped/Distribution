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

