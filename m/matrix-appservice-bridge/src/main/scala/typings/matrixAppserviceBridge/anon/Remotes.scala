package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.MatrixRoom
import typings.matrixAppserviceBridge.mod.RemoteRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remotes extends js.Object {
  var matrix: MatrixRoom = js.native
  var remote: Null | RemoteRoom = js.native
  var remotes: js.Array[RemoteRoom] = js.native
}

object Remotes {
  @scala.inline
  def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom]): Remotes = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remotes]
  }
  @scala.inline
  implicit class RemotesOps[Self <: Remotes] (val x: Self) extends AnyVal {
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
    def setMatrix(value: MatrixRoom): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotesVarargs(value: RemoteRoom*): Self = this.set("remotes", js.Array(value :_*))
    @scala.inline
    def setRemotes(value: js.Array[RemoteRoom]): Self = this.set("remotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: RemoteRoom): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteNull: Self = this.set("remote", null)
  }
  
}

