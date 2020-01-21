package typings.jupyterlabCoreutils

import typings.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComposite extends js.Object {
  var composite: JSONValue
  var user: JSONValue
}

object AnonComposite {
  @scala.inline
  def apply(composite: JSONValue = null, user: JSONValue = null): AnonComposite = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComposite]
  }
}

