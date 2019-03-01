package typings
package i18nDashJsLib.i18nDashJsMod.I18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends InterpolateOptions {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var defaults: js.UndefOr[js.Array[i18nDashJsLib.Anon_Message | i18nDashJsLib.Anon_Scope]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

object TranslateOptions {
  @scala.inline
  def apply(
    defaultValue: java.lang.String = null,
    defaults: js.Array[i18nDashJsLib.Anon_Message | i18nDashJsLib.Anon_Scope] = null,
    message: java.lang.String = null,
    scope: Scope = null
  ): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (message != null) __obj.updateDynamic("message")(message)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
}

