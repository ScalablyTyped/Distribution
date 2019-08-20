package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFrame extends js.Object {
  var data: js.Any
  var description: String
  var id: String
  var size: Double
}

object TagFrame {
  @scala.inline
  def apply(data: js.Any, description: String, id: String, size: Double): TagFrame = {
    val __obj = js.Dynamic.literal(data = data, description = description, id = id, size = size)
  
    __obj.asInstanceOf[TagFrame]
  }
}

