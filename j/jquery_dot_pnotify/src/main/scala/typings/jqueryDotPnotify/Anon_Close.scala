package typings.jqueryDotPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var stick: js.UndefOr[String] = js.undefined
  var unstick: js.UndefOr[String] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(close: String = null, stick: String = null, unstick: String = null): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (stick != null) __obj.updateDynamic("stick")(stick)
    if (unstick != null) __obj.updateDynamic("unstick")(unstick)
    __obj.asInstanceOf[Anon_Close]
  }
}

