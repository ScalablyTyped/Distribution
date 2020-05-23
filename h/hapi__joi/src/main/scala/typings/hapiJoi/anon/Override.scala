package typings.hapiJoi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Override extends js.Object {
  var `override`: Boolean
}

object Override {
  @scala.inline
  def apply(`override`: Boolean): Override = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Override]
  }
}

