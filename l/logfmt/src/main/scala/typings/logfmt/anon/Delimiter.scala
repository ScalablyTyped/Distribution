package typings.logfmt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(delimiter: String = null): Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

