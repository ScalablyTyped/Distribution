package typings.jsoneditor.jsoneditorMod

import typings.jsoneditor.Anon_End
import typings.jsoneditor.Anon_EndStart
import typings.jsoneditor.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditor extends js.Object {
  def collapseAll(): Unit = js.native
  def destroy(): Unit = js.native
  def expandAll(): Unit = js.native
  def focus(): Unit = js.native
  def get(): js.Any = js.native
  def getMode(): JSONEditorMode = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNodesByRange(start: Anon_Path, end: Anon_Path): js.Array[SerializableNode] = js.native
  def getSelection(): Anon_End = js.native
  def getText(): String = js.native
  def getTextSelection(): Anon_EndStart = js.native
  def refresh(): Unit = js.native
  def set(json: js.Any): Unit = js.native
  def setMode(mode: JSONEditorMode): Unit = js.native
  def setName(): Unit = js.native
  def setName(name: String): Unit = js.native
  def setSchema(schema: js.Object): Unit = js.native
  def setSchema(schema: js.Object, schemaRefs: js.Object): Unit = js.native
  def setSelection(start: Anon_Path, end: Anon_Path): Unit = js.native
  def setText(jsonString: String): Unit = js.native
  def setTextSelection(start: SelectionPosition, end: SelectionPosition): Unit = js.native
  def update(json: js.Any): Unit = js.native
  def updateText(jsonString: String): Unit = js.native
}

