package typings
package joiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[joiLib.joiMod.LanguageOptions] {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var messages: js.UndefOr[Anon_WrapArrays] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[joiLib.joiMod.LanguageOptions] = null,
    key: java.lang.String = null,
    messages: Anon_WrapArrays = null,
    root: java.lang.String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Anon_Key]
  }
}

