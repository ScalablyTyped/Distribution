package typings.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenSettings extends js.Object {
  var formats: js.UndefOr[JsenFormats] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  @JSName("missing$Ref")
  var missing$Ref: js.UndefOr[Boolean] = js.undefined
  var schemas: js.UndefOr[js.Any] = js.undefined
}

object JsenSettings {
  @scala.inline
  def apply(
    formats: JsenFormats = null,
    greedy: js.UndefOr[Boolean] = js.undefined,
    missing$Ref: js.UndefOr[Boolean] = js.undefined,
    schemas: js.Any = null
  ): JsenSettings = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy.asInstanceOf[js.Any])
    if (!js.isUndefined(missing$Ref)) __obj.updateDynamic("missing$Ref")(missing$Ref.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsenSettings]
  }
}

