package typings.jsoneditor

import typings.jsoneditor.jsoneditorStrings.`@`
import typings.jsoneditor.jsoneditorStrings.asc
import typings.jsoneditor.jsoneditorStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: asc | desc
  var field: String | `@`
}

object AnonDirection {
  @scala.inline
  def apply(direction: asc | desc, field: String | `@`): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirection]
  }
}

