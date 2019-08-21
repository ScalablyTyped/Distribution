package typings.intercomDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdat extends js.Object {
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

object Anon_Createdat {
  @scala.inline
  def apply(
    id: String | Double,
    name: String,
    created_at: Int | Double = null,
    industry: String = null,
    monthly_spend: Int | Double = null,
    plan: String = null,
    size: Int | Double = null,
    user_count: Int | Double = null,
    website: String = null
  ): Anon_Createdat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (industry != null) __obj.updateDynamic("industry")(industry)
    if (monthly_spend != null) __obj.updateDynamic("monthly_spend")(monthly_spend.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (user_count != null) __obj.updateDynamic("user_count")(user_count.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Anon_Createdat]
  }
}

