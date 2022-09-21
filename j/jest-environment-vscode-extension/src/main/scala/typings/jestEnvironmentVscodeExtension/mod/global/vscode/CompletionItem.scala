package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.CompletionItemLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CompletionItem")
@js.native
open class CompletionItem protected ()
  extends typings.vscode.mod.CompletionItem {
  /**
    * Creates a new completion item.
    *
    * Completion items must have at least a {@link CompletionItem.label label} which then
    * will be used as insert text as well as for sorting and filtering.
    *
    * @param label The label of the completion.
    * @param kind The {@link CompletionItemKind kind} of the completion.
    */
  def this(label: String) = this()
  def this(label: CompletionItemLabel) = this()
  def this(label: String, kind: typings.vscode.mod.CompletionItemKind) = this()
  def this(label: CompletionItemLabel, kind: typings.vscode.mod.CompletionItemKind) = this()
}
