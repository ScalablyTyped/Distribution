package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryInforamtion extends js.Object {
  var ref: java.lang.String
  var value: ProtectedValue | stdLib.ArrayBuffer
}

object BinaryInforamtion {
  @scala.inline
  def apply(ref: java.lang.String, value: ProtectedValue | stdLib.ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryInforamtion]
  }
}

