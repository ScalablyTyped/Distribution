package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def forEachChild[T](
  node: scala.Unit,
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.grammarkdownMod.Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](
  node: typings.grammarkdown.grammarkdownMod.Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind],
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.grammarkdownMod.Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def formatList(tokens: js.Array[typings.grammarkdown.grammarkdownMod.SyntaxKind | java.lang.String]): java.lang.String = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(tokens.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def formatString(format: java.lang.String): java.lang.String = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def formatString(format: java.lang.String, args: js.Any*): java.lang.String = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def formatString(format: java.lang.String, args: js.Array[js.Any]): java.lang.String = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def getDefaultOptions(): typings.grammarkdown.grammarkdownMod.CompilerOptions = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[typings.grammarkdown.grammarkdownMod.CompilerOptions]

inline def isCommentTriviaKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommentTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind */ scala.Boolean]

inline def isHtmlTriviaKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind */ scala.Boolean]

inline def isKeywordKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.KeywordKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.KeywordKind */ scala.Boolean]

inline def isProseFragmentLiteralKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteralKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentLiteralKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteralKind */ scala.Boolean]

inline def isPunctuationKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.PunctuationKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuationKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.PunctuationKind */ scala.Boolean]

inline def isTextContentKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TextContentKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TextContentKind */ scala.Boolean]

inline def isTokenKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TokenKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TokenKind */ scala.Boolean]

inline def isTriviaKind(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind */ scala.Boolean = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind */ scala.Boolean]

inline def parse[T /* <: typings.grammarkdown.grammarkdownMod.ParsedArguments */](options: typings.grammarkdown.grammarkdownMod.KnownOptions): js.UndefOr[T] = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
inline def parse[T /* <: typings.grammarkdown.grammarkdownMod.ParsedArguments */](options: typings.grammarkdown.grammarkdownMod.KnownOptions, args: js.Array[java.lang.String]): js.UndefOr[T] = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def scanHtmlTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): js.UndefOr[js.Array[typings.grammarkdown.grammarkdownMod.HtmlTrivia]] = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("scanHtmlTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[typings.grammarkdown.grammarkdownMod.HtmlTrivia]]]

inline def skipTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): scala.Double = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: js.Array[typings.grammarkdown.grammarkdownMod.HtmlTrivia]
): scala.Double = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: js.Array[typings.grammarkdown.grammarkdownMod.HtmlTrivia],
  commentTrivia: js.Array[typings.grammarkdown.grammarkdownMod.CommentTrivia]
): scala.Double = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def skipTrivia(
  text: java.lang.String,
  pos: scala.Double,
  end: scala.Double,
  htmlTrivia: scala.Unit,
  commentTrivia: js.Array[typings.grammarkdown.grammarkdownMod.CommentTrivia]
): scala.Double = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def stringToToken(text: java.lang.String): js.UndefOr[typings.grammarkdown.grammarkdownMod.SyntaxKind] = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("stringToToken")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.grammarkdown.grammarkdownMod.SyntaxKind]]

inline def tokenToString(kind: java.lang.String): java.lang.String = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def tokenToString(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind): java.lang.String = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def tokenToString(kind: typings.grammarkdown.grammarkdownMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def usage(options: typings.grammarkdown.grammarkdownMod.KnownOptions): scala.Unit = typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def usage(options: typings.grammarkdown.grammarkdownMod.KnownOptions, margin: scala.Double): scala.Unit = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def usage(
  options: typings.grammarkdown.grammarkdownMod.KnownOptions,
  margin: scala.Double,
  printHeader: js.Function1[/* writer */ typings.grammarkdown.grammarkdownMod.UsageWriter, scala.Unit]
): scala.Unit = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def usage(
  options: typings.grammarkdown.grammarkdownMod.KnownOptions,
  margin: scala.Unit,
  printHeader: js.Function1[/* writer */ typings.grammarkdown.grammarkdownMod.UsageWriter, scala.Unit]
): scala.Unit = (typings.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

type Assertion = typings.grammarkdown.grammarkdownMod.InvalidAssertion

type AssertionKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.AssertionTypes */ java.lang.String

type CommentTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind] */ js.Any

type Declaration = typings.grammarkdown.grammarkdownMod.Parameter

type DeclarationKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.DeclarationTypes */ java.lang.String

type HtmlTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind] */ js.Any

type KnownOptions = org.scalablytyped.runtime.StringDictionary[typings.grammarkdown.anon.PartialKnownOption]

type LegacyReadFileCallback = js.ThisFunction2[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
js.Thenable[java.lang.String] | java.lang.String]

type LegacyReadFileSyncCallback = js.ThisFunction2[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
java.lang.String]

type LegacyWriteFileCallback = js.ThisFunction3[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* content */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
js.Thenable[scala.Unit] | scala.Unit]

type LegacyWriteFileSyncCallback = js.ThisFunction3[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* content */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
scala.Unit]

type LexicalSymbol = typings.grammarkdown.grammarkdownMod.InvalidSymbol

type LexicalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.LexicalSymbolTypes */ java.lang.String

type MetaElement = typings.grammarkdown.grammarkdownMod.Import

type MetaElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.MetaElementTypes */ java.lang.String

type OptionalSymbol = typings.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral

type OptionalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.OptionalSymbolTypes */ java.lang.String

type PrimarySymbol = typings.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral

type PrimarySymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.PrimarySymbolTypes */ java.lang.String

type PrimarySymbolTypes = typings.grammarkdown.grammarkdownMod.OptionalSymbolTypes

type ProductionBody = typings.grammarkdown.grammarkdownMod.RightHandSide

type ProductionBodyKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.ProductionBodyTypes */ java.lang.String

type ProseFragment = typings.grammarkdown.grammarkdownMod.ProseFragmentLiteral[
typings.grammarkdown.grammarkdownNumbers.`52` | typings.grammarkdown.grammarkdownNumbers.`49` | typings.grammarkdown.grammarkdownNumbers.`50` | typings.grammarkdown.grammarkdownNumbers.`51`]

type ReadFileCallback = js.ThisFunction2[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
js.Thenable[java.lang.String] | java.lang.String]

type ReadFileSyncCallback = js.ThisFunction2[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
java.lang.String]

type SourceElement = typings.grammarkdown.grammarkdownMod.Production

type SourceElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.SourceElementTypes */ java.lang.String

type Trivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.TriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind] */ js.Any

type WriteFileCallback = js.ThisFunction3[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* content */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
js.Thenable[scala.Unit] | scala.Unit]

type WriteFileSyncCallback = js.ThisFunction3[
/* this */ scala.Nothing, 
/* file */ java.lang.String, 
/* content */ java.lang.String, 
/* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
scala.Unit]
