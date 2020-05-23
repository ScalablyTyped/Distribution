package typings.jfs.mod

import typings.jfs.jfsStrings.memory
import typings.jfs.jfsStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pretty: js.UndefOr[Boolean] = js.undefined
  var saveId: js.UndefOr[Boolean | String] = js.undefined
  var `type`: js.UndefOr[single | memory] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pretty: js.UndefOr[Boolean] = js.undefined,
    saveId: Boolean | String = null,
    `type`: single | memory = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (saveId != null) __obj.updateDynamic("saveId")(saveId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

