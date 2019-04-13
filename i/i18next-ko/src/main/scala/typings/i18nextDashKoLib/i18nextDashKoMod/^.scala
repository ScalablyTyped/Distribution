package typings
package i18nextDashKoLib.i18nextDashKoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-ko", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val i18n: i18nextLib.i18nextMod.i18n = js.native
  def init(resourceStore: i18nextkoResourceStore, language: java.lang.String, ko: knockoutLib.KnockoutStatic): scala.Unit = js.native
  def setLanguage(language: java.lang.String): scala.Unit = js.native
  def t(key: java.lang.String): knockoutLib.KnockoutComputed[java.lang.String] = js.native
}

