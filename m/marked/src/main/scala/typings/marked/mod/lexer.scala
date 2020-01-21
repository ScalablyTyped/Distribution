package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "lexer")
@js.native
object lexer extends js.Object {
  /**
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    */
  def apply(src: String): TokensList = js.native
  def apply(src: String, options: MarkedOptions): TokensList = js.native
}

