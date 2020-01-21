package typings.joi

import org.scalablytyped.runtime.StringDictionary
import typings.joi.mod.LanguageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends /* key */ StringDictionary[LanguageOptions] {
  var key: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[AnonWrapArrays] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[LanguageOptions] = null,
    key: String = null,
    messages: AnonWrapArrays = null,
    root: String = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

