package typings
package grammarkdownLib.distScannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/scanner", "Scanner")
@js.native
class Scanner protected () extends js.Object {
  def this(filename: java.lang.String, text: java.lang.String, diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages) = this()
  def this(filename: java.lang.String, text: java.lang.String, diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages, cancellationToken: prexLib.prexMod.CancellationToken) = this()
  val cancellationToken: js.Any = js.native
  var currentIndentLength: js.Any = js.native
  var decimalDigitAt: js.Any = js.native
  var diagnostics: js.Any = js.native
  val filename: java.lang.String = js.native
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
  val text: java.lang.String = js.native
  var token: js.Any = js.native
  var tokenFlags: js.Any = js.native
  var tokenPos: js.Any = js.native
  var tokenValue: js.Any = js.native
  def getDiagnostics(): grammarkdownLib.distDiagnosticsMod.DiagnosticMessages = js.native
  def getHtmlTrivia(): js.UndefOr[
    js.Array[
      grammarkdownLib.distNodesMod.HtmlOpenTagTrivia | grammarkdownLib.distNodesMod.HtmlCloseTagTrivia
    ]
  ] = js.native
  def getLen(): scala.Double = js.native
  def getPos(): scala.Double = js.native
  def getStartPos(): scala.Double = js.native
  def getToken(): grammarkdownLib.distTokensMod.SyntaxKind = js.native
  def getTokenIsUnterminated(): scala.Boolean = js.native
  def getTokenPos(): scala.Double = js.native
  def getTokenText(): java.lang.String = js.native
  def getTokenValue(): java.lang.String = js.native
  def hasPrecedingBlankLine(): scala.Boolean = js.native
  def hasPrecedingDedent(): scala.Boolean = js.native
  def hasPrecedingIndent(): scala.Boolean = js.native
  def hasPrecedingLineTerminator(): scala.Boolean = js.native
  def hasPrecedingNewLine(): scala.Boolean = js.native
  def isIndented(): scala.Boolean = js.native
  def isLineContinuation(): scala.Boolean = js.native
  def scan(): grammarkdownLib.distTokensMod.SyntaxKind = js.native
  def speculate[T](callback: js.Function0[T], isLookahead: scala.Boolean): T = js.native
}

