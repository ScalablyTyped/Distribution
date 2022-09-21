package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.DocumentSymbol")
@js.native
open class DocumentSymbol protected ()
  extends typings.vscode.mod.DocumentSymbol {
  /**
    * Creates a new document symbol.
    *
    * @param name The name of the symbol.
    * @param detail Details for the symbol.
    * @param kind The kind of the symbol.
    * @param range The full range of the symbol.
    * @param selectionRange The range that should be reveal.
    */
  def this(
    name: String,
    detail: String,
    kind: typings.vscode.mod.SymbolKind,
    range: typings.vscode.mod.Range,
    selectionRange: typings.vscode.mod.Range
  ) = this()
}
