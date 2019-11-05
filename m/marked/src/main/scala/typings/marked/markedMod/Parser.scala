package typings.marked.markedMod

import typings.marked.markedNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Parser")
@js.native
class Parser () extends js.Object {
  def this(options: MarkedOptions) = this()
  var options: MarkedOptions = js.native
  var renderer: Renderer = js.native
  var slugger: Slugger = js.native
  var token: Token | Null = js.native
  var tokens: TokensList = js.native
  def next(): Token = js.native
  def parse(src: TokensList): String = js.native
  def parseText(): String = js.native
  def peek(): Token | `0` = js.native
  def tok(): String = js.native
}

/* static members */
@JSImport("marked", "Parser")
@js.native
object Parser extends js.Object {
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}

@JSImport("marked", "parser")
@js.native
object parser extends js.Object {
  /**
    * @param src Tokenized source as array of tokens
    * @param options Hash of options
    */
  def apply(src: TokensList): String = js.native
  def apply(src: TokensList, options: MarkedOptions): String = js.native
}

