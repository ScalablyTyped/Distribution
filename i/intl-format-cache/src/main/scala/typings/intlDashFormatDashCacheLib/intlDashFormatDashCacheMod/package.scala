package typings
package intlDashFormatDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intlDashFormatDashCacheMod {
  type CacheValue = stdLib.IntlNs.NumberFormat | stdLib.IntlNs.DateTimeFormat | stdLib.IntlNs.PluralRules | js.Any
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ intlDashFormatDashCacheLib.Anon_Args, 
    /* cache */ js.UndefOr[stdLib.Record[java.lang.String, CacheValue]], 
    js.Function1[
      /* args */ stdLib.ConstructorParameters[intlDashFormatDashCacheLib.Anon_Args], 
      js.Any
    ]
  ]
}
