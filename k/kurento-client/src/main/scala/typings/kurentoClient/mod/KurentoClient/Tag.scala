package typings.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var key: String
  var value: String
}

object Tag {
  @scala.inline
  def apply(key: String, value: String): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

