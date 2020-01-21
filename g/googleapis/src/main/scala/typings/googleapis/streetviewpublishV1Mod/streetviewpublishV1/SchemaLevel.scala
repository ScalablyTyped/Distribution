package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Level information containing level number and its corresponding name.
  */
@js.native
trait SchemaLevel extends js.Object {
  /**
    * Required. A name assigned to this Level, restricted to 3 characters.
    * Consider how the elevator buttons would be labeled for this level if
    * there was an elevator.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Floor number, used for ordering. 0 indicates the ground level, 1
    * indicates the first level above ground level, -1 indicates the first
    * level under ground level. Non-integer values are OK.
    */
  var number: js.UndefOr[Double] = js.native
}

object SchemaLevel {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null): SchemaLevel = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLevel]
  }
}

