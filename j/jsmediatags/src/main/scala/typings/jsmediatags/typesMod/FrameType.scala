package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameType extends js.Object {
  var data: js.Any
  var description: String
  var id: String
}

object FrameType {
  @scala.inline
  def apply(data: js.Any, description: String, id: String): FrameType = {
    val __obj = js.Dynamic.literal(data = data, description = description, id = id)
  
    __obj.asInstanceOf[FrameType]
  }
}

