package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlMessageFormat extends js.Object {
  def format(arg: js.Any): java.lang.String
  def resolvedOptions(): intlDashMessageformatLib.Anon_Locale
}

object IntlMessageFormat {
  @scala.inline
  def apply(
    format: js.Function1[js.Any, java.lang.String],
    resolvedOptions: js.Function0[intlDashMessageformatLib.Anon_Locale]
  ): IntlMessageFormat = {
    val __obj = js.Dynamic.literal(format = format, resolvedOptions = resolvedOptions)
  
    __obj.asInstanceOf[IntlMessageFormat]
  }
}

