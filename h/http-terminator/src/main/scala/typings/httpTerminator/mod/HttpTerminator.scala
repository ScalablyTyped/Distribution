package typings.httpTerminator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTerminator extends js.Object {
  /**
    * Terminates the HTTP server.
    */
  def terminate(): js.Promise[Unit]
}

object HttpTerminator {
  @scala.inline
  def apply(terminate: () => js.Promise[Unit]): HttpTerminator = {
    val __obj = js.Dynamic.literal(terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[HttpTerminator]
  }
}

