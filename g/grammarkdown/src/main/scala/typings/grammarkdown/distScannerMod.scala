package typings.grammarkdown

import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distNodesMod.CommentTrivia
import typings.grammarkdown.distNodesMod.HtmlTrivia
import typings.grammarkdown.distNodesMod.Trivia
import typings.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScannerMod {
  
  @JSImport("grammarkdown/dist/scanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grammarkdown/dist/scanner", "Scanner")
  @js.native
  open class Scanner protected () extends StObject {
    def this(filename: String, text: String, diagnostics: DiagnosticMessages) = this()
    def this(filename: String, text: String, diagnostics: DiagnosticMessages, cancelable: Cancelable) = this()
    
    /* private */ val cancelToken: Any = js.native
    
    /* private */ var currentIndentLength: Any = js.native
    
    /* private */ var decimalDigitAt: Any = js.native
    
    /* private */ var diagnostics: Any = js.native
    
    val filename: String = js.native
    
    /* private */ var finishLastTrivia: Any = js.native
    
    def getDiagnostics(): DiagnosticMessages = js.native
    
    /** @deprecated */
    def getHtmlTrivia(): js.UndefOr[js.Array[Trivia]] = js.native
    
    /* private */ var getIdentifierToken: Any = js.native
    
    def getLen(): Double = js.native
    
    def getPos(): Double = js.native
    
    def getStartPos(): Double = js.native
    
    def getToken(): SyntaxKind = js.native
    
    def getTokenIsUnterminated(): Boolean = js.native
    
    def getTokenPos(): Double = js.native
    
    def getTokenText(): String = js.native
    
    def getTokenValue(): String = js.native
    
    def getTrivia(): js.UndefOr[js.Array[Trivia]] = js.native
    
    def hasPrecedingBlankLine(): Boolean = js.native
    
    def hasPrecedingDedent(): Boolean = js.native
    
    def hasPrecedingIndent(): Boolean = js.native
    
    def hasPrecedingLineTerminator(): Boolean = js.native
    
    def hasPrecedingNewLine(): Boolean = js.native
    
    /* private */ var hasPrecedingNonWhiteSpaceTrivia: Any = js.native
    
    /* private */ var hexDigitAt: Any = js.native
    
    /* private */ var insignificantIndentLength: Any = js.native
    
    def isIndented(): Boolean = js.native
    
    def isLineContinuation(): Boolean = js.native
    
    /* private */ var isStartOfFile: Any = js.native
    
    /* private */ var lastTrivia: Any = js.native
    
    /* private */ val len: Any = js.native
    
    /* private */ var nextLineIsProse: Any = js.native
    
    /* private */ var peekChar: Any = js.native
    
    /* private */ var pos: Any = js.native
    
    /* private */ var proseStartToken: Any = js.native
    
    /* private */ var recordTrivia: Any = js.native
    
    /* private */ var resetHasPrecedingNonWhiteSpaceTrivia: Any = js.native
    
    def resetIndent(): Unit = js.native
    
    /* private */ var resetTriviaFlags: Any = js.native
    
    /* private */ var resetTriviaHasPrecedingWhiteSpaceTrivia: Any = js.native
    
    def scan(): SyntaxKind = js.native
    
    /* private */ var scanCharacter: Any = js.native
    
    /* private */ var scanCharacterEntity: Any = js.native
    
    /* private */ var scanEscapeSequence: Any = js.native
    
    /* private */ var scanHexDigits: Any = js.native
    
    /* private */ var scanHtmlComment: Any = js.native
    
    /* private */ var scanHtmlTrivia: Any = js.native
    
    /* private */ var scanLine: Any = js.native
    
    /* private */ var scanMultiLineCommentTrivia: Any = js.native
    
    /* private */ var scanNumber: Any = js.native
    
    /* private */ var scanProse: Any = js.native
    
    def scanRange[T](pos: Double, cb: js.Function0[T]): T = js.native
    
    /* private */ var scanSingleLineCommentTrivia: Any = js.native
    
    /* private */ var scanString: Any = js.native
    
    /* private */ var setHasPrecedingBlankLine: Any = js.native
    
    /* private */ var setHasPrecedingDedent: Any = js.native
    
    /* private */ var setHasPrecedingIndent: Any = js.native
    
    /* private */ var setHasPrecedingLineTerminator: Any = js.native
    
    /* private */ var setHasPrecedingNonWhiteSpaceTrivia: Any = js.native
    
    /* private */ var setIsLineContinuation: Any = js.native
    
    /* private */ var setTokenAsUnterminated: Any = js.native
    
    /* private */ var setTriviaHasPrecedingBlankLine: Any = js.native
    
    /* private */ var setTriviaHasPrecedingWhiteSpaceTrivia: Any = js.native
    
    /* private */ var significantIndentLength: Any = js.native
    
    /* private */ var skipLineTerminator: Any = js.native
    
    /* private */ var skipWhiteSpace: Any = js.native
    
    def speculate[T](callback: js.Function0[T], isLookahead: Boolean): T = js.native
    
    /* private */ var startPos: Any = js.native
    
    val text: String = js.native
    
    /* private */ var token: Any = js.native
    
    /* private */ var tokenFlags: Any = js.native
    
    /* private */ var tokenPos: Any = js.native
    
    /* private */ var tokenValue: Any = js.native
    
    /* private */ var trivia: Any = js.native
    
    /* private */ var triviaHasPrecedingBlankLine: Any = js.native
    
    /* private */ var triviaHasPrecedingLineTerminator: Any = js.native
    
    /* private */ var triviaHasPrecedingWhiteSpaceTrivia: Any = js.native
  }
  
  inline def scanHtmlTrivia(text: String, pos: Double, end: Double): js.UndefOr[js.Array[HtmlTrivia]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanHtmlTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[HtmlTrivia]]]
  
  inline def skipTrivia(text: String, pos: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def skipTrivia(text: String, pos: Double, end: Double, htmlTrivia: js.Array[HtmlTrivia]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def skipTrivia(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.Array[HtmlTrivia],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def skipTrivia(text: String, pos: Double, end: Double, htmlTrivia: Unit, commentTrivia: js.Array[CommentTrivia]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[Double]
}
