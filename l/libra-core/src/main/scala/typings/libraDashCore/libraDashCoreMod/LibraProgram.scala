package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraProgram extends js.Object {
  var arguments: js.Array[LibraProgramArgument]
  var code: Uint8Array
  var modules: js.Array[Uint8Array]
}

object LibraProgram {
  @scala.inline
  def apply(arguments: js.Array[LibraProgramArgument], code: Uint8Array, modules: js.Array[Uint8Array]): LibraProgram = {
    val __obj = js.Dynamic.literal(arguments = arguments, code = code, modules = modules)
  
    __obj.asInstanceOf[LibraProgram]
  }
}

