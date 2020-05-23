package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var _type: String
  var id: String
  var instruction: String
  var length: Double
  var note: js.Array[String]
  var position: Latitude
  var shape: js.Array[String]
  var travelTime: Double
}

object Id {
  @scala.inline
  def apply(
    _type: String,
    id: String,
    instruction: String,
    length: Double,
    note: js.Array[String],
    position: Latitude,
    shape: js.Array[String],
    travelTime: Double
  ): Id = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

