package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipTo extends js.Object {
  var skipTo: js.UndefOr[String] = js.undefined
}

object SkipTo {
  @scala.inline
  def apply(skipTo: String = null): SkipTo = {
    val __obj = js.Dynamic.literal()
    if (skipTo != null) __obj.updateDynamic("skipTo")(skipTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipTo]
  }
}

