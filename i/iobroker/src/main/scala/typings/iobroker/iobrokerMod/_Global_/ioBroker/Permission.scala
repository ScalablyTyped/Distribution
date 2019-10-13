package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** Which kind of operation is required */
  var operation: String
  /** The type of the permission */
  var `type`: String
}

object Permission {
  @scala.inline
  def apply(operation: String, `type`: String): Permission = {
    val __obj = js.Dynamic.literal(operation = operation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Permission]
  }
}

