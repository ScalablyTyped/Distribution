package typings.jsonpack.jsonpackMod

import typings.jsonpack.Anon_Floats
import typings.jsonpack.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugObject extends js.Object {
  var ast: js.Array[Anon_Index]
  var dictionary: Anon_Floats
  var packed: String
}

object DebugObject {
  @scala.inline
  def apply(ast: js.Array[Anon_Index], dictionary: Anon_Floats, packed: String): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DebugObject]
  }
}

