package typings
package atJupyterlabCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompositeUser extends js.Object {
  var composite: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
  var user: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
}

object Anon_CompositeUser {
  @scala.inline
  def apply(
    composite: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue,
    user: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
  ): Anon_CompositeUser = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompositeUser]
  }
}

