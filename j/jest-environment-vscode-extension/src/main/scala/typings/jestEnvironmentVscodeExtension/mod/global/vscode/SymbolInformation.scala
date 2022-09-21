package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.SymbolInformation")
@js.native
open class SymbolInformation protected ()
  extends typings.vscode.mod.SymbolInformation {
  /**
    * Creates a new symbol information object.
    *
    * @deprecated Please use the constructor taking a {@link Location} object.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  def this(name: String, kind: typings.vscode.mod.SymbolKind, range: typings.vscode.mod.Range) = this()
  /**
    * Creates a new symbol information object.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param containerName The name of the symbol containing the symbol.
    * @param location The location of the symbol.
    */
  def this(
    name: String,
    kind: typings.vscode.mod.SymbolKind,
    containerName: String,
    location: typings.vscode.mod.Location
  ) = this()
  def this(
    name: String,
    kind: typings.vscode.mod.SymbolKind,
    range: typings.vscode.mod.Range,
    uri: typings.vscode.mod.Uri
  ) = this()
  def this(
    name: String,
    kind: typings.vscode.mod.SymbolKind,
    range: typings.vscode.mod.Range,
    uri: Unit,
    containerName: String
  ) = this()
  def this(
    name: String,
    kind: typings.vscode.mod.SymbolKind,
    range: typings.vscode.mod.Range,
    uri: typings.vscode.mod.Uri,
    containerName: String
  ) = this()
}
