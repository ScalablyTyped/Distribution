package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Side extends js.Object {
  var side: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_Side {
  @scala.inline
  def apply(side: String = null, size: String = null): Anon_Side = {
    val __obj = js.Dynamic.literal()
    if (side != null) __obj.updateDynamic("side")(side)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Side]
  }
}

