package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _type: java.lang.String
  var id: java.lang.String
  var instruction: java.lang.String
  var length: scala.Double
  var note: js.Array[java.lang.String]
  var position: Anon_Latitude
  var shape: js.Array[java.lang.String]
  var travelTime: scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(
    _type: java.lang.String,
    id: java.lang.String,
    instruction: java.lang.String,
    length: scala.Double,
    note: js.Array[java.lang.String],
    position: Anon_Latitude,
    shape: js.Array[java.lang.String],
    travelTime: scala.Double
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("instruction")(instruction)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("note")(note)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("shape")(shape)
    __obj.updateDynamic("travelTime")(travelTime)
    __obj.asInstanceOf[Anon_Id]
  }
}

