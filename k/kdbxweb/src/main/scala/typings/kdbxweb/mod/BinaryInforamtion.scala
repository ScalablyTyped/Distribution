package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryInforamtion extends js.Object {
  var ref: String
  var value: ProtectedValue | ArrayBuffer
}

object BinaryInforamtion {
  @scala.inline
  def apply(ref: String, value: ProtectedValue | ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryInforamtion]
  }
}

