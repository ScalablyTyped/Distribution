package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMap extends js.Object {
  var deleted: js.Array[KdbxObject]
  var objects: js.Array[KdbxObject]
  var remote: js.Array[KdbxObject]
}

object ObjectMap {
  @scala.inline
  def apply(deleted: js.Array[KdbxObject], objects: js.Array[KdbxObject], remote: js.Array[KdbxObject]): ObjectMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("remote")(remote)
    __obj.asInstanceOf[ObjectMap]
  }
}

