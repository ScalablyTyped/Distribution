package typings
package intercomDashClientLib.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  val app_id: js.UndefOr[java.lang.String] = js.undefined
  var company_id: js.UndefOr[java.lang.String] = js.undefined
  val created_at: scala.Double
  var custom_attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  val id: java.lang.String
  var industry: js.UndefOr[java.lang.String] = js.undefined
  var monthly_spend: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var plan: js.UndefOr[java.lang.String | intercomDashClientLib.Anon_Id] = js.undefined
  var remote_created_at: js.UndefOr[scala.Double] = js.undefined
  var session_count: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  val `type`: intercomDashClientLib.intercomDashClientLibStrings.company
  val updated_at: scala.Double
  var user_count: js.UndefOr[scala.Double] = js.undefined
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object Company {
  @scala.inline
  def apply(
    created_at: scala.Double,
    id: java.lang.String,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.company,
    updated_at: scala.Double,
    app_id: java.lang.String = null,
    company_id: java.lang.String = null,
    custom_attributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    industry: java.lang.String = null,
    monthly_spend: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    plan: java.lang.String | intercomDashClientLib.Anon_Id = null,
    remote_created_at: scala.Int | scala.Double = null,
    session_count: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    user_count: scala.Int | scala.Double = null,
    website: java.lang.String = null
  ): Company = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, updated_at = updated_at)
    __obj.updateDynamic("type")(`type`)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (company_id != null) __obj.updateDynamic("company_id")(company_id)
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes)
    if (industry != null) __obj.updateDynamic("industry")(industry)
    if (monthly_spend != null) __obj.updateDynamic("monthly_spend")(monthly_spend.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (remote_created_at != null) __obj.updateDynamic("remote_created_at")(remote_created_at.asInstanceOf[js.Any])
    if (session_count != null) __obj.updateDynamic("session_count")(session_count.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (user_count != null) __obj.updateDynamic("user_count")(user_count.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Company]
  }
}

