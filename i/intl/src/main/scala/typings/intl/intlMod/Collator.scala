package typings.intl.intlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", "Collator")
@js.native
object Collator
  extends Instantiable0[typings.std.IntlNs.Collator]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ CollatorOptions, 
      typings.std.IntlNs.Collator
    ]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.IntlNs.Collator
    ] {
  def apply(): typings.std.IntlNs.Collator = js.native
  def apply(locales: String): typings.std.IntlNs.Collator = js.native
  def apply(locales: String, options: CollatorOptions): typings.std.IntlNs.Collator = js.native
  def apply(locales: js.Array[String]): typings.std.IntlNs.Collator = js.native
  def apply(locales: js.Array[String], options: CollatorOptions): typings.std.IntlNs.Collator = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: CollatorOptions): js.Array[String] = js.native
}

