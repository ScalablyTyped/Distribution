package typings
package highlandLib.HighlandNs

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
  def this(err: stdLib.Error) = this()
  var error: stdLib.Error = js.native
}

