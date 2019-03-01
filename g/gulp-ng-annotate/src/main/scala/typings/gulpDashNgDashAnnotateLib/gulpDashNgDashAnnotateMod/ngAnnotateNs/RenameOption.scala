package typings
package gulpDashNgDashAnnotateLib.gulpDashNgDashAnnotateMod.ngAnnotateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOption extends js.Object {
  var from: java.lang.String
  var to: java.lang.String
}

object RenameOption {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): RenameOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RenameOption]
  }
}

