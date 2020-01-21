package typings.grammarkdown.diagnosticsMod

import typings.grammarkdown.AnonDetailed
import typings.grammarkdown.AnonDetailedMessage
import typings.grammarkdown.coreMod.Range
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/diagnostics", "DiagnosticMessages")
@js.native
class DiagnosticMessages () extends js.Object {
  var compareDiagnostics: js.Any = js.native
  var deduplicateDiagnostics: js.Any = js.native
  var detailedDiagnosticMessages: js.Any = js.native
  var diagnostics: js.Any = js.native
  var diagnosticsArguments: js.Any = js.native
  var diagnosticsLength: js.Any = js.native
  var diagnosticsNode: js.Any = js.native
  var diagnosticsPos: js.Any = js.native
  var getDiagnosticCode: js.Any = js.native
  var getDiagnosticErrorLevel: js.Any = js.native
  var getDiagnosticLength: js.Any = js.native
  var getDiagnosticPos: js.Any = js.native
  var getSortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.UndefOr[DiagnosticInfo]]] = js.native
  var reportDiagnostic: js.Any = js.native
  var simpleDiagnosticMessages: js.Any = js.native
  val size: Double = js.native
  var sortDiagnostics: js.Any = js.native
  var sortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
  var sourceFiles: js.Any = js.native
  var sourceFilesDiagnosticOffset: js.Any = js.native
  def copyFrom(other: DiagnosticMessages): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* message */ String, /* diagnosticIndex */ Double, Unit]): Unit = js.native
  def getDiagnostic(diagnosticIndex: Double): js.UndefOr[Diagnostic] = js.native
  def getDiagnosticArguments(diagnosticIndex: Double): js.UndefOr[js.Array[_]] = js.native
  def getDiagnosticInfo(diagnosticIndex: Double): js.UndefOr[DiagnosticInfo] = js.native
  def getDiagnosticInfo(diagnosticIndex: Double, options: AnonDetailedMessage): js.UndefOr[DiagnosticInfo] = js.native
  def getDiagnosticInfos(): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfos(options: AnonDetailedMessage): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfosForSourceFile(sourceFile: SourceFile): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfosForSourceFile(sourceFile: SourceFile, options: AnonDetailedMessage): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticNode(diagnosticIndex: Double): js.UndefOr[Node[SyntaxKind]] = js.native
  def getDiagnosticRange(diagnosticIndex: Double): js.UndefOr[Range] = js.native
  def getDiagnosticSourceFile(diagnosticIndex: Double): js.UndefOr[SourceFile] = js.native
  def getMessage(diagnosticIndex: Double): String = js.native
  def getMessage(diagnosticIndex: Double, options: AnonDetailed): String = js.native
  def report(pos: Double, message: Diagnostic, args: js.Any*): Unit = js.native
  def reportNode(sourceFile: js.UndefOr[scala.Nothing], node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
  def reportNode(sourceFile: SourceFile, node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
  def setSourceFile(sourceFile: SourceFile): Unit = js.native
  def values(): IterableIterator[js.UndefOr[DiagnosticInfo]] = js.native
}

