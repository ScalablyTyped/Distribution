package typings.highland.Highland

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
/**
  * Used as an Error marker when writing to a Stream's incoming buffer
  */
// TODO is this public?
trait StreamError extends js.Object {
  var error: Error
}

object StreamError {
  @scala.inline
  def apply(error: Error): StreamError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamError]
  }
}

