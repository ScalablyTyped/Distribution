package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemShippingDetailsMethod extends js.Object {
  /**
    * The carrier for the shipping. Optional. See shipments[].carrier for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Maximum transit time.
    */
  var maxDaysInTransit: js.UndefOr[Double] = js.native
  /**
    * The name of the shipping method.
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * Minimum transit time.
    */
  var minDaysInTransit: js.UndefOr[Double] = js.native
}

object SchemaOrderLineItemShippingDetailsMethod {
  @scala.inline
  def apply(
    carrier: String = null,
    maxDaysInTransit: js.UndefOr[Double] = js.undefined,
    methodName: String = null,
    minDaysInTransit: js.UndefOr[Double] = js.undefined
  ): SchemaOrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDaysInTransit)) __obj.updateDynamic("maxDaysInTransit")(maxDaysInTransit.get.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (!js.isUndefined(minDaysInTransit)) __obj.updateDynamic("minDaysInTransit")(minDaysInTransit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetailsMethod]
  }
}

