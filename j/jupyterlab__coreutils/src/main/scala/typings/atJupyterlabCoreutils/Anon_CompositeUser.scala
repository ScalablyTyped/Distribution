package typings.atJupyterlabCoreutils

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompositeUser extends js.Object {
  var composite: ReadonlyJSONValue
  var user: ReadonlyJSONValue
}

object Anon_CompositeUser {
  @scala.inline
  def apply(composite: ReadonlyJSONValue, user: ReadonlyJSONValue): Anon_CompositeUser = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompositeUser]
  }
}

