package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CodeAction")
@js.native
open class CodeAction protected ()
  extends typings.vscode.mod.CodeAction {
  /**
  		 * Creates a new code action.
  		 *
  		 * A code action must have at least a {@link CodeAction.title title} and {@link CodeAction.edit edits}
  		 * and/or a {@link CodeAction.command command}.
  		 *
  		 * @param title The title of the code action.
  		 * @param kind The kind of the code action.
  		 */
  def this(title: String) = this()
  def this(title: String, kind: typings.vscode.mod.CodeActionKind) = this()
}
