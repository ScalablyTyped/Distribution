package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchDefault extends js.Object {
  /**
    * the alternative schema type if no cases matched.
    * Only one otherwise statement is allowed in switch as the last array item.
    */
  var otherwise: SchemaLike
}

object SwitchDefault {
  @scala.inline
  def apply(otherwise: SchemaLike = null): SwitchDefault = {
    val __obj = js.Dynamic.literal()
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchDefault]
  }
}

