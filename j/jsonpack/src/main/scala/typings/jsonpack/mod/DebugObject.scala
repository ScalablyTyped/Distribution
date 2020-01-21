package typings.jsonpack.mod

import typings.jsonpack.AnonFloats
import typings.jsonpack.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugObject extends js.Object {
  var ast: js.Array[AnonIndex]
  var dictionary: AnonFloats
  var packed: String
}

object DebugObject {
  @scala.inline
  def apply(ast: js.Array[AnonIndex], dictionary: AnonFloats, packed: String): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DebugObject]
  }
}

