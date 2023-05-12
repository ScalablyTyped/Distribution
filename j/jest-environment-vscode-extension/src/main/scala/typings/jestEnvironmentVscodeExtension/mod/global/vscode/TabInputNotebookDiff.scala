package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TabInputNotebookDiff")
@js.native
open class TabInputNotebookDiff protected ()
  extends typings.vscode.mod.TabInputNotebookDiff {
  /**
  		 * Constructs a notebook diff tab input.
  		 * @param original The uri of the original unmodified notebook.
  		 * @param modified The uri of the modified notebook.
  		 * @param notebookType The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
  		 */
  def this(original: typings.vscode.mod.Uri, modified: typings.vscode.mod.Uri, notebookType: String) = this()
}
