package typings.atJupyterlabCoreutils

import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Composite extends js.Object {
  var composite: JSONValue
  var user: JSONValue
}

object Anon_Composite {
  @scala.inline
  def apply(composite: JSONValue = null, user: JSONValue = null): Anon_Composite = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Composite]
  }
}

