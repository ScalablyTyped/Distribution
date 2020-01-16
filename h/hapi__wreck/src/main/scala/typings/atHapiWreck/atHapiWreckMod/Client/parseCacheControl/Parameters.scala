package typings.atHapiWreck.atHapiWreckMod.Client.parseCacheControl

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
    `max-age`: Int | Double = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`max-age` != null) __obj.updateDynamic("max-age")(`max-age`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

