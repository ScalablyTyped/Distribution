package typings.grammarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tokensMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.grammarkdown.tokensMod.PrimarySymbolKind
    - typings.grammarkdown.tokensMod.AssertionKind
    - typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange
    - typings.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.Prose
    - typings.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.InvalidSymbol
  */
  type LexicalSymbolKind = typings.grammarkdown.tokensMod._LexicalSymbolKind | typings.grammarkdown.tokensMod.PrimarySymbolKind
  
  type PrimarySymbolKind = typings.grammarkdown.tokensMod.OptionalSymbolKind
  
  @scala.inline
  def isAssertionKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean]
  
  @scala.inline
  def isCommentTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommentTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isHtmlTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isKeywordKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean]
  
  @scala.inline
  def isLexicalSymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLexicalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean]
  
  @scala.inline
  def isMetaElementKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMetaElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean]
  
  @scala.inline
  def isOptionalSymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean]
  
  @scala.inline
  def isPrimarySymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPrimarySymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean]
  
  @scala.inline
  def isProductionBodyKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProductionBodyKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean]
  
  @scala.inline
  def isProseFragmentKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean]
  
  @scala.inline
  def isProseFragmentLiteralKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentLiteralKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean]
  
  @scala.inline
  def isPunctuationKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuationKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean]
  
  @scala.inline
  def isSourceElementKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSourceElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean]
  
  @scala.inline
  def isTextContentKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean]
  
  @scala.inline
  def isTokenKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean]
  
  @scala.inline
  def isTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean]
  
  @scala.inline
  def stringToToken(text: java.lang.String): js.UndefOr[typings.grammarkdown.tokensMod.SyntaxKind] = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("stringToToken")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.grammarkdown.tokensMod.SyntaxKind]]
  
  @scala.inline
  def tokenToString(kind: java.lang.String): java.lang.String = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typings.grammarkdown.tokensMod.SyntaxKind): java.lang.String = typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typings.grammarkdown.tokensMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
