package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemProductVariantAttribute extends js.Object {
  /**
    * The dimension of the variant.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The value for the dimension.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemProductVariantAttribute {
  @scala.inline
  def apply(dimension: String = null, value: String = null): SchemaOrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLineItemProductVariantAttribute]
  }
}

