package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
    // <nullable> The remote room, if applicable.
  var data: Null | js.Object = js.native
  var id: String = js.native
               // "remote_room_id",
  var matrix: Null | MatrixRoom = js.native
               //  The unique ID for this entry.
  var matrix_id: String = js.native
    // <nullable> The matrix room, if applicable.
  var remote: Null | RemoteRoom = js.native
               // "room_id",
  var remote_id: String = js.native
}

object Entry {
  @scala.inline
  def apply(id: String, matrix_id: String, remote_id: String): Entry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matrix_id = matrix_id.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix_id(value: String): Self = this.set("matrix_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote_id(value: String): Self = this.set("remote_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setMatrix(value: MatrixRoom): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrixNull: Self = this.set("matrix", null)
    @scala.inline
    def setRemote(value: RemoteRoom): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteNull: Self = this.set("remote", null)
  }
  
}

