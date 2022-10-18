package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.SnippetTextEdit")
@js.native
open class SnippetTextEdit protected ()
  extends typings.vscode.mod.SnippetTextEdit {
  /**
    * Create a new snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    */
  def this(range: typings.vscode.mod.Range, snippet: typings.vscode.mod.SnippetString) = this()
}
/* static members */
object SnippetTextEdit {
  
  @JSGlobal("vscode.SnippetTextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility to create an insert snippet edit.
    *
    * @param position A position, will become an empty range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def insert(position: typings.vscode.mod.Position, snippet: typings.vscode.mod.SnippetString): typings.vscode.mod.SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.SnippetTextEdit]
  
  /**
    * Utility to create a replace snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def replace(range: typings.vscode.mod.Range, snippet: typings.vscode.mod.SnippetString): typings.vscode.mod.SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.SnippetTextEdit]
}
