package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IntOrString is a type that can hold an int32 or a string.  When used in
  * JSON or YAML marshalling and unmarshalling, it produces or consumes the
  * inner type.  This allows you to have, for example, a JSON field that can
  * accept a name or number.
  */
@js.native
trait SchemaIntOrString extends js.Object {
  /**
    * The int value.
    */
  var intVal: js.UndefOr[Double] = js.native
  /**
    * The string value.
    */
  var strVal: js.UndefOr[String] = js.native
  /**
    * The type of the value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaIntOrString {
  @scala.inline
  def apply(intVal: js.UndefOr[Double] = js.undefined, strVal: String = null, `type`: String = null): SchemaIntOrString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intVal)) __obj.updateDynamic("intVal")(intVal.get.asInstanceOf[js.Any])
    if (strVal != null) __obj.updateDynamic("strVal")(strVal.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntOrString]
  }
}

