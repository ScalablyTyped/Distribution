package typings.jsonEditor.mod

import typings.jsonEditor.AnonAce
import typings.jsonEditor.AnonCustomvalidators
import typings.jsonEditor.JSONEditor
import typings.jsonEditor.JSONEditorOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected () extends JSONEditor[TValue] {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
}

@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: AnonCustomvalidators = js.native
  var plugins: AnonAce = js.native
}

