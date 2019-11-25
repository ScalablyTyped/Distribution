package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
}

object Anon_Separator {
  @scala.inline
  def apply(separator: String = null): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Separator]
  }
}

