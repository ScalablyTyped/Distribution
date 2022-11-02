package typings.jestEnvironmentVscodeExtension.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import typings.vscode.mod.Location
import typings.vscode.mod.LocationLink
import typings.vscode.mod.Position
import typings.vscode.mod.Range
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object take {
  
  @JSGlobal("take")
  @js.native
  val ^ : js.Any = js.native
  
  inline def codeActions(doc: TextDocument, range: Range): js.Promise[StringDictionary[js.Function0[Thenable[Unit]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("codeActions")(doc.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[js.Function0[Thenable[Unit]]]]]
  
  inline def definitions(doc: TextDocument, position: Position): js.Promise[js.Array[Location | LocationLink]] = (^.asInstanceOf[js.Dynamic].applyDynamic("definitions")(doc.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Location | LocationLink]]]
  
  inline def documentSymbols(doc: TextDocument): js.Promise[js.Array[SymbolInformation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentSymbols")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SymbolInformation]]]
  
  inline def documentText(doc: TextDocument): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentText")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def hovers(doc: TextDocument, position: Position): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("hovers")(doc.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
