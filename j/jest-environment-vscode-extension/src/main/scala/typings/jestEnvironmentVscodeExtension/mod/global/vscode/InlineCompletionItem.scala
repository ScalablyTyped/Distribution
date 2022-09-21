package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.InlineCompletionItem")
@js.native
open class InlineCompletionItem protected ()
  extends typings.vscode.mod.InlineCompletionItem {
  /**
    * Creates a new inline completion item.
    *
    * @param insertText The text to replace the range with.
    * @param range The range to replace. If not set, the word at the requested position will be used.
    * @param command An optional {@link Command} that is executed *after* inserting this completion.
    */
  def this(insertText: String) = this()
  def this(insertText: typings.vscode.mod.SnippetString) = this()
  def this(insertText: String, range: typings.vscode.mod.Range) = this()
  def this(insertText: typings.vscode.mod.SnippetString, range: typings.vscode.mod.Range) = this()
  def this(insertText: String, range: Unit, command: Command) = this()
  def this(insertText: String, range: typings.vscode.mod.Range, command: Command) = this()
  def this(insertText: typings.vscode.mod.SnippetString, range: Unit, command: Command) = this()
  def this(insertText: typings.vscode.mod.SnippetString, range: typings.vscode.mod.Range, command: Command) = this()
}
