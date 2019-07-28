package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[String] = js.undefined
  var incomplete: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(close: String = null, complete: String = null, incomplete: String = null, open: String = null): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_Close]
  }
}

