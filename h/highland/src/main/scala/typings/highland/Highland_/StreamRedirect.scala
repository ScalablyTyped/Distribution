package typings.highland.Highland_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Used as a Redirect marker when writing to a Stream's incoming buffer
	 */
// TODO is this public?
@JSGlobal("Highland.StreamRedirect")
@js.native
class StreamRedirect[R] protected () extends js.Object {
  def this(to: Stream[R]) = this()
  var to: Stream[R] = js.native
}

