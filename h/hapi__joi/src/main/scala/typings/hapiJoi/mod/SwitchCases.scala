package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCases extends js.Object {
  /**
    * the required condition joi type.
    */
  var is: SchemaLike
  /**
    * the alternative schema type if the condition is true.
    */
  var `then`: SchemaLike
}

object SwitchCases {
  @scala.inline
  def apply(is: SchemaLike = null, `then`: SchemaLike = null): SwitchCases = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCases]
  }
}

