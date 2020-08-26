package typings.htmlparser2.tokenizerMod

import typings.htmlparser2.htmlparser2Strings.onattribdata
import typings.htmlparser2.htmlparser2Strings.onclosetag
import typings.htmlparser2.htmlparser2Strings.onopentagname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizer extends js.Object {
  /** Some behavior, eg. when decoding entities, is done while we are in another state. This keeps track of the other state type. */
  var _baseState: State = js.native
  /** The read buffer. */
  var _buffer: String = js.native
  /**
    * Data that has already been processed will be removed from the buffer occasionally.
    * `_bufferOffset` keeps track of how many characters have been removed, to make sure position information is accurate.
    */
  var _bufferOffset: Double = js.native
  var _cbs: Callbacks = js.native
  var _decodeEntities: Boolean = js.native
  /** Indicates whether the tokenizer has finished running / `.end` has been called. */
  var _ended: Boolean = js.native
  /** The index within the buffer that we are currently looking at. */
  var _index: Double = js.native
  /** Indicates whether the tokenizer has been paused. */
  var _running: Boolean = js.native
  /** The beginning of the section that is currently being read. */
  var _sectionStart: Double = js.native
  /** For special parsing behavior inside of script and style tags. */
  var _special: Special = js.native
  /** The current state the tokenizer is in. */
  var _state: State = js.native
  var _xmlMode: Boolean = js.native
  def _cleanup(): Unit = js.native
  def _decodeNumericEntity(offset: Double, base: Double): Unit = js.native
  def _emitPartial(value: String): Unit = js.native
  @JSName("_emitToken")
  def _emitToken_onattribdata(name: onattribdata): Unit = js.native
  @JSName("_emitToken")
  def _emitToken_onclosetag(name: onclosetag): Unit = js.native
  @JSName("_emitToken")
  def _emitToken_onopentagname(name: onopentagname): Unit = js.native
  def _finish(): Unit = js.native
  def _getSection(): String = js.native
  def _handleTrailingData(): Unit = js.native
  def _parse(): Unit = js.native
  def _parseLegacyEntity(): Unit = js.native
  def _parseNamedEntityStrict(): Unit = js.native
  def _stateAfterAttributeName(c: String): Unit = js.native
  def _stateAfterCdata1(c: String): Unit = js.native
  def _stateAfterCdata2(c: String): Unit = js.native
  def _stateAfterClosingTagName(c: String): Unit = js.native
  def _stateAfterComment1(c: String): Unit = js.native
  def _stateAfterComment2(c: String): Unit = js.native
  def _stateAfterScript5(c: String): Unit = js.native
  def _stateAfterStyle4(c: String): Unit = js.native
  def _stateBeforeAttributeName(c: String): Unit = js.native
  def _stateBeforeAttributeValue(c: String): Unit = js.native
  def _stateBeforeCdata6(c: String): Unit = js.native
  def _stateBeforeClosingTagName(c: String): Unit = js.native
  def _stateBeforeComment(c: String): Unit = js.native
  def _stateBeforeDeclaration(c: String): Unit = js.native
  def _stateBeforeScript5(c: String): Unit = js.native
  def _stateBeforeSpecial(c: String): Unit = js.native
  def _stateBeforeSpecialEnd(c: String): Unit = js.native
  def _stateBeforeStyle4(c: String): Unit = js.native
  def _stateBeforeTagName(c: String): Unit = js.native
  def _stateInAttributeName(c: String): Unit = js.native
  def _stateInAttributeValueDoubleQuotes(c: String): Unit = js.native
  def _stateInAttributeValueNoQuotes(c: String): Unit = js.native
  def _stateInAttributeValueSingleQuotes(c: String): Unit = js.native
  def _stateInCdata(c: String): Unit = js.native
  def _stateInClosingTagName(c: String): Unit = js.native
  def _stateInComment(c: String): Unit = js.native
  def _stateInDeclaration(c: String): Unit = js.native
  def _stateInHexEntity(c: String): Unit = js.native
  def _stateInNamedEntity(c: String): Unit = js.native
  def _stateInNumericEntity(c: String): Unit = js.native
  def _stateInProcessingInstruction(c: String): Unit = js.native
  def _stateInSelfClosingTag(c: String): Unit = js.native
  def _stateInTagName(c: String): Unit = js.native
  def _stateText(c: String): Unit = js.native
  def end(): Unit = js.native
  def end(chunk: String): Unit = js.native
  def getAbsoluteIndex(): Double = js.native
  def pause(): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def write(chunk: String): Unit = js.native
}

