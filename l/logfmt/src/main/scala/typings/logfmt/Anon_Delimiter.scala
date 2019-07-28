package typings.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(delimiter: String = null): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

