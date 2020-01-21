package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holder object for the value of a single field in a data point.  A field
  * value has a particular format and is only ever set to one of an integer or
  * a floating point value. LINT.IfChange
  */
@js.native
trait SchemaValue extends js.Object {
  /**
    * Floating point value. When this is set, other values must not be set.
    */
  var fpVal: js.UndefOr[Double] = js.native
  /**
    * Integer value. When this is set, other values must not be set.
    */
  var intVal: js.UndefOr[Double] = js.native
  /**
    * Map value. The valid key space and units for the corresponding value of
    * each entry should be documented as part of the data type definition. Keys
    * should be kept small whenever possible. Data streams with large keys and
    * high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[SchemaValueMapValEntry]] = js.native
  /**
    * String value. When this is set, other values must not be set. Strings
    * should be kept small whenever possible. Data streams with large string
    * values and high data frequency may be down sampled.
    */
  var stringVal: js.UndefOr[String] = js.native
}

object SchemaValue {
  @scala.inline
  def apply(
    fpVal: Int | Double = null,
    intVal: Int | Double = null,
    mapVal: js.Array[SchemaValueMapValEntry] = null,
    stringVal: String = null
  ): SchemaValue = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    if (intVal != null) __obj.updateDynamic("intVal")(intVal.asInstanceOf[js.Any])
    if (mapVal != null) __obj.updateDynamic("mapVal")(mapVal.asInstanceOf[js.Any])
    if (stringVal != null) __obj.updateDynamic("stringVal")(stringVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValue]
  }
}

