package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var base: js.UndefOr[String] = js.undefined
}

object Base {
  @scala.inline
  def apply(active: String = null, base: String = null): Base = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

