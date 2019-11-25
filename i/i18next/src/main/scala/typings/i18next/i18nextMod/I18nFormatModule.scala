package typings.i18next.i18nextMod

import typings.i18next.i18nextStrings.i18nFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nFormatModule extends Module {
  @JSName("type")
  var type_I18nFormatModule: i18nFormat
}

object I18nFormatModule {
  @scala.inline
  def apply(`type`: i18nFormat): I18nFormatModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nFormatModule]
  }
}

