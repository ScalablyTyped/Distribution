package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Parser")
@js.native
class Parser () extends js.Object {
  def this(options: MarkedOptions) = this()
  def next(): Token = js.native
  def parse(src: TokensList): java.lang.String = js.native
  def parseText(): java.lang.String = js.native
  def peek(): Token | scala.Double = js.native
  def tok(): java.lang.String = js.native
}

/* static members */
@JSImport("marked", "Parser")
@js.native
object Parser extends js.Object {
  def parse(src: markedLib.markedMod.TokensList): java.lang.String = js.native
  def parse(src: markedLib.markedMod.TokensList, options: markedLib.markedMod.MarkedOptions): java.lang.String = js.native
}

