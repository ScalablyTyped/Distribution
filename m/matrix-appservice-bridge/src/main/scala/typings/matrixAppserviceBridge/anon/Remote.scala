package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.MatrixUser
import typings.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remote extends js.Object {
  var matrix: Null | MatrixUser = js.native
  var remote: Null | RemoteUser = js.native
  var remotes: js.Array[RemoteUser] = js.native
}

object Remote {
  @scala.inline
  def apply(remotes: js.Array[RemoteUser]): Remote = {
    val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  @scala.inline
  implicit class RemoteOps[Self <: Remote] (val x: Self) extends AnyVal {
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
    def setRemotesVarargs(value: RemoteUser*): Self = this.set("remotes", js.Array(value :_*))
    @scala.inline
    def setRemotes(value: js.Array[RemoteUser]): Self = this.set("remotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(value: MatrixUser): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrixNull: Self = this.set("matrix", null)
    @scala.inline
    def setRemote(value: RemoteUser): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteNull: Self = this.set("remote", null)
  }
  
}

