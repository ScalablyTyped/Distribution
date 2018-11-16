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
  def getName(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  def set(json: js.Object): scala.Unit = js.native
  def setMode(mode: JSONEditorMode): scala.Unit = js.native
  def setName(): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  def setSchema(schema: js.Object): scala.Unit = js.native
  def setText(jsonString: java.lang.String): scala.Unit = js.native
}

