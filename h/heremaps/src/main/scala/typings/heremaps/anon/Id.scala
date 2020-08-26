package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var _type: String = js.native
  var id: String = js.native
  var instruction: String = js.native
  var length: Double = js.native
  var note: js.Array[String] = js.native
  var position: Latitude = js.native
  var shape: js.Array[String] = js.native
  var travelTime: Double = js.native
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
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoteVarargs(value: String*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[String]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Latitude): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: String*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[String]): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setTravelTime(value: Double): Self = this.set("travelTime", value.asInstanceOf[js.Any])
  }
  
}

