package typings
package hexoLib.hexoMod.HexoNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: java.lang.String | nodeLib.Buffer | Callback
  var modified: scala.Boolean
}

object Data {
  @scala.inline
  def apply(data: java.lang.String | nodeLib.Buffer | Callback, modified: scala.Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], modified = modified)
  
    __obj.asInstanceOf[Data]
  }
}

