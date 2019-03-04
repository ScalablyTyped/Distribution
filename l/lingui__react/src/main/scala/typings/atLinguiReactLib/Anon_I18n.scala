package typings
package atLinguiReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18n extends js.Object {
  var i18n: atLinguiCoreLib.atLinguiCoreMod.I18n
  var i18nHash: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_I18n {
  @scala.inline
  def apply(i18n: atLinguiCoreLib.atLinguiCoreMod.I18n, i18nHash: java.lang.String = null): Anon_I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n)
    if (i18nHash != null) __obj.updateDynamic("i18nHash")(i18nHash)
    __obj.asInstanceOf[Anon_I18n]
  }
}

