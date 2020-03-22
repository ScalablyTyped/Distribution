package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
    // <nullable> The remote room, if applicable.
  var data: Null | js.Object
  var id: String
               // "remote_room_id",
  var matrix: Null | MatrixRoom
               //  The unique ID for this entry.
  var matrix_id: String
    // <nullable> The matrix room, if applicable.
  var remote: Null | RemoteRoom
               // "room_id",
  var remote_id: String
}

object Entry {
  @scala.inline
  def apply(
    id: String,
    matrix_id: String,
    remote_id: String,
    data: js.Object = null,
    matrix: MatrixRoom = null,
    remote: RemoteRoom = null
  ): Entry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matrix_id = matrix_id.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

