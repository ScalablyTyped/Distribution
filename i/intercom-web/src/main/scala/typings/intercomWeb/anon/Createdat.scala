package typings.intercomWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Createdat extends js.Object {
  var created_at: js.UndefOr[Double] = js.undefined
  var id: String | Double
  var industry: js.UndefOr[String] = js.undefined
  var monthly_spend: js.UndefOr[Double] = js.undefined
  var name: String
  var plan: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var user_count: js.UndefOr[Double] = js.undefined
  var website: js.UndefOr[String] = js.undefined
}

object Createdat {
  @scala.inline
  def apply(
    id: String | Double,
    name: String,
    created_at: js.UndefOr[Double] = js.undefined,
    industry: String = null,
    monthly_spend: js.UndefOr[Double] = js.undefined,
    plan: String = null,
    size: js.UndefOr[Double] = js.undefined,
    user_count: js.UndefOr[Double] = js.undefined,
    website: String = null
  ): Createdat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(created_at)) __obj.updateDynamic("created_at")(created_at.get.asInstanceOf[js.Any])
    if (industry != null) __obj.updateDynamic("industry")(industry.asInstanceOf[js.Any])
    if (!js.isUndefined(monthly_spend)) __obj.updateDynamic("monthly_spend")(monthly_spend.get.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(user_count)) __obj.updateDynamic("user_count")(user_count.get.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
}

