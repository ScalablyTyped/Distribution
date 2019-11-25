package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorNodeType extends js.Object {
  var className: String
  var title: String
  var value: String
}

object JSONEditorNodeType {
  @scala.inline
  def apply(className: String, title: String, value: String): JSONEditorNodeType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONEditorNodeType]
  }
}

