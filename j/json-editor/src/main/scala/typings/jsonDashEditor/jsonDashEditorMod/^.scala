package typings.jsonDashEditor.jsonDashEditorMod

import typings.jsonDashEditor.Anon_Ace
import typings.jsonDashEditor.Anon_Customvalidators
import typings.jsonDashEditor.JSONEditor
import typings.jsonDashEditor.JSONEditorOptions
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
  var defaults: Anon_Customvalidators = js.native
  var plugins: Anon_Ace = js.native
}

