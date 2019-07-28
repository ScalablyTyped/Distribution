package typings.intlDashFormatDashCache

import typings.intlDashFormatDashCache.Anon_Args
import typings.std.ConstructorParameters
import typings.std.IntlNs.DateTimeFormat
import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intlDashFormatDashCacheMod {
  type CacheValue = NumberFormat | DateTimeFormat | PluralRules | js.Any
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ Anon_Args, 
    /* cache */ js.UndefOr[Record[String, CacheValue]], 
    js.Function1[/* args */ ConstructorParameters[Anon_Args], js.Any]
  ]
}
