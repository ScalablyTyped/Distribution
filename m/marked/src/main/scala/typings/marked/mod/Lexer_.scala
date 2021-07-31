package typings.marked.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "Lexer")
@js.native
class Lexer_ () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def `inline`(tokens: TokensList): TokensList = js.native
  
  def lex(src: String): TokensList = js.native
  
  var options: MarkedOptions = js.native
  
  var rules: Rules = js.native
  
  def token(src: String, top: Boolean): TokensList = js.native
  
  var tokens: TokensList = js.native
}
object Lexer_ {
  
  @JSImport("marked", "Lexer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def lex(src: TokensList): TokensList = ^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any]).asInstanceOf[TokensList]
  @scala.inline
  def lex(src: TokensList, options: MarkedOptions): TokensList = (^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokensList]
  
  /* static member */
  @JSImport("marked", "Lexer.rules")
  @js.native
  def rules: Rules = js.native
  @scala.inline
  def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
}
