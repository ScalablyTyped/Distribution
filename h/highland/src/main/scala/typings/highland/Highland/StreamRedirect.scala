package typings.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used as a Redirect marker when writing to a Stream's incoming buffer
  */
// TODO is this public?
trait StreamRedirect[R] extends js.Object {
  var to: Stream[R]
}

object StreamRedirect {
  @scala.inline
  def apply[R](to: Stream[R]): StreamRedirect[R] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRedirect[R]]
  }
}

