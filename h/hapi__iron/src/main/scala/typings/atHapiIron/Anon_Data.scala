package typings.atHapiIron

import typings.atHapiIron.atHapiIronMod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer
  var key: Key
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer, key: Key): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

