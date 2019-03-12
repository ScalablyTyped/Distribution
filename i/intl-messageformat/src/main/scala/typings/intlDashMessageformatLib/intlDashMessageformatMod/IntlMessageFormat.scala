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
  def apply(format: js.Any => java.lang.String, resolvedOptions: () => intlDashMessageformatLib.Anon_Locale): IntlMessageFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
  
    __obj.asInstanceOf[IntlMessageFormat]
  }
}

