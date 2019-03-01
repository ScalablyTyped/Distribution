package typings
package luxonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends js.Object {
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Separator {
  @scala.inline
  def apply(separator: java.lang.String = null): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_Separator]
  }
}

