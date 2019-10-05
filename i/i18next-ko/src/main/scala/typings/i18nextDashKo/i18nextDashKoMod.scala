package typings.i18nextDashKo

import org.scalablytyped.runtime.StringDictionary
import typings.i18nextDashKo.i18nextDashKoMod.i18nextkoResourceStore
import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-ko", JSImport.Namespace)
@js.native
object i18nextDashKoMod extends js.Object {
  val i18n: typings.i18next.i18nextMod.i18n = js.native
  def init(resourceStore: i18nextkoResourceStore, language: String, ko: KnockoutStatic): Unit = js.native
  def setLanguage(language: String): Unit = js.native
  def t(key: String): KnockoutComputed[String] = js.native
  type i18nextkoResourceStore = StringDictionary[Anon_Key]
}

