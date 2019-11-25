package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBase extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var base: js.UndefOr[String] = js.undefined
}

object Anon_ActiveBase {
  @scala.inline
  def apply(active: String = null, base: String = null): Anon_ActiveBase = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveBase]
  }
}

