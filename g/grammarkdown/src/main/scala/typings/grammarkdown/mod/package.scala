package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def forEachChild[T](
  node: scala.Unit,
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](
  node: typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind],
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def formatList(tokens: js.Array[typings.grammarkdown.tokensMod.SyntaxKind | java.lang.String]): java.lang.String = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(tokens.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def formatString(format: java.lang.String): java.lang.String = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def formatString(format: java.lang.String, args: js.Any*): java.lang.String = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def formatString(format: java.lang.String, args: js.Array[js.Any]): java.lang.String = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def getDefaultOptions(): typings.grammarkdown.optionsMod.CompilerOptions = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[typings.grammarkdown.optionsMod.CompilerOptions]

inline def isAssertionKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean]

inline def isCommentTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommentTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean]

inline def isHtmlTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean]

inline def isKeywordKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean]

inline def isLexicalSymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLexicalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean]

inline def isMetaElementKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMetaElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean]

inline def isOptionalSymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean]

inline def isPrimarySymbolKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPrimarySymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean]

inline def isProductionBodyKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isProductionBodyKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean]

inline def isProseFragmentKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean]

inline def isProseFragmentLiteralKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentLiteralKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean]

inline def isPunctuationKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuationKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean]

inline def isSourceElementKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSourceElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean]

inline def isTextContentKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean]

inline def isTokenKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean]

inline def isTriviaKind(kind: typings.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean]

inline def scanHtmlTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): js.UndefOr[js.Array[typings.grammarkdown.nodesMod.HtmlTrivia]] = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scanHtmlTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[typings.grammarkdown.nodesMod.HtmlTrivia]]]

inline def skipTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): scala.Double = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: js.Array[typings.grammarkdown.nodesMod.HtmlTrivia]
): scala.Double = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: js.Array[typings.grammarkdown.nodesMod.HtmlTrivia],
  commentTrivia: js.Array[typings.grammarkdown.nodesMod.CommentTrivia]
): scala.Double = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: scala.Unit,
  commentTrivia: js.Array[typings.grammarkdown.nodesMod.CommentTrivia]
): scala.Double = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def stringToToken(text: java.lang.String): js.UndefOr[typings.grammarkdown.tokensMod.SyntaxKind] = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringToToken")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.grammarkdown.tokensMod.SyntaxKind]]

inline def tokenToString(kind: java.lang.String): java.lang.String = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def tokenToString(kind: typings.grammarkdown.tokensMod.SyntaxKind): java.lang.String = typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def tokenToString(kind: typings.grammarkdown.tokensMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
