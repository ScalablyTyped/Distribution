package typings.marked.mod.marked

import typings.marked.anon.InLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "marked.Lexer")
@js.native
open class Lexer_ () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def blockTokens(src: String, tokens: js.Array[Token]): js.Array[Token] = js.native
  def blockTokens(src: String, tokens: TokensList): TokensList = js.native
  
  def `inline`(src: String): js.Array[Token] = js.native
  def `inline`(src: String, tokens: js.Array[Token]): js.Array[Token] = js.native
  
  def inlineTokens(src: String): js.Array[Token] = js.native
  def inlineTokens(src: String, tokens: js.Array[Token]): js.Array[Token] = js.native
  
  def lex(src: String): TokensList = js.native
  
  var options: MarkedOptions = js.native
  
  var rules: Rules = js.native
  
  var state: InLink = js.native
  
  var tokens: TokensList = js.native
}
object Lexer_ {
  
  @JSImport("marked", "marked.Lexer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def lex(src: String): TokensList = ^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any]).asInstanceOf[TokensList]
  inline def lex(src: String, options: MarkedOptions): TokensList = (^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokensList]
  
  /* static member */
  inline def lexInline(src: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("lexInline")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def lexInline(src: String, options: MarkedOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("lexInline")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  /* static member */
  @JSImport("marked", "marked.Lexer.rules")
  @js.native
  def rules: Rules = js.native
  inline def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
}
