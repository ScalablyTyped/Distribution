package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomAttribute extends js.Object {
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the attribute.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Free-form unit of the attribute. Unit can only be used for values of type
    * int, float, or price.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomAttribute {
  @scala.inline
  def apply(name: String = null, `type`: String = null, unit: String = null, value: String = null): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
}

