package typings.intl.intlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", "DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typings.std.IntlNs.DateTimeFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      typings.std.IntlNs.DateTimeFormat
    ]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.IntlNs.DateTimeFormat
    ] {
  def apply(): typings.std.IntlNs.DateTimeFormat = js.native
  def apply(locales: String): typings.std.IntlNs.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typings.std.IntlNs.DateTimeFormat = js.native
  def apply(locales: js.Array[String]): typings.std.IntlNs.DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): typings.std.IntlNs.DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}

