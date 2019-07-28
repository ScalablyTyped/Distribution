package typings.jsoneditor.jsoneditorMod

import typings.ace.AceAjaxNs.Ace
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsoneditor", JSImport.Default)
@js.native
class default protected () extends JSONEditor {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: JSONEditorOptions) = this()
  def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
}

/* static members */
@JSImport("jsoneditor", JSImport.Default)
@js.native
object default extends js.Object {
  var Ajv: typings.ajv.ajvMod.Ajv = js.native
  var VALID_OPTIONS: js.Array[String] = js.native
  var VanillaPicker: js.Any = js.native
  var ace: Ace = js.native
}

