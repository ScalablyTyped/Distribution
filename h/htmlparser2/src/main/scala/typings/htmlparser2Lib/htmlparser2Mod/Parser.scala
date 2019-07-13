package typings
package htmlparser2Lib.htmlparser2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(handler: stdLib.Partial[domhandlerLib.domhandlerMod.DomHandler]) = this()
  def this(handler: stdLib.Partial[domhandlerLib.domhandlerMod.DomHandler], options: ParserOptions) = this()
  /***
    * alias for backwards compat
    */
  def done(): scala.Unit = js.native
  /***
    * Parses the end of the buffer and clears the stack, calls onend.
    */
  def end(): scala.Unit = js.native
  /***
    * Parses the end of the buffer and clears the stack, calls onend.
    */
  def end(chunk: java.lang.String): scala.Unit = js.native
  def onattribend(): scala.Unit = js.native
  def onattribname(name: java.lang.String): scala.Unit = js.native
  def oncdata(value: java.lang.String): scala.Unit = js.native
  def onclosetag(name: java.lang.String): scala.Unit = js.native
  def oncomment(value: java.lang.String): scala.Unit = js.native
  def ondeclaration(): scala.Unit = js.native
  def onend(): scala.Unit = js.native
  def onerror(err: stdLib.Error): scala.Unit = js.native
  def onopentagend(): scala.Unit = js.native
  def onopentagname(name: java.lang.String): scala.Unit = js.native
  def onprocessinginstruction(value: java.lang.String): scala.Unit = js.native
  def onselfclosingtag(): scala.Unit = js.native
  def ontext(data: js.Any): scala.Unit = js.native
  /***
    * alias for backwards compat
    */
  def parseChunk(chunk: java.lang.String): scala.Unit = js.native
  /***
    * Resets the parser, parses the data & calls end.
    * @param input
    */
  def parseComplete(input: java.lang.String): scala.Unit = js.native
  /***
    * Pauses the parser
    */
  def pause(): scala.Unit = js.native
  /***
    * Resets buffer & stack, calls onreset.
    */
  def reset(): scala.Unit = js.native
  /***
    * Resumes the parser
    */
  def resume(): scala.Unit = js.native
  /***
    * Parses a chunk of data and calls the corresponding callbacks.
    * @param input
    */
  def write(input: java.lang.String): scala.Unit = js.native
}

