package typings.grammarkdown

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.diagnosticsMod.DiagnosticMessages
import typings.grammarkdown.nodesMod.CommentTrivia
import typings.grammarkdown.nodesMod.HtmlTrivia
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scannerMod {
  
  @JSImport("grammarkdown/dist/scanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grammarkdown/dist/scanner", "Scanner")
  @js.native
  class Scanner protected () extends StObject {
    def this(filename: String, text: String, diagnostics: DiagnosticMessages) = this()
    def this(filename: String, text: String, diagnostics: DiagnosticMessages, cancelable: Cancelable) = this()
    def this(filename: String, text: String, diagnostics: DiagnosticMessages, cancelable: CancellationToken) = this()
    
    /* private */ val cancelToken: js.Any = js.native
    
    /* private */ var currentIndentLength: js.Any = js.native
    
    /* private */ var decimalDigitAt: js.Any = js.native
    
    /* private */ var diagnostics: js.Any = js.native
    
    val filename: String = js.native
    
    def getDiagnostics(): DiagnosticMessages = js.native
    
    def getHtmlTrivia(): js.UndefOr[js.Array[HtmlTrivia]] = js.native
    
    /* private */ var getIdentifierToken: js.Any = js.native
    
    def getLen(): Double = js.native
    
    def getPos(): Double = js.native
    
    def getStartPos(): Double = js.native
    
    def getToken(): SyntaxKind = js.native
    
    def getTokenIsUnterminated(): Boolean = js.native
    
    def getTokenPos(): Double = js.native
    
    def getTokenText(): String = js.native
    
    def getTokenValue(): String = js.native
    
    def hasPrecedingBlankLine(): Boolean = js.native
    
    def hasPrecedingDedent(): Boolean = js.native
    
    def hasPrecedingIndent(): Boolean = js.native
    
    def hasPrecedingLineTerminator(): Boolean = js.native
    
    def hasPrecedingNewLine(): Boolean = js.native
    
    /* private */ var hasPrecedingNonWhitspaceTrivia: js.Any = js.native
    
    /* private */ var hexDigitAt: js.Any = js.native
    
    /* private */ var htmlTrivia: js.Any = js.native
    
    /* private */ var insignificantIndentLength: js.Any = js.native
    
    def isIndented(): Boolean = js.native
    
    def isLineContinuation(): Boolean = js.native
    
    /* private */ var isStartOfFile: js.Any = js.native
    
    /* private */ val len: js.Any = js.native
    
    /* private */ var nextLineIsProse: js.Any = js.native
    
    /* private */ var pos: js.Any = js.native
    
    /* private */ var proseStartToken: js.Any = js.native
    
    /* private */ var resetHasPrecedingNonWhitspaceTrivia: js.Any = js.native
    
    def resetIndent(): Unit = js.native
    
    def scan(): SyntaxKind = js.native
    
    /* private */ var scanCharacter: js.Any = js.native
    
    /* private */ var scanCharacterEntity: js.Any = js.native
    
    /* private */ var scanEscapeSequence: js.Any = js.native
    
    /* private */ var scanHexDigits: js.Any = js.native
    
    /* private */ var scanHtmlTrivia: js.Any = js.native
    
    /* private */ var scanLine: js.Any = js.native
    
    /* private */ var scanNumber: js.Any = js.native
    
    /* private */ var scanProse: js.Any = js.native
    
    /* private */ var scanString: js.Any = js.native
    
    /* private */ var setHasPrecedingBlankLine: js.Any = js.native
    
    /* private */ var setHasPrecedingDedent: js.Any = js.native
    
    /* private */ var setHasPrecedingIndent: js.Any = js.native
    
    /* private */ var setHasPrecedingLineTerminator: js.Any = js.native
    
    /* private */ var setHasPrecedingNonWhitspaceTrivia: js.Any = js.native
    
    /* private */ var setIsLineContinuation: js.Any = js.native
    
    /* private */ var setTokenAsUnterminated: js.Any = js.native
    
    /* private */ var significantIndentLength: js.Any = js.native
    
    /* private */ var skipLineTerminator: js.Any = js.native
    
    /* private */ var skipWhiteSpace: js.Any = js.native
    
    def speculate[T](callback: js.Function0[T], isLookahead: Boolean): T = js.native
    
    /* private */ var startPos: js.Any = js.native
    
    val text: String = js.native
    
    /* private */ var token: js.Any = js.native
    
    /* private */ var tokenFlags: js.Any = js.native
    
    /* private */ var tokenPos: js.Any = js.native
    
    /* private */ var tokenValue: js.Any = js.native
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
