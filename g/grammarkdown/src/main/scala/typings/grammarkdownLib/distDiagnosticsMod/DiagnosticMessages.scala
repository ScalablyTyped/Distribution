package typings
package grammarkdownLib.distDiagnosticsMod

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
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[stdLib.IterableIterator[js.UndefOr[DiagnosticInfo]]] = js.native
  var reportDiagnostic: js.Any = js.native
  var simpleDiagnosticMessages: js.Any = js.native
  val size: scala.Double = js.native
  var sortDiagnostics: js.Any = js.native
  var sortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
  var sourceFiles: js.Any = js.native
  var sourceFilesDiagnosticOffset: js.Any = js.native
  def copyFrom(other: DiagnosticMessages): scala.Unit = js.native
  def count(): scala.Double = js.native
  def forEach(
    callback: js.Function2[/* message */ java.lang.String, /* diagnosticIndex */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getDiagnostic(diagnosticIndex: scala.Double): js.UndefOr[Diagnostic] = js.native
  def getDiagnosticArguments(diagnosticIndex: scala.Double): js.UndefOr[js.Array[_]] = js.native
  def getDiagnosticInfo(diagnosticIndex: scala.Double): js.UndefOr[DiagnosticInfo] = js.native
  def getDiagnosticInfo(diagnosticIndex: scala.Double, options: grammarkdownLib.Anon_FormatMessage): js.UndefOr[DiagnosticInfo] = js.native
  def getDiagnosticInfos(): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfos(options: grammarkdownLib.Anon_FormatMessage): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfosForSourceFile(sourceFile: grammarkdownLib.distNodesMod.SourceFile): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfosForSourceFile(sourceFile: grammarkdownLib.distNodesMod.SourceFile, options: grammarkdownLib.Anon_FormatMessage): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticNode(diagnosticIndex: scala.Double): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getDiagnosticRange(diagnosticIndex: scala.Double): js.UndefOr[grammarkdownLib.distCoreMod.Range] = js.native
  def getDiagnosticSourceFile(diagnosticIndex: scala.Double): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def getMessage(diagnosticIndex: scala.Double): java.lang.String = js.native
  def getMessage(diagnosticIndex: scala.Double, options: grammarkdownLib.Anon_Detailed): java.lang.String = js.native
  def report(pos: scala.Double, message: Diagnostic, args: js.Any*): scala.Unit = js.native
  def reportNode(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    message: Diagnostic,
    args: js.Any*
  ): scala.Unit = js.native
  def reportNode(
    sourceFile: js.UndefOr[scala.Nothing],
    node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    message: Diagnostic,
    args: js.Any*
  ): scala.Unit = js.native
  def setSourceFile(sourceFile: grammarkdownLib.distNodesMod.SourceFile): scala.Unit = js.native
  def values(): stdLib.IterableIterator[js.UndefOr[DiagnosticInfo]] = js.native
}

