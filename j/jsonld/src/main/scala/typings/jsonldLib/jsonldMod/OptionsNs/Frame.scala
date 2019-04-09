package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var embed: js.UndefOr[
    jsonldLib.jsonldLibStrings.`@last` | jsonldLib.jsonldLibStrings.`@always` | jsonldLib.jsonldLibStrings.`@never` | jsonldLib.jsonldLibStrings.`@link`
  ] = js.undefined
  var explicit: js.UndefOr[scala.Boolean] = js.undefined
  var omitDefault: js.UndefOr[scala.Boolean] = js.undefined
  var requireAll: js.UndefOr[scala.Boolean] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    embed: jsonldLib.jsonldLibStrings.`@last` | jsonldLib.jsonldLibStrings.`@always` | jsonldLib.jsonldLibStrings.`@never` | jsonldLib.jsonldLibStrings.`@link` = null,
    explicit: js.UndefOr[scala.Boolean] = js.undefined,
    omitDefault: js.UndefOr[scala.Boolean] = js.undefined,
    requireAll: js.UndefOr[scala.Boolean] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (!js.isUndefined(explicit)) __obj.updateDynamic("explicit")(explicit)
    if (!js.isUndefined(omitDefault)) __obj.updateDynamic("omitDefault")(omitDefault)
    if (!js.isUndefined(requireAll)) __obj.updateDynamic("requireAll")(requireAll)
    __obj.asInstanceOf[Frame]
  }
}

