package typings.intlDashFormatDashCache

import typings.intlDashFormatDashCache.libMod.CacheValue
import typings.intlDashFormatDashCache.libMod.MemoizeFormatConstructorFn
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-format-cache/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val default: MemoizeFormatConstructorFn = js.native
  type CacheValue = NumberFormat | DateTimeFormat | PluralRules | js.Any
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ Anon_Args, 
    /* cache */ js.UndefOr[Record[String, CacheValue]], 
    js.Function1[/* args */ ConstructorParameters[Anon_Args], js.Any]
  ]
}

