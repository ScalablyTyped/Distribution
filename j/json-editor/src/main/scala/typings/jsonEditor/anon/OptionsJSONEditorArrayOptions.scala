package typings.jsonEditor.anon

import typings.jsonEditor.JSONEditorArrayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsJSONEditorArrayOptions extends js.Object {
  var options: JSONEditorArrayOptions
}

object OptionsJSONEditorArrayOptions {
  @scala.inline
  def apply(options: JSONEditorArrayOptions): OptionsJSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsJSONEditorArrayOptions]
  }
}

