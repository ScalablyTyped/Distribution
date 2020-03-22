package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-ko", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val i18n: typings.i18next.mod.i18n = js.native
  def init(resourceStore: i18nextkoResourceStore, language: String, ko: KnockoutStatic): Unit = js.native
  def setLanguage(language: String): Unit = js.native
  def t(key: String): KnockoutComputed[String] = js.native
  type i18nextkoResourceStore = StringDictionary[AnonTranslation]
}

