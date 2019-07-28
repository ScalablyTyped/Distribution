package typings.grammarkdown.distScannerMod

import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distNodesMod.HtmlCloseTagTrivia
import typings.grammarkdown.distNodesMod.HtmlOpenTagTrivia
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/scanner", "Scanner")
@js.native
class Scanner protected () extends js.Object {
  def this(filename: String, text: String, diagnostics: DiagnosticMessages) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: DiagnosticMessages,
    cancellationToken: CancellationToken
  ) = this()
  val cancellationToken: js.Any = js.native
  var currentIndentLength: js.Any = js.native
  var decimalDigitAt: js.Any = js.native
  var diagnostics: js.Any = js.native
  val filename: String = js.native
  var getIdentifierToken: js.Any = js.native
  var hasPrecedingNonWhitspaceTrivia: js.Any = js.native
  var hexDigitAt: js.Any = js.native
  var htmlTrivia: js.Any = js.native
  var insignificantIndentLength: js.Any = js.native
  var isStartOfFile: js.Any = js.native
  val len: js.Any = js.native
  var nextLineIsProse: js.Any = js.native
  var pos: js.Any = js.native
  var proseStartToken: js.Any = js.native
  var resetHasPrecedingNonWhitspaceTrivia: js.Any = js.native
  var scanCharacter: js.Any = js.native
  var scanCharacterEntity: js.Any = js.native
  var scanEscapeSequence: js.Any = js.native
  var scanHexDigits: js.Any = js.native
  var scanHtmlTrivia: js.Any = js.native
  var scanLine: js.Any = js.native
  var scanNumber: js.Any = js.native
  var scanProse: js.Any = js.native
  var scanString: js.Any = js.native
  var setHasPrecedingBlankLine: js.Any = js.native
  var setHasPrecedingDedent: js.Any = js.native
  var setHasPrecedingIndent: js.Any = js.native
  var setHasPrecedingLineTerminator: js.Any = js.native
  var setHasPrecedingNonWhitspaceTrivia: js.Any = js.native
  var setIsLineContinuation: js.Any = js.native
  var setTokenAsUnterminated: js.Any = js.native
  var significantIndentLength: js.Any = js.native
  var skipLineTerminator: js.Any = js.native
  var skipWhiteSpace: js.Any = js.native
  var startPos: js.Any = js.native
  val text: String = js.native
  var token: js.Any = js.native
  var tokenFlags: js.Any = js.native
  var tokenPos: js.Any = js.native
  var tokenValue: js.Any = js.native
  def getDiagnostics(): DiagnosticMessages = js.native
  def getHtmlTrivia(): js.UndefOr[js.Array[HtmlOpenTagTrivia | HtmlCloseTagTrivia]] = js.native
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
  def isIndented(): Boolean = js.native
  def isLineContinuation(): Boolean = js.native
  def scan(): SyntaxKind = js.native
  def speculate[T](callback: js.Function0[T], isLookahead: Boolean): T = js.native
}

