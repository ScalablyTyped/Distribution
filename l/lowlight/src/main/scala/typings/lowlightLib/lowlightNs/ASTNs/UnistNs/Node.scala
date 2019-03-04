package typings
package lowlightLib.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var position: js.UndefOr[Location] = js.undefined
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(`type`: java.lang.String, data: Data = null, position: Location = null): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Node]
  }
}

