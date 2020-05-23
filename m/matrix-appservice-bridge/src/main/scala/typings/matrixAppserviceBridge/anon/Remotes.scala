package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.MatrixRoom
import typings.matrixAppserviceBridge.mod.RemoteRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remotes extends js.Object {
  var matrix: MatrixRoom
  var remote: Null | RemoteRoom
  var remotes: js.Array[RemoteRoom]
}

object Remotes {
  @scala.inline
  def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom], remote: RemoteRoom = null): Remotes = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remotes]
  }
}

