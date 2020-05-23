package typings.jsonEditor.anon

import typings.jsonEditor.JSONEditorObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: JSONEditorObjectOptions
}

object Options {
  @scala.inline
  def apply(options: JSONEditorObjectOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

