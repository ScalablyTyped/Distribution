package typings
package gtagDotJsLib.GtagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var brand: js.UndefOr[java.lang.String] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var creative_name: js.UndefOr[java.lang.String] = js.undefined
  var creative_slot: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var location_id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[Currency] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    brand: java.lang.String = null,
    category: java.lang.String = null,
    creative_name: java.lang.String = null,
    creative_slot: java.lang.String = null,
    id: java.lang.String = null,
    location_id: java.lang.String = null,
    name: java.lang.String = null,
    price: Currency = null,
    quantity: scala.Int | scala.Double = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (category != null) __obj.updateDynamic("category")(category)
    if (creative_name != null) __obj.updateDynamic("creative_name")(creative_name)
    if (creative_slot != null) __obj.updateDynamic("creative_slot")(creative_slot)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location_id != null) __obj.updateDynamic("location_id")(location_id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

