package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.MatrixUser
import typings.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  var matrix: MatrixUser = js.native
  var remote: Null | RemoteUser = js.native
  var remotes: js.Array[RemoteUser] = js.native
}

object Matrix {
  @scala.inline
  def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser]): Matrix = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix]
  }
  @scala.inline
  implicit class MatrixOps[Self <: Matrix] (val x: Self) extends AnyVal {
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
    def setMatrix(value: MatrixUser): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotesVarargs(value: RemoteUser*): Self = this.set("remotes", js.Array(value :_*))
    @scala.inline
    def setRemotes(value: js.Array[RemoteUser]): Self = this.set("remotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: RemoteUser): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteNull: Self = this.set("remote", null)
  }
  
}

