package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "Lexer")
@js.native
class Lexer_ () extends js.Object {
  def this(options: MarkedOptions) = this()
  
  def `inline`(tokens: TokensList): TokensList = js.native
  
  def lex(src: String): TokensList = js.native
  
  var options: MarkedOptions = js.native
  
  var rules: Rules = js.native
  
  def token(src: String, top: Boolean): TokensList = js.native
  
  var tokens: TokensList = js.native
}
/* static members */
@JSImport("marked", "Lexer")
@js.native
object Lexer_ extends js.Object {
  
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
  
  var rules: Rules = js.native
}
