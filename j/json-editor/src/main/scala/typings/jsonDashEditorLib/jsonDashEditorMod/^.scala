package typings
package jsonDashEditorLib.jsonDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected ()
  extends jsonDashEditorLib.JSONEditor[TValue] {
  def this(element: stdLib.HTMLElement, options: jsonDashEditorLib.JSONEditorOptions[TValue]) = this()
}

@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: jsonDashEditorLib.Anon_Customvalidators = js.native
  var plugins: jsonDashEditorLib.Anon_Ace = js.native
}

