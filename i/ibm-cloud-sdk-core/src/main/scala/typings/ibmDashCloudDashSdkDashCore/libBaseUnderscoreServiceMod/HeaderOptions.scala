package typings.ibmDashCloudDashSdkDashCore.libBaseUnderscoreServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderOptions
  extends /* key */ StringDictionary[js.Any] {
  var `X-Watson-Learning-Opt-Out`: js.UndefOr[Boolean] = js.undefined
}

object HeaderOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `X-Watson-Learning-Opt-Out`: js.UndefOr[Boolean] = js.undefined
  ): HeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`X-Watson-Learning-Opt-Out`)) __obj.updateDynamic("X-Watson-Learning-Opt-Out")(`X-Watson-Learning-Opt-Out`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderOptions]
  }
}

