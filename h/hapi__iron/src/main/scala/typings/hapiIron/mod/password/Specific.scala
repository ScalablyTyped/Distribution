package typings.hapiIron.mod.password

import typings.hapiIron.mod.Password_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  Secret object with optional id and specified password for each encryption and integrity.
  */
trait Specific extends js.Object {
  var encryption: Password_
  var id: js.UndefOr[String] = js.undefined
  var integrity: Password_
}

object Specific {
  @scala.inline
  def apply(encryption: Password_, integrity: Password_, id: String = null): Specific = {
    val __obj = js.Dynamic.literal(encryption = encryption.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specific]
  }
}

