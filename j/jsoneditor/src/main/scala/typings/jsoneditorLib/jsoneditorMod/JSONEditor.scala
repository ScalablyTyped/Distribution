package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditor extends js.Object {
  def collapseAll(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def get(): js.Any = js.native
  def getMode(): JSONEditorMode = js.native
  def getName(): js.UndefOr[java.lang.String] = js.native
  def getNodesByRange(start: jsoneditorLib.Anon_Path, end: jsoneditorLib.Anon_Path): js.Array[SerializableNode] = js.native
  def getSelection(): jsoneditorLib.Anon_End = js.native
  def getText(): java.lang.String = js.native
  def getTextSelection(): jsoneditorLib.Anon_EndStart = js.native
  def refresh(): scala.Unit = js.native
  def set(json: js.Any): scala.Unit = js.native
  def setMode(mode: JSONEditorMode): scala.Unit = js.native
  def setName(): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  def setSchema(schema: js.Object): scala.Unit = js.native
  def setSchema(schema: js.Object, schemaRefs: js.Object): scala.Unit = js.native
  def setSelection(start: jsoneditorLib.Anon_Path, end: jsoneditorLib.Anon_Path): scala.Unit = js.native
  def setText(jsonString: java.lang.String): scala.Unit = js.native
  def setTextSelection(start: SelectionPosition, end: SelectionPosition): scala.Unit = js.native
  def update(json: js.Any): scala.Unit = js.native
  def updateText(jsonString: java.lang.String): scala.Unit = js.native
}

