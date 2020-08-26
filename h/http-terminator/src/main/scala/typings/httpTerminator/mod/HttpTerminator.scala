package typings.httpTerminator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTerminator extends js.Object {
  /**
    * Terminates the HTTP server.
    */
  def terminate(): js.Promise[Unit] = js.native
}

object HttpTerminator {
  @scala.inline
  def apply(terminate: () => js.Promise[Unit]): HttpTerminator = {
    val __obj = js.Dynamic.literal(terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[HttpTerminator]
  }
  @scala.inline
  implicit class HttpTerminatorOps[Self <: HttpTerminator] (val x: Self) extends AnyVal {
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
    def setTerminate(value: () => js.Promise[Unit]): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
  
}

