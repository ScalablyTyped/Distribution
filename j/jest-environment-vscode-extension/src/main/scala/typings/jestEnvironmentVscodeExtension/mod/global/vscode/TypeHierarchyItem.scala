package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TypeHierarchyItem")
@js.native
open class TypeHierarchyItem protected ()
  extends typings.vscode.mod.TypeHierarchyItem {
  /**
  		 * Creates a new type hierarchy item.
  		 *
  		 * @param kind The kind of the item.
  		 * @param name The name of the item.
  		 * @param detail The details of the item.
  		 * @param uri The Uri of the item.
  		 * @param range The whole range of the item.
  		 * @param selectionRange The selection range of the item.
  		 */
  def this(
    kind: typings.vscode.mod.SymbolKind,
    name: String,
    detail: String,
    uri: typings.vscode.mod.Uri,
    range: typings.vscode.mod.Range,
    selectionRange: typings.vscode.mod.Range
  ) = this()
}
