package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Lexer")
@js.native
class Lexer ()
  extends markedLib.markedMod.markedNs.Lexer {
  def this(options: markedLib.markedMod.markedNs.MarkedOptions) = this()
  /* CompleteClass */
  override var rules: markedLib.markedMod.markedNs.Rules = js.native
  /* CompleteClass */
  override var tokens: markedLib.markedMod.markedNs.TokensList = js.native
  /* CompleteClass */
  override def lex(src: java.lang.String): markedLib.markedMod.markedNs.TokensList = js.native
}

