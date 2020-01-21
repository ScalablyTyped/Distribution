package typings.hapiIron.mod.password

import typings.hapiIron.mod.Password_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  Secret object with optional id.
  */
trait Secret extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var secret: Password_
}

object Secret {
  @scala.inline
  def apply(secret: Password_, id: String = null): Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}

