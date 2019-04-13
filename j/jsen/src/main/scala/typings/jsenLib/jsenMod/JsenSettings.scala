package typings
package jsenLib.jsenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenSettings extends js.Object {
  var formats: js.UndefOr[JsenFormats] = js.undefined
  var greedy: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("missing$Ref")
  var missing$Ref: js.UndefOr[scala.Boolean] = js.undefined
  var schemas: js.UndefOr[js.Any] = js.undefined
}

object JsenSettings {
  @scala.inline
  def apply(
    formats: JsenFormats = null,
    greedy: js.UndefOr[scala.Boolean] = js.undefined,
    missing$Ref: js.UndefOr[scala.Boolean] = js.undefined,
    schemas: js.Any = null
  ): JsenSettings = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    if (!js.isUndefined(missing$Ref)) __obj.updateDynamic("missing$Ref")(missing$Ref)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[JsenSettings]
  }
}

