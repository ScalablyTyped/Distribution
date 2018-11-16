package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditor")
@js.native
class JSONEditor[TValue] protected () extends js.Object {
  def this(element: stdLib.HTMLElement, options: JSONEditorOptions[TValue]) = this()
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def getEditor(name: java.lang.String): JSONEditor[TValue] = js.native
  def getValue(): TValue = js.native
  def isEnabled(): scala.Boolean = js.native
  def off(event: java.lang.String, fn: js.Function): JSONEditor[TValue] = js.native
  def on(event: java.lang.String, fn: js.Function): JSONEditor[TValue] = js.native
  def setValue(value: TValue): scala.Unit = js.native
  def unwatch(event: java.lang.String, fn: js.Function): JSONEditor[TValue] = js.native
  def validate(): js.Array[JSONEditorError] = js.native
  def validate(value: TValue): js.Array[JSONEditorError] = js.native
  def watch(event: java.lang.String, fn: js.Function): JSONEditor[TValue] = js.native
}

@JSGlobal("JSONEditor")
@js.native
object JSONEditor extends js.Object {
  var defaults: jsonDashEditorLib.Anon_Customvalidators = js.native
  var plugins: jsonDashEditorLib.Anon_Ace = js.native
}

