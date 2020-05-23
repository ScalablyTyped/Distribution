package typings.iron.anon

import typings.iron.mod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Buffer
  var key: Key
}

object Data {
  @scala.inline
  def apply(data: Buffer, key: Key): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

