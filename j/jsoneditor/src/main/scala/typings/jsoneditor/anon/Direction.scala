package typings.jsoneditor.anon

import typings.jsoneditor.jsoneditorStrings.`@`
import typings.jsoneditor.jsoneditorStrings.asc
import typings.jsoneditor.jsoneditorStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: asc | desc
  var field: String | `@`
}

object Direction {
  @scala.inline
  def apply(direction: asc | desc, field: String | `@`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

