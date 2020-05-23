package typings.htmlparser2.mod

import typings.htmlparser2.anon.PartialDomHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(handler: PartialDomHandler) = this()
  def this(handler: PartialDomHandler, options: ParserOptions) = this()
  /***
    * alias for backwards compat
    */
  def done(): Unit = js.native
  /***
    * Parses the end of the buffer and clears the stack, calls onend.
    */
  def end(): Unit = js.native
  /***
    * Parses the end of the buffer and clears the stack, calls onend.
    */
  def end(chunk: String): Unit = js.native
  def onattribend(): Unit = js.native
  def onattribname(name: String): Unit = js.native
  def oncdata(value: String): Unit = js.native
  def onclosetag(name: String): Unit = js.native
  def oncomment(value: String): Unit = js.native
  def ondeclaration(): Unit = js.native
  def onend(): Unit = js.native
  def onerror(err: Error): Unit = js.native
  def onopentagend(): Unit = js.native
  def onopentagname(name: String): Unit = js.native
  def onprocessinginstruction(value: String): Unit = js.native
  def onselfclosingtag(): Unit = js.native
  def ontext(data: js.Any): Unit = js.native
  /***
    * alias for backwards compat
    */
  def parseChunk(chunk: String): Unit = js.native
  /***
    * Resets the parser, parses the data & calls end.
    * @param input
    */
  def parseComplete(input: String): Unit = js.native
  /***
    * Pauses the parser
    */
  def pause(): Unit = js.native
  /***
    * Resets buffer & stack, calls onreset.
    */
  def reset(): Unit = js.native
  /***
    * Resumes the parser
    */
  def resume(): Unit = js.native
  /***
    * Parses a chunk of data and calls the corresponding callbacks.
    * @param input
    */
  def write(input: String): Unit = js.native
}

