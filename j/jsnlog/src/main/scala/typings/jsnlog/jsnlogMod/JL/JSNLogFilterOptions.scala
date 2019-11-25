package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSNLogFilterOptions extends js.Object {
  var disallow: js.UndefOr[String] = js.undefined
  var ipRegex: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var userAgentRegex: js.UndefOr[String] = js.undefined
}

object JSNLogFilterOptions {
  @scala.inline
  def apply(
    disallow: String = null,
    ipRegex: String = null,
    level: Int | Double = null,
    userAgentRegex: String = null
  ): JSNLogFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (disallow != null) __obj.updateDynamic("disallow")(disallow.asInstanceOf[js.Any])
    if (ipRegex != null) __obj.updateDynamic("ipRegex")(ipRegex.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (userAgentRegex != null) __obj.updateDynamic("userAgentRegex")(userAgentRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSNLogFilterOptions]
  }
}

