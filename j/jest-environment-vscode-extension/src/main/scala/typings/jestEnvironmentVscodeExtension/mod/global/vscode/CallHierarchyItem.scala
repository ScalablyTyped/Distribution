package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CallHierarchyItem")
@js.native
open class CallHierarchyItem protected ()
  extends typings.vscode.mod.CallHierarchyItem {
  /**
    * Creates a new call hierarchy item.
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
