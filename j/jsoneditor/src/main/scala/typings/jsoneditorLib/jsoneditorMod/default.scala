package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsoneditor", JSImport.Default)
@js.native
class default protected () extends JSONEditor {
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, options: JSONEditorOptions) = this()
  def this(container: stdLib.HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
}

/* static members */
@JSImport("jsoneditor", JSImport.Default)
@js.native
object default extends js.Object {
  var Ajv: ajvLib.ajvMod.Ajv = js.native
  var VALID_OPTIONS: js.Array[java.lang.String] = js.native
  var VanillaPicker: js.Any = js.native
  var ace: aceLib.AceAjaxNs.Ace = js.native
}

