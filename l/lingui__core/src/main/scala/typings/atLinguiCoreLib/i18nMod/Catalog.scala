package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Catalog extends js.Object {
  var languageData: js.UndefOr[LanguageData] = js.undefined
  var messages: Messages
}

object Catalog {
  @scala.inline
  def apply(messages: Messages, languageData: LanguageData = null): Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messages")(messages)
    if (languageData != null) __obj.updateDynamic("languageData")(languageData)
    __obj.asInstanceOf[Catalog]
  }
}

