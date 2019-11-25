package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _type: String
  var id: String
  var instruction: String
  var length: Double
  var note: js.Array[String]
  var position: Anon_Latitude
  var shape: js.Array[String]
  var travelTime: Double
}

object Anon_Id {
  @scala.inline
  def apply(
    _type: String,
    id: String,
    instruction: String,
    length: Double,
    note: js.Array[String],
    position: Anon_Latitude,
    shape: js.Array[String],
    travelTime: Double
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

