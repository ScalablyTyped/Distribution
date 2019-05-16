package typings
package jsonpackLib.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugObject extends js.Object {
  var ast: js.Array[jsonpackLib.Anon_Index]
  var dictionary: jsonpackLib.Anon_Floats
  var packed: java.lang.String
}

object DebugObject {
  @scala.inline
  def apply(
    ast: js.Array[jsonpackLib.Anon_Index],
    dictionary: jsonpackLib.Anon_Floats,
    packed: java.lang.String
  ): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast, dictionary = dictionary, packed = packed)
  
    __obj.asInstanceOf[DebugObject]
  }
}

