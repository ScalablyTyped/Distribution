package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var allowedSchemas: js.UndefOr[String | js.Array[String]] = js.undefined
  var blacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  var exceptions: js.UndefOr[String | js.Array[String]] = js.undefined
  var functionBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  var functionWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  var scripts: js.UndefOr[String] = js.undefined
  var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Loader {
  @scala.inline
  def apply(
    allowedSchemas: String | js.Array[String] = null,
    blacklist: String | js.Array[String] = null,
    exceptions: String | js.Array[String] = null,
    functionBlacklist: String | js.Array[String] = null,
    functionWhitelist: String | js.Array[String] = null,
    scripts: String = null,
    whitelist: String | js.Array[String] = null
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (allowedSchemas != null) __obj.updateDynamic("allowedSchemas")(allowedSchemas.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions.asInstanceOf[js.Any])
    if (functionBlacklist != null) __obj.updateDynamic("functionBlacklist")(functionBlacklist.asInstanceOf[js.Any])
    if (functionWhitelist != null) __obj.updateDynamic("functionWhitelist")(functionWhitelist.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

