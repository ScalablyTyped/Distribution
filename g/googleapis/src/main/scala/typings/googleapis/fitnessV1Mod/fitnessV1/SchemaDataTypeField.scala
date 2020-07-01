package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In case of multi-dimensional data (such as an accelerometer with x, y, and
  * z axes) each field represents one dimension. Each data type field has a
  * unique name which identifies it. The field also defines the format of the
  * data (int, float, etc.).  This message is only instantiated in code and not
  * used for wire comms or stored in any way.
  */
@js.native
trait SchemaDataTypeField extends js.Object {
  /**
    * The different supported formats for each field in a data type.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Defines the name and format of data. Unlike data type names, field names
    * are not namespaced, and only need to be unique within the data type.
    */
  var name: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
}

object SchemaDataTypeField {
  @scala.inline
  def apply(format: String = null, name: String = null, optional: js.UndefOr[Boolean] = js.undefined): SchemaDataTypeField = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataTypeField]
  }
}

