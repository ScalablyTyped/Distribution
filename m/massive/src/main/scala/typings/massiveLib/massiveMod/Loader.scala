package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var allowedSchemas: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var blacklist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var exceptions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var functionBlacklist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var functionWhitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scripts: js.UndefOr[java.lang.String] = js.undefined
  var whitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Loader {
  @scala.inline
  def apply(
    allowedSchemas: java.lang.String | js.Array[java.lang.String] = null,
    blacklist: java.lang.String | js.Array[java.lang.String] = null,
    exceptions: java.lang.String | js.Array[java.lang.String] = null,
    functionBlacklist: java.lang.String | js.Array[java.lang.String] = null,
    functionWhitelist: java.lang.String | js.Array[java.lang.String] = null,
    scripts: java.lang.String = null,
    whitelist: java.lang.String | js.Array[java.lang.String] = null
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (allowedSchemas != null) __obj.updateDynamic("allowedSchemas")(allowedSchemas.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions.asInstanceOf[js.Any])
    if (functionBlacklist != null) __obj.updateDynamic("functionBlacklist")(functionBlacklist.asInstanceOf[js.Any])
    if (functionWhitelist != null) __obj.updateDynamic("functionWhitelist")(functionWhitelist.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

