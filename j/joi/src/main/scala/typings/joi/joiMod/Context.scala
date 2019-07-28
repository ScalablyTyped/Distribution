package typings.joi.joiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* key */ StringDictionary[js.Any] {
  var key: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    key: String = null,
    label: String = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Context]
  }
}

