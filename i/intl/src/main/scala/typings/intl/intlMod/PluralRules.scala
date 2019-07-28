package typings.intl.intlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", "PluralRules")
@js.native
object PluralRules
  extends Instantiable0[typings.std.IntlNs.PluralRules]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ PluralRulesOptions, 
      typings.std.IntlNs.PluralRules
    ]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.IntlNs.PluralRules
    ] {
  def apply(): typings.std.IntlNs.PluralRules = js.native
  def apply(locales: String): typings.std.IntlNs.PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): typings.std.IntlNs.PluralRules = js.native
  def apply(locales: js.Array[String]): typings.std.IntlNs.PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): typings.std.IntlNs.PluralRules = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}

