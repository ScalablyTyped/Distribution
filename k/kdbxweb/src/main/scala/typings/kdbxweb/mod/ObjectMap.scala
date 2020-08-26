package typings.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMap extends js.Object {
  var deleted: js.Array[KdbxObject] = js.native
  var objects: js.Array[KdbxObject] = js.native
  var remote: js.Array[KdbxObject] = js.native
}

object ObjectMap {
  @scala.inline
  def apply(deleted: js.Array[KdbxObject], objects: js.Array[KdbxObject], remote: js.Array[KdbxObject]): ObjectMap = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMap]
  }
  @scala.inline
  implicit class ObjectMapOps[Self <: ObjectMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeletedVarargs(value: KdbxObject*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[KdbxObject]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectsVarargs(value: KdbxObject*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[KdbxObject]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteVarargs(value: KdbxObject*): Self = this.set("remote", js.Array(value :_*))
    @scala.inline
    def setRemote(value: js.Array[KdbxObject]): Self = this.set("remote", value.asInstanceOf[js.Any])
  }
  
}

