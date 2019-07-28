package typings.marked.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Parser")
@js.native
class Parser () extends js.Object {
  def this(options: MarkedOptions) = this()
  def next(): Token = js.native
  def parse(src: TokensList): String = js.native
  def parseText(): String = js.native
  def peek(): Token | Double = js.native
  def tok(): String = js.native
}

/* static members */
@JSImport("marked", "Parser")
@js.native
object Parser extends js.Object {
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}

