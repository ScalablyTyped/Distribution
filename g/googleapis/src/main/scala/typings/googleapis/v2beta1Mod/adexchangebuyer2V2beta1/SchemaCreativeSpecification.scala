package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
@js.native
trait SchemaCreativeSpecification extends js.Object {
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[SchemaAdSize] = js.native
}

object SchemaCreativeSpecification {
  @scala.inline
  def apply(creativeCompanionSizes: js.Array[SchemaAdSize] = null, creativeSize: SchemaAdSize = null): SchemaCreativeSpecification = {
    val __obj = js.Dynamic.literal()
    if (creativeCompanionSizes != null) __obj.updateDynamic("creativeCompanionSizes")(creativeCompanionSizes.asInstanceOf[js.Any])
    if (creativeSize != null) __obj.updateDynamic("creativeSize")(creativeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeSpecification]
  }
}

