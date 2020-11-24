package typings.jsonEditor.mod

import typings.jsonEditor.JSONEditor
import typings.jsonEditor.JSONEditorOptions
import typings.jsonEditor.anon.Ace
import typings.jsonEditor.anon.Customvalidators
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected () extends JSONEditor[TValue] {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
}
@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var defaults: Customvalidators = js.native
  
  var plugins: Ace = js.native
}
