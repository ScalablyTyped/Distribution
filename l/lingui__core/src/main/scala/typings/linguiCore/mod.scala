package typings.linguiCore

import typings.linguiCore.i18nMod.setupI18nProps
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/core", "I18n")
  @js.native
  class I18n_ ()
    extends typings.linguiCore.i18nMod.I18n_
  
  @JSImport("@lingui/core", "date")
  @js.native
  def date(language: String): js.Function1[/* value */ Date, String] = js.native
  @JSImport("@lingui/core", "date")
  @js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = js.native
  
  @JSImport("@lingui/core", "i18n")
  @js.native
  val i18n: typings.linguiCore.i18nMod.I18n_ = js.native
  
  @JSImport("@lingui/core", "i18nMark")
  @js.native
  def i18nMark(id: String): String = js.native
  
  @JSImport("@lingui/core", "number")
  @js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  @JSImport("@lingui/core", "number")
  @js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
  
  @JSImport("@lingui/core", "setupI18n")
  @js.native
  def setupI18n(): typings.linguiCore.i18nMod.I18n_ = js.native
  @JSImport("@lingui/core", "setupI18n")
  @js.native
  def setupI18n(params: setupI18nProps): typings.linguiCore.i18nMod.I18n_ = js.native
}
