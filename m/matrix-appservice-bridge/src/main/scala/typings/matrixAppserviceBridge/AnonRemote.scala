package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.mod.MatrixUser
import typings.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemote extends js.Object {
  var matrix: Null | MatrixUser
  var remote: Null | RemoteUser
  var remotes: js.Array[RemoteUser]
}

object AnonRemote {
  @scala.inline
  def apply(remotes: js.Array[RemoteUser], matrix: MatrixUser = null, remote: RemoteUser = null): AnonRemote = {
    val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemote]
  }
}

