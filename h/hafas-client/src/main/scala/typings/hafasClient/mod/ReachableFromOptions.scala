package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReachableFromOptions extends js.Object {
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  /**
    * maximum travel duration in minutes, pass `null` for infinite
    * @default 20
    */
  var maxDuration: js.UndefOr[Double] = js.native
  /**
    * maximum of transfers
    * @default 5
    */
  var maxTransfers: js.UndefOr[Double] = js.native
  /**
    * products
    * @default undefined
    */
  var products: js.UndefOr[Products] = js.native
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.native
}

object ReachableFromOptions {
  @scala.inline
  def apply(): ReachableFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachableFromOptions]
  }
  @scala.inline
  implicit class ReachableFromOptionsOps[Self <: ReachableFromOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    @scala.inline
    def setMaxTransfers(value: Double): Self = this.set("maxTransfers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTransfers: Self = this.set("maxTransfers", js.undefined)
    @scala.inline
    def setProducts(value: Products): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
    @scala.inline
    def setWhen(value: Date): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

