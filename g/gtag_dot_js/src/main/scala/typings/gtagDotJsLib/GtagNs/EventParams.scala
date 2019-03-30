package typings
package gtagDotJsLib.GtagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParams extends js.Object {
  var checkout_option: js.UndefOr[java.lang.String] = js.undefined
  var checkout_step: js.UndefOr[scala.Double] = js.undefined
  var content_id: js.UndefOr[java.lang.String] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var event_category: java.lang.String
  var event_label: js.UndefOr[java.lang.String] = js.undefined
  var fatal: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var screen_name: js.UndefOr[java.lang.String] = js.undefined
  var search_term: js.UndefOr[java.lang.String] = js.undefined
  var shipping: js.UndefOr[Currency] = js.undefined
  var tax: js.UndefOr[Currency] = js.undefined
  var transaction_id: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object EventParams {
  @scala.inline
  def apply(
    event_category: java.lang.String,
    checkout_option: java.lang.String = null,
    checkout_step: scala.Int | scala.Double = null,
    content_id: java.lang.String = null,
    content_type: java.lang.String = null,
    coupon: java.lang.String = null,
    currency: java.lang.String = null,
    description: java.lang.String = null,
    event_label: java.lang.String = null,
    fatal: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[Item] = null,
    method: java.lang.String = null,
    number: java.lang.String = null,
    promotions: js.Array[Promotion] = null,
    screen_name: java.lang.String = null,
    search_term: java.lang.String = null,
    shipping: Currency = null,
    tax: Currency = null,
    transaction_id: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): EventParams = {
    val __obj = js.Dynamic.literal(event_category = event_category)
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option)
    if (checkout_step != null) __obj.updateDynamic("checkout_step")(checkout_step.asInstanceOf[js.Any])
    if (content_id != null) __obj.updateDynamic("content_id")(content_id)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (description != null) __obj.updateDynamic("description")(description)
    if (event_label != null) __obj.updateDynamic("event_label")(event_label)
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal)
    if (items != null) __obj.updateDynamic("items")(items)
    if (method != null) __obj.updateDynamic("method")(method)
    if (number != null) __obj.updateDynamic("number")(number)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name)
    if (search_term != null) __obj.updateDynamic("search_term")(search_term)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
}

