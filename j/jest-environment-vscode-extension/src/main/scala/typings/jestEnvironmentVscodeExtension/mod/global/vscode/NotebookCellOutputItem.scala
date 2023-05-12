package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.NotebookCellOutputItem")
@js.native
open class NotebookCellOutputItem protected ()
  extends typings.vscode.mod.NotebookCellOutputItem {
  /**
  		 * Create a new notebook cell output item.
  		 *
  		 * @param data The value of the output item.
  		 * @param mime The mime type of the output item.
  		 */
  def this(data: js.typedarray.Uint8Array, mime: String) = this()
}
/* static members */
object NotebookCellOutputItem {
  
  @JSGlobal("vscode.NotebookCellOutputItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.error` mime type.
  		 *
  		 * @param value An error object.
  		 * @returns A new output item object.
  		 */
  inline def error(value: js.Error): typings.vscode.mod.NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` from
  		 * a JSON object.
  		 *
  		 * *Note* that this function is not expecting "stringified JSON" but
  		 * an object that can be stringified. This function will throw an error
  		 * when the passed value cannot be JSON-stringified.
  		 *
  		 * @param value A JSON-stringifyable value.
  		 * @param mime Optional MIME type, defaults to `application/json`
  		 * @returns A new output item object.
  		 */
  inline def json(value: Any): typings.vscode.mod.NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  inline def json(value: Any, mime: String): typings.vscode.mod.NotebookCellOutputItem = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.stderr` mime type.
  		 *
  		 * @param value A string.
  		 * @returns A new output item object.
  		 */
  inline def stderr(value: String): typings.vscode.mod.NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("stderr")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.stdout` mime type.
  		 *
  		 * @param value A string.
  		 * @returns A new output item object.
  		 */
  inline def stdout(value: String): typings.vscode.mod.NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("stdout")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` from a string.
  		 *
  		 * *Note* that an UTF-8 encoder is used to create bytes for the string.
  		 *
  		 * @param value A string.
  		 * @param mime Optional MIME type, defaults to `text/plain`.
  		 * @returns A new output item object.
  		 */
  inline def text(value: String): typings.vscode.mod.NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
  inline def text(value: String, mime: String): typings.vscode.mod.NotebookCellOutputItem = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.NotebookCellOutputItem]
}
