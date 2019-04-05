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
  override def lex(src: java.lang.String): markedLib.markedMod.markedNs.TokensList = js.native
  /* CompleteClass */
  override def token(src: java.lang.String, top: scala.Boolean): markedLib.markedMod.markedNs.TokensList = js.native
}

/* static members */
@JSImport("marked", "Lexer")
@js.native
object Lexer extends js.Object {
  var rules: markedLib.markedMod.markedNs.Rules = js.native
  def lex(src: markedLib.markedMod.markedNs.TokensList): markedLib.markedMod.markedNs.TokensList = js.native
  def lex(src: markedLib.markedMod.markedNs.TokensList, options: markedLib.markedMod.markedNs.MarkedOptions): markedLib.markedMod.markedNs.TokensList = js.native
}

