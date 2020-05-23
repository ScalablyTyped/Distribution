package typings.jsonpack.mod

import typings.jsonpack.anon.Floats
import typings.jsonpack.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugObject extends js.Object {
  var ast: js.Array[Index]
  var dictionary: Floats
  var packed: String
}

object DebugObject {
  @scala.inline
  def apply(ast: js.Array[Index], dictionary: Floats, packed: String): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugObject]
  }
}

