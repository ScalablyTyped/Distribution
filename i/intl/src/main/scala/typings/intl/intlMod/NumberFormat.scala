package typings.intl.intlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", "NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[typings.std.IntlNs.NumberFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ NumberFormatOptions, 
      typings.std.IntlNs.NumberFormat
    ]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.IntlNs.NumberFormat
    ] {
  def apply(): typings.std.IntlNs.NumberFormat = js.native
  def apply(locales: String): typings.std.IntlNs.NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): typings.std.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[String]): typings.std.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): typings.std.IntlNs.NumberFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}

