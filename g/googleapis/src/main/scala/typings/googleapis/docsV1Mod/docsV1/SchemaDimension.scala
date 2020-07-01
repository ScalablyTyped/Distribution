package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A magnitude in a single direction in the specified units.
  */
@js.native
trait SchemaDimension extends js.Object {
  /**
    * The magnitude.
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * The units for magnitude.
    */
  var unit: js.UndefOr[String] = js.native
}

object SchemaDimension {
  @scala.inline
  def apply(magnitude: js.UndefOr[Double] = js.undefined, unit: String = null): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(magnitude)) __obj.updateDynamic("magnitude")(magnitude.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimension]
  }
}

