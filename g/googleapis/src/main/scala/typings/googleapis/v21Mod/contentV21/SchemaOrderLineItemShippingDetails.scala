package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemShippingDetails extends js.Object {
  /**
    * The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  /**
    * Details of the shipping method.
    */
  var method: js.UndefOr[SchemaOrderLineItemShippingDetailsMethod] = js.native
  /**
    * The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemShippingDetails {
  @scala.inline
  def apply(
    deliverByDate: String = null,
    method: SchemaOrderLineItemShippingDetailsMethod = null,
    shipByDate: String = null
  ): SchemaOrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetails]
  }
}

