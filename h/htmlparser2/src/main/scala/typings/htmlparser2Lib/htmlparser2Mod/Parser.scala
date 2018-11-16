package typings
package htmlparser2Lib.htmlparser2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(handler: Handler) = this()
  def this(handler: Handler, options: Options) = this()
  /***
       * alias for backwards compat
       */
  def done(): scala.Unit = js.native
  /***
       * Parses the end of the buffer and clears the stack, calls onend.
       */
  def end(): scala.Unit = js.native
  /***
       * alias for backwards compat
       */
  def parseChunk(input: java.lang.String): scala.Unit = js.native
  /***
       * Resets the parser, parses the data & calls end.
       * @param input
       */
  def parseComplete(input: java.lang.String): scala.Unit = js.native
  /***
       * Resets buffer & stack, calls onreset.
       */
  def reset(): scala.Unit = js.native
  /***
       * Parses a chunk of data and calls the corresponding callbacks.
       * @param input
       */
  def write(input: java.lang.String): scala.Unit = js.native
}

