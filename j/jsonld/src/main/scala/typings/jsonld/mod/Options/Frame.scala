package typings.jsonld.mod.Options

import typings.jsonld.jsonldStrings.`@always`
import typings.jsonld.jsonldStrings.`@last`
import typings.jsonld.jsonldStrings.`@link`
import typings.jsonld.jsonldStrings.`@never`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var embed: js.UndefOr[`@last` | `@always` | `@never` | `@link`] = js.undefined
  var explicit: js.UndefOr[Boolean] = js.undefined
  var omitDefault: js.UndefOr[Boolean] = js.undefined
  var requireAll: js.UndefOr[Boolean] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    embed: `@last` | `@always` | `@never` | `@link` = null,
    explicit: js.UndefOr[Boolean] = js.undefined,
    omitDefault: js.UndefOr[Boolean] = js.undefined,
    requireAll: js.UndefOr[Boolean] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (!js.isUndefined(explicit)) __obj.updateDynamic("explicit")(explicit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitDefault)) __obj.updateDynamic("omitDefault")(omitDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAll)) __obj.updateDynamic("requireAll")(requireAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

