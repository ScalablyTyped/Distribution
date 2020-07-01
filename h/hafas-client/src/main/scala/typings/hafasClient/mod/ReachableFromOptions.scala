package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachableFromOptions extends js.Object {
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  /**
    * maximum travel duration in minutes, pass `null` for infinite
    * @default 20
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /**
    * maximum of transfers
    * @default 5
    */
  var maxTransfers: js.UndefOr[Double] = js.undefined
  /**
    * products
    * @default undefined
    */
  var products: js.UndefOr[Products] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.undefined
}

object ReachableFromOptions {
  @scala.inline
  def apply(
    entrances: js.UndefOr[Boolean] = js.undefined,
    maxDuration: js.UndefOr[Double] = js.undefined,
    maxTransfers: js.UndefOr[Double] = js.undefined,
    products: Products = null,
    subStops: js.UndefOr[Boolean] = js.undefined,
    when: Date = null
  ): ReachableFromOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTransfers)) __obj.updateDynamic("maxTransfers")(maxTransfers.get.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReachableFromOptions]
  }
}

