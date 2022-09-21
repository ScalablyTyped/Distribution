package typings.jsoneditor.mod

import typings.ace.AceAjax.Editor
import typings.jsoneditor.anon.End
import typings.jsoneditor.anon.Path
import typings.jsoneditor.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditor extends StObject {
  
  /**
    * (UNDOCUMENTED)
    * Points to the AceEditor instance for the current JsonEditor instance
    */
  var aceEditor: Editor = js.native
  
  /**
    * Collapse all fields. Only applicable for mode `tree`, `view`, and `form`.
    */
  def collapseAll(): Unit = js.native
  
  /**
    * Destroy the editor. Clean up DOM, event listeners, and web workers.
    */
  def destroy(): Unit = js.native
  
  /**
    * Expand/collapse a given JSON node. Only applicable for mode 'tree', 'view' and 'form'.
    * @param expandParams.path Path for the node to expand / collapse
    * @param expandParams.isExpand Whether to expand the node (else collapse)
    * @param expandParams.recursive Whether to expand/collapse child nodes recursively
    */
  def expand(options: ExpandOptions): Unit = js.native
  
  /**
    * Expand all fields. Only applicable for mode `tree`, `view`, and `form`.
    */
  def expandAll(): Unit = js.native
  
  /**
    * Set focus to the JSONEditor.
    */
  def focus(): Unit = js.native
  
  /**
    * Get JSON data. This method throws an exception when the editor does not contain valid JSON, which can be the case when the editor is in mode `code`, `text`, or `preview`.
    */
  def get(): Any = js.native
  
  /**
    * Retrieve the current mode of the editor.
    */
  def getMode(): JSONEditorMode = js.native
  
  /**
    * Retrieve the current field name of the root node.
    */
  def getName(): js.UndefOr[String] = js.native
  
  /**
    * A utility function for getting a list of SerializableNode under certain range.
    * This function can be used as complementary to `getSelection` and `onSelectionChange` if a list of all the selected nodes is required.
    * @param start Path for the first node in range
    * @param end Path for the last node in range
    */
  def getNodesByRange(start: Path, end: Path): js.Array[SerializableNode] = js.native
  
  /**
    * Get the current selected nodes. Only applicable for mode `tree`.
    */
  def getSelection(): End = js.native
  
  /**
    * Get JSON data as string. Returns the contents of the editor as string. When the editor is in mode `text`, `code` or `preview`, the returned text is returned as-is.
    * For the other modes, the returned text is a compacted string. In order to get the JSON formatted with a certain number of spaces, use `JSON.stringify(JSONEditor.get(), null, 2)`.
    */
  def getText(): String = js.native
  
  /**
    * Get the current selected text with the selection range. Only applicable for mode `text` and `code`.
    */
  def getTextSelection(): Start = js.native
  
  /**
    * Force the editor to refresh the user interface and update all rendered HTML. This can be useful for example when using `onClassName` and the returned class name depends on external factors.
    */
  def refresh(): Unit = js.native
  
  /**
    * Set JSON data. Resets the state of the editor (expanded nodes, search, selection).
    * @see update for more details
    * @param json JSON data to be displayed in the JSONEditor
    */
  def set(json: Any): Unit = js.native
  
  /**
    * Switch mode. Mode `code` requires the Ace editor.
    */
  def setMode(mode: JSONEditorMode): Unit = js.native
  
  /**
    * Set a field name for the root node.
    * @param name Field name of the root node. If undefined, the current name will be removed.
    */
  def setName(): Unit = js.native
  def setName(name: String): Unit = js.native
  
  /**
    * Set a JSON schema for validation of the JSON object. See also option `schema`. See http://json-schema.org/ for more information on the JSON schema definition.
    * @param schema A JSON schema.
    * @param schemaRefs Schemas that are referenced using the `$ref` property from the JSON schema, the object structure in the form of `{ reference_key: schemaObject }`
    */
  def setSchema(schema: js.Object): Unit = js.native
  def setSchema(schema: js.Object, schemaRefs: js.Object): Unit = js.native
  
  /**
    * Set selection for a range of nodes. Only applicable for mode `tree`.
    * - If no parameters sent - the current selection will be removed, if exists.
    * - For single node selection send only the start parameter.
    * - If the nodes are not from the same level the first common parent will be selected.
    * @param start Path for the start node
    * @param end Path for the end node
    */
  def setSelection(start: Path, end: Path): Unit = js.native
  
  /**
    * Set text data in the editor. This method throws an exception when the provided jsonString does not contain valid JSON and the editor is in mode `tree`, `view`, or `form`.
    * @param jsonString Contents of the editor as string.
    */
  def setText(jsonString: String): Unit = js.native
  
  /**
    * Set text selection for a range, Only applicable for mode `text` and `code`.
    * @param start Position for selection start
    * @param end Position for selection end
    */
  def setTextSelection(start: SelectionPosition, end: SelectionPosition): Unit = js.native
  
  /**
    * Replace JSON data when the new data contains changes. In modes `tree`, `form`, and `view`, the state of the editor will be maintained (expanded nodes, search, selection). See also `set`.
    * @param json JSON data to be displayed in the JSONEditor.
    */
  def update(json: Any): Unit = js.native
  
  /**
    * Replace text data when the new data contains changes. In modes `tree`, `form`, and `view`, the state of the editor will be maintained (expanded nodes, search, selection).
    * @see setText for more details
    * @param jsonString Contents of the editor as string.
    */
  def updateText(jsonString: String): Unit = js.native
  
  /**
    * Validate the JSON document against the configured JSON schema or custom validator. See also the `onValidationError` callback.
    * @returns a promise which resolves with the current validation errors, or an empty list when there are no errors.
    */
  def validate(): js.Promise[js.Array[SchemaValidationError | ParseError]] = js.native
}
