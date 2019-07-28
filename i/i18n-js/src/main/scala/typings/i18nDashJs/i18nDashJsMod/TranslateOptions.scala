package typings.i18nDashJs.i18nDashJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.i18nDashJs.Anon_Message
import typings.i18nDashJs.Anon_Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends InterpolateOptions {
  var defaultValue: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[js.Array[Anon_Message | Anon_Scope]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

object TranslateOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    defaultValue: String = null,
    defaults: js.Array[Anon_Message | Anon_Scope] = null,
    message: String = null,
    scope: Scope = null
  ): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (message != null) __obj.updateDynamic("message")(message)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
}

