package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.anon.FormatMessage
import typings.grammarkdown.anon.`0`
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "DiagnosticMessages")
@js.native
class DiagnosticMessages () extends StObject {
  
  var compareDiagnostics: js.Any = js.native
  
  def copyFrom(other: DiagnosticMessages): Unit = js.native
  
  def count(): Double = js.native
  
  var deduplicateDiagnostics: js.Any = js.native
  
  var detailedDiagnosticMessages: js.Any = js.native
  
  var diagnostics: js.Any = js.native
  
  var diagnosticsArguments: js.Any = js.native
  
  var diagnosticsLength: js.Any = js.native
  
  var diagnosticsNode: js.Any = js.native
  
  var diagnosticsPos: js.Any = js.native
  
  def forEach(callback: js.Function2[/* message */ String, /* diagnosticIndex */ Double, Unit]): Unit = js.native
  
  def getDiagnostic(diagnosticIndex: Double): js.UndefOr[Diagnostic] = js.native
  
  def getDiagnosticArguments(diagnosticIndex: Double): js.UndefOr[js.Array[_]] = js.native
  
  var getDiagnosticCode: js.Any = js.native
  
  var getDiagnosticErrorLevel: js.Any = js.native
  
  def getDiagnosticInfo(diagnosticIndex: Double): js.UndefOr[DiagnosticInfo] = js.native
  def getDiagnosticInfo(diagnosticIndex: Double, options: FormatMessage): js.UndefOr[DiagnosticInfo] = js.native
  
  def getDiagnosticInfos(): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfos(options: FormatMessage): js.Array[DiagnosticInfo] = js.native
  
  def getDiagnosticInfosForSourceFile(sourceFile: SourceFile): js.Array[DiagnosticInfo] = js.native
  def getDiagnosticInfosForSourceFile(sourceFile: SourceFile, options: FormatMessage): js.Array[DiagnosticInfo] = js.native
  
  var getDiagnosticLength: js.Any = js.native
  
  def getDiagnosticNode(diagnosticIndex: Double): js.UndefOr[Node2[SyntaxKind]] = js.native
  
  var getDiagnosticPos: js.Any = js.native
  
  def getDiagnosticRange(diagnosticIndex: Double): js.UndefOr[Range2] = js.native
  
  def getDiagnosticSourceFile(diagnosticIndex: Double): js.UndefOr[SourceFile] = js.native
  
  def getMessage(diagnosticIndex: Double): String = js.native
  def getMessage(diagnosticIndex: Double, options: `0`): String = js.native
  
  var getSortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Generator[js.UndefOr[DiagnosticInfo], Unit, _]] = js.native
  
  def report(pos: Double, message: Diagnostic, args: js.Any*): Unit = js.native
  
  var reportDiagnostic: js.Any = js.native
  
  def reportNode(sourceFile: js.UndefOr[scala.Nothing], node: Node2[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
  def reportNode(sourceFile: SourceFile, node: Node2[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
  
  def setSourceFile(sourceFile: SourceFile): Unit = js.native
  
  var simpleDiagnosticMessages: js.Any = js.native
  
  def size: Double = js.native
  
  var sortDiagnostics: js.Any = js.native
  
  var sortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
  
  var sourceFiles: js.Any = js.native
  
  var sourceFilesDiagnosticOffset: js.Any = js.native
  
  def values(): Generator[js.UndefOr[DiagnosticInfo], Unit, _] = js.native
}
