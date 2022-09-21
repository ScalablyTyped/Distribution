package typings.jestEnvironmentVscodeExtension.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import typings.vscode.mod.Location
import typings.vscode.mod.LocationLink
import typings.vscode.mod.Position
import typings.vscode.mod.Range
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object take {
  
  @JSGlobal("take")
  @js.native
  val ^ : js.Any = js.native
  
  inline def codeActions(uri: Uri, range: Range): js.Promise[StringDictionary[js.Function0[Thenable[Unit]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("codeActions")(uri.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[js.Function0[Thenable[Unit]]]]]
  
  inline def definitions(uri: Uri, position: Position): js.Promise[js.Array[Location | LocationLink]] = (^.asInstanceOf[js.Dynamic].applyDynamic("definitions")(uri.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Location | LocationLink]]]
  
  inline def documentSymbols(uri: Uri): js.Promise[js.Array[SymbolInformation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentSymbols")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SymbolInformation]]]
  
  inline def documentText(uri: Uri): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentText")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def hovers(uri: Uri, position: Position): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("hovers")(uri.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
