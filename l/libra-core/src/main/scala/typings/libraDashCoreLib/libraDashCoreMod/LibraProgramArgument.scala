package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraProgramArgument extends js.Object {
  var `type`: LibraProgramArgumentType
  var value: stdLib.Uint8Array
}

object LibraProgramArgument {
  @scala.inline
  def apply(`type`: LibraProgramArgumentType, value: stdLib.Uint8Array): LibraProgramArgument = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LibraProgramArgument]
  }
}

