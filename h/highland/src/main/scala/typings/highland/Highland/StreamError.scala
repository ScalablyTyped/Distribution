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
@JSGlobal("Highland.StreamError")
@js.native
class StreamError protected () extends js.Object {
  def this(err: Error) = this()
  var error: Error = js.native
}

