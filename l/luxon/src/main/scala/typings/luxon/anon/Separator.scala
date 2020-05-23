package typings.luxon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
}

object Separator {
  @scala.inline
  def apply(separator: String = null): Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
}

