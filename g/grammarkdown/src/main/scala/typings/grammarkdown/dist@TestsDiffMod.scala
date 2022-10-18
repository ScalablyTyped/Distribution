package typings.grammarkdown

import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distDiagnosticsMod.LineMap
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distScannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@TestsDiffMod` {
  
  @JSImport("grammarkdown/dist/@/tests/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareBaseline(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compareBaseline")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def compareBaselines(baselines: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compareBaselines")(baselines.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeBaseline(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBaseline")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def writeBaseline(file: String, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBaseline")(file.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeBaseline(file: String, text: String, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBaseline")(file.asInstanceOf[js.Any], text.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeBaseline(file: String, text: Unit, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBaseline")(file.asInstanceOf[js.Any], text.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeDiagnostics(test: String, diagnostics: DiagnosticMessages): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDiagnostics")(test.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeDiagnostics(test: String, diagnostics: DiagnosticMessages, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDiagnostics")(test.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeNodes(test: String, sourceFile: SourceFile): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNodes")(test.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeNodes(test: String, sourceFile: SourceFile, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNodes")(test.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeOutput(test: String, extname: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOutput")(test.asInstanceOf[js.Any], extname.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeOutput(test: String, extname: String, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOutput")(test.asInstanceOf[js.Any], extname.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeOutput(test: String, extname: String, text: String, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOutput")(test.asInstanceOf[js.Any], extname.asInstanceOf[js.Any], text.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeOutput(test: String, extname: String, text: Unit, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOutput")(test.asInstanceOf[js.Any], extname.asInstanceOf[js.Any], text.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeTokens(test: String, scanner: Scanner, lineMap: LineMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTokens")(test.asInstanceOf[js.Any], scanner.asInstanceOf[js.Any], lineMap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def writeTokens(test: String, scanner: Scanner, lineMap: LineMap, baselines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTokens")(test.asInstanceOf[js.Any], scanner.asInstanceOf[js.Any], lineMap.asInstanceOf[js.Any], baselines.asInstanceOf[js.Any])).asInstanceOf[String]
}
