package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLoyaltyPoints extends js.Object {
  /**
    * Name of loyalty points program. It is recommended to limit the name to 12
    * full-width characters or 24 Roman characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The retailer&#39;s loyalty points in absolute value.
    */
  var pointsValue: js.UndefOr[String] = js.native
  /**
    * The ratio of a point when converted to currency. Google assumes currency
    * based on Merchant Center settings. If ratio is left out, it defaults
    * to 1.0.
    */
  var ratio: js.UndefOr[Double] = js.native
}

object SchemaLoyaltyPoints {
  @scala.inline
  def apply(): SchemaLoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoyaltyPoints]
  }
  @scala.inline
  implicit class SchemaLoyaltyPointsOps[Self <: SchemaLoyaltyPoints] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPointsValue(value: String): Self = this.set("pointsValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsValue: Self = this.set("pointsValue", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
  
}

