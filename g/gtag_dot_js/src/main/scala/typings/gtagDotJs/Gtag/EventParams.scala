package typings.gtagDotJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParams extends js.Object {
  var checkout_option: js.UndefOr[String] = js.undefined
  var checkout_step: js.UndefOr[Double] = js.undefined
  var content_id: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var event_category: js.UndefOr[String] = js.undefined
  var event_label: js.UndefOr[String] = js.undefined
  var fatal: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var screen_name: js.UndefOr[String] = js.undefined
  var search_term: js.UndefOr[String] = js.undefined
  var shipping: js.UndefOr[Currency] = js.undefined
  var tax: js.UndefOr[Currency] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object EventParams {
  @scala.inline
  def apply(
    checkout_option: String = null,
    checkout_step: Int | Double = null,
    content_id: String = null,
    content_type: String = null,
    coupon: String = null,
    currency: String = null,
    description: String = null,
    event_category: String = null,
    event_label: String = null,
    fatal: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[Item] = null,
    method: String = null,
    number: String = null,
    promotions: js.Array[Promotion] = null,
    screen_name: String = null,
    search_term: String = null,
    shipping: Currency = null,
    tax: Currency = null,
    transaction_id: String = null,
    value: Int | Double = null
  ): EventParams = {
    val __obj = js.Dynamic.literal()
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option.asInstanceOf[js.Any])
    if (checkout_step != null) __obj.updateDynamic("checkout_step")(checkout_step.asInstanceOf[js.Any])
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (event_category != null) __obj.updateDynamic("event_category")(event_category.asInstanceOf[js.Any])
    if (event_label != null) __obj.updateDynamic("event_label")(event_label.asInstanceOf[js.Any])
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name.asInstanceOf[js.Any])
    if (search_term != null) __obj.updateDynamic("search_term")(search_term.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
}

