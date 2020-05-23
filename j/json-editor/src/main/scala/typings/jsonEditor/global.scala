package typings.jsonEditor

import typings.jsonEditor.anon.Ace
import typings.jsonEditor.anon.Customvalidators
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class JSONEditor[TValue] protected ()
    extends typings.jsonEditor.JSONEditor[TValue] {
    def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
  }
  
  /* static members */
  @js.native
  object JSONEditor extends js.Object {
    var defaults: Customvalidators = js.native
    var plugins: Ace = js.native
  }
  
}

