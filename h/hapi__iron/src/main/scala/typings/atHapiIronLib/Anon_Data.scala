package typings
package atHapiIronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var key: atHapiIronLib.atHapiIronMod.Key
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, key: atHapiIronLib.atHapiIronMod.Key): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, key = key)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

