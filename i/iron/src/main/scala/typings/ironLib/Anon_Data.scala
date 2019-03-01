package typings
package ironLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var key: ironLib.ironMod.Key
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, key: ironLib.ironMod.Key): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Data]
  }
}

