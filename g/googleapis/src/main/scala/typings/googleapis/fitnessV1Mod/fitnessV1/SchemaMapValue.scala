package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holder object for the value of an entry in a map field of a data point.  A
  * map value supports a subset of the formats that the regular Value supports.
  */
@js.native
trait SchemaMapValue extends js.Object {
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double] = js.native
}

object SchemaMapValue {
  @scala.inline
  def apply(fpVal: Int | Double = null): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMapValue]
  }
}

