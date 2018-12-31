package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexer extends js.Object {
  var rules: Rules
  var tokens: TokensList
  def lex(src: java.lang.String): TokensList
}

