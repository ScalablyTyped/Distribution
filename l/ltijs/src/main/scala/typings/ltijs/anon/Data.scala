package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var iv: String
}

object Data {
  @scala.inline
  def apply(data: String, iv: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

