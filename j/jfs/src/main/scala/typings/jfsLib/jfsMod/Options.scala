package typings
package jfsLib.jfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var saveId: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var `type`: js.UndefOr[jfsLib.jfsLibStrings.single | jfsLib.jfsLibStrings.memory] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    saveId: scala.Boolean | java.lang.String = null,
    `type`: jfsLib.jfsLibStrings.single | jfsLib.jfsLibStrings.memory = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (saveId != null) __obj.updateDynamic("saveId")(saveId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

