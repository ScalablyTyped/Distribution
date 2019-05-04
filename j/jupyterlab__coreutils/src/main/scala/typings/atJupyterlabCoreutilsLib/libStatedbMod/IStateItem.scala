package typings
package atJupyterlabCoreutilsLib.libStatedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateItem extends js.Object {
  /**
    * The identifier key for a state item.
    */
  var id: java.lang.String
  /**
    * The data value for a state item.
    */
  var value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
}

object IStateItem {
  @scala.inline
  def apply(id: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue): IStateItem = {
    val __obj = js.Dynamic.literal(id = id, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStateItem]
  }
}

