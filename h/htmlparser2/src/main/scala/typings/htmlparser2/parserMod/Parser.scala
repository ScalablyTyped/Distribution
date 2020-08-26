package typings.htmlparser2.parserMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.anon.PartialHandler
import typings.htmlparser2.anon.PartialHandlerOnattribute
import typings.htmlparser2.tokenizerMod.default
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/Parser", "Parser")
@js.native
class Parser () extends EventEmitter {
  def this(cbs: PartialHandler) = this()
  def this(cbs: Null, options: ParserOptions) = this()
  def this(cbs: PartialHandler, options: ParserOptions) = this()
  var _attribname: String = js.native
  var _attribs: Null | StringDictionary[String] = js.native
  var _attribvalue: String = js.native
  var _cbs: PartialHandlerOnattribute = js.native
  var _foreignContext: js.Array[Boolean] = js.native
  var _lowerCaseAttributeNames: Boolean = js.native
  var _lowerCaseTagNames: Boolean = js.native
  var _options: ParserOptions = js.native
  var _stack: js.Array[String] = js.native
  var _tagname: String = js.native
  var _tokenizer: default = js.native
  var endIndex: Double | Null = js.native
  var startIndex: Double = js.native
  def _closeCurrentTag(): Unit = js.native
  def _getInstructionName(value: String): String = js.native
  def _updatePosition(initialOffset: Double): Unit = js.native
  def done(): Unit = js.native
  def done(chunk: String): Unit = js.native
  def end(): Unit = js.native
  def end(chunk: String): Unit = js.native
  def onattribdata(value: String): Unit = js.native
  def onattribend(): Unit = js.native
  def onattribname(name: String): Unit = js.native
  def oncdata(value: String): Unit = js.native
  def onclosetag(name: String): Unit = js.native
  def oncomment(value: String): Unit = js.native
  def ondeclaration(value: String): Unit = js.native
  def onend(): Unit = js.native
  def onerror(err: Error): Unit = js.native
  def onopentagend(): Unit = js.native
  def onopentagname(name: String): Unit = js.native
  def onprocessinginstruction(value: String): Unit = js.native
  def onselfclosingtag(): Unit = js.native
  def ontext(data: String): Unit = js.native
  def parseChunk(chunk: String): Unit = js.native
  def parseComplete(data: String): Unit = js.native
  def pause(): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def write(chunk: String): Unit = js.native
}

