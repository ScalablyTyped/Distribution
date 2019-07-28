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
  def apply(composite: JSONValue, user: JSONValue): Anon_Composite = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Composite]
  }
}

