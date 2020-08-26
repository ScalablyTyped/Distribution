package typings.jsoneditor.mod

import typings.ace.AceAjax.Ace
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsoneditor", JSImport.Default)
@js.native
class default protected () extends JSONEditor {
  /**
    * Constructs a new JSONEditor.
    * @param container An HTML DIV element. The JSONEditor will be created inside this container element.
    * @param options Optional object with options.
    * @param json Initial JSON data to be loaded into the JSONEditor. Alternatively, the method JSONEditor.set(json) can be used to load JSON data into the editor.
    * @returns New instance of a JSONEditor.
    */
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: JSONEditorOptions) = this()
  def this(container: HTMLElement, options: js.UndefOr[scala.Nothing], json: js.Any) = this()
  def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
}

/* static members */
@JSImport("jsoneditor", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Access to the bundled ajv library, used for JSON schema validation. Same as `var Ajv = require('ajv');`.
    */
  var Ajv: typings.ajv.mod.Ajv = js.native
  /**
    * An array with the names of all known options.
    */
  var VALID_OPTIONS: js.Array[String] = js.native
  /**
    * Access to the bundled vanilla-picker library, used as color picker. Same as `var VanillaPicker = require('vanilla-picker');`.
    */
  var VanillaPicker: js.Any = js.native
  /**
    * Access to the bundled Ace editor, via the brace library. Ace is used in code mode. Same as `var ace = require('brace');`.
    */
  var ace: Ace = js.native
}

