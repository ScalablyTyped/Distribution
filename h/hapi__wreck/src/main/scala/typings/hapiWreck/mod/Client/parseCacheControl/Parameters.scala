package typings.hapiWreck.mod.Client.parseCacheControl

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  var `max-age`: js.UndefOr[Double] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double]] = null,
    `max-age`: js.UndefOr[Double] = js.undefined
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`max-age`)) __obj.updateDynamic("max-age")(`max-age`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

